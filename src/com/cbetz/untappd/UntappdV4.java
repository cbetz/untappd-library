package com.cbetz.untappd;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import android.util.Log;

import com.cbetz.untappd.exceptions.UntappdCredentialsException;
import com.cbetz.untappd.exceptions.UntappdException;
import com.cbetz.untappd.parsers.BeerInfoParser;
import com.cbetz.untappd.parsers.BeerListParser;
import com.cbetz.untappd.parsers.CheckinDetailsParser;
import com.cbetz.untappd.parsers.CheckinParser;
import com.cbetz.untappd.parsers.UserCheckinParser;
import com.cbetz.untappd.parsers.UserInfoParser;
import com.cbetz.untappd.types.Beer;
import com.cbetz.untappd.types.Checkin;
import com.cbetz.untappd.types.CheckinDetails;
import com.cbetz.untappd.types.User;
import com.cbetz.untappd.types.UserCheckin;

public class UntappdV4 {
	private static final String API_ENDPOINT = "http://api.untappd.com/v3";
	private static final String BEER_CHECKIN = "/checkin";	
	private static final String BEER_INFO = "/beer_info";
	private static final String BEER_SEARCH = "/beer_search";
	private static final String CHECKIN_DETAILS = "/details";
	private static final String FRIEND_FEED = "/feed";
	private static final String USER_INFO = "/user";
	private static final String WISHLIST = "/wish_list";
	private static final String WISHLIST_ADD = "/add_to_wish";
	private static final String WISHLIST_REMOVE = "/remove_from_wish";
	private String key;
	private String username;
	private String password;
	
	public UntappdV4(String key, String username, String password) {
		setUsername(username);
		setPassword(password);
		setKey(key);
	}
	
	public Beer[] beerSearch(String q, String sort) throws UntappdException {
		Beer beer = null;
		JSONArray array = new JSONArray();
		
		try {
			JSONObject object = getResponse(BEER_SEARCH + "?key=" + key + "&q=" + URLEncoder.encode(q) + "&sort=" + sort);
			array = object.getJSONArray("results");
		} catch (JSONException e1) {
			Log.e("beerSearch", e1.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		
		Beer[] beers = new Beer[array.length()];
		
		for (int i=0; i<array.length(); ++i){
			try {
				beer = new BeerListParser().parse(array.getJSONObject(i));
			} catch (JSONException e2) {
				Log.e("beerSearch", e2.getStackTrace().toString());
			}
			beers[i] = beer;
		}
		return beers;
	}
	
	public Beer beerInfo(String bid) throws UntappdException {
		Beer beer = null;
		
		try {
			JSONObject object = getResponse(BEER_INFO + "?key=" + key + "&bid=" + bid);
			beer = new BeerInfoParser().parse(object.getJSONObject("results"));
		} catch (JSONException e) {
			Log.e("beerInfo", e.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		
		return beer;
	}
	
	public Checkin beerCheckin(String bid, String timezone, String shout, String rating, String twitter, String facebook) throws UntappdException {
		Checkin checkin = null;
		
		try {		
			JSONObject object = postResponse(BEER_CHECKIN + "?key=" + key, 
					new BasicNameValuePair("bid", bid),
					new BasicNameValuePair("gmt_offset", timezone),
					new BasicNameValuePair("shout", shout),
					new BasicNameValuePair("rating_value", rating),
					new BasicNameValuePair("twitter", twitter),
					new BasicNameValuePair("facebook", facebook));
			checkin = new CheckinParser().parse(object);		
		} catch (JSONException e) {
			Log.e("beerCheckin", e.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		return checkin;
	}
	
	public Checkin beerCheckin(String bid, String timezone, String shout, String rating, String twitter, String facebook, String foursquareId, String lat, String lng, String foursquare) throws UntappdException {
		Checkin checkin = null;
		
		try {
			JSONObject object = postResponse(BEER_CHECKIN + "?key=" + key, 
					new BasicNameValuePair("bid", bid),
					new BasicNameValuePair("gmt_offset", timezone),
					new BasicNameValuePair("shout", shout),
					new BasicNameValuePair("rating_value", rating),
					new BasicNameValuePair("twitter", twitter),
					new BasicNameValuePair("facebook", facebook),
					new BasicNameValuePair("user_lat", lat),
					new BasicNameValuePair("user_lng", lng),
					new BasicNameValuePair("foursquare_id", foursquareId),
					new BasicNameValuePair("foursquare", foursquare));
			checkin = new CheckinParser().parse(object);
		} catch (JSONException e) {
			Log.e("beerCheckin", e.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		return checkin;
	}
	
	public UserCheckin[] getFriendFeed() throws UntappdException {
		JSONArray array = new JSONArray();
		
		try {
			JSONObject object = getResponse(FRIEND_FEED + "?key=" + key);
			array = object.getJSONArray("results");
		} catch (JSONException e1) {
			Log.e("userCheckin", e1.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
			
		UserCheckin[] userCheckins = new UserCheckin[array.length()];
		UserCheckin userCheckin = null;
		
		for (int i=0; i<array.length(); ++i){
			try {
				userCheckin = new UserCheckinParser().parse(array.getJSONObject(i));
			} catch (JSONException e2) {
				Log.e("beerSearch", e2.getStackTrace().toString());
			}
			userCheckins[i] = userCheckin;
		}
		
		
		return userCheckins;
	}
	
	public Beer[] getWishlist() throws UntappdException {
		Beer beer = null;
		JSONArray array = new JSONArray();
		
		try {
			JSONObject object = getResponse(WISHLIST + "?key=" + key);
			array = object.getJSONArray("results");
		} catch (JSONException e1) {
			Log.e("beerSearch", e1.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		
		Beer[] beers = new Beer[array.length()];
		
		for (int i=0; i<array.length(); ++i){
			try {
				beer = new BeerListParser().parse(array.getJSONObject(i));
			} catch (JSONException e2) {
				Log.e("beerSearch", e2.getStackTrace().toString());
			}
			beers[i] = beer;
		}
		return beers;
	}
	
	public boolean wishlistAdd(String bid) throws UntappdException {
		try {
			postResponse(WISHLIST_ADD + "?key=" + key, 
					new BasicNameValuePair("bid", bid));
			return true;
		} catch (UntappdException ue) {
			throw ue;
		}
	}
	
	public boolean wishlistRemove(String bid) throws UntappdException {
		try {
			postResponse(WISHLIST_REMOVE + "?key=" + key, 
					new BasicNameValuePair("bid", bid));
			return true;
		} catch (UntappdException ue) {
			throw ue;
		}
	}
	
	public User userInfo() throws UntappdException {
		User user = null;
		
		try {
			JSONObject object = postResponse(USER_INFO + "?key=" + key);
			if (object.getJSONObject("results") != null) {
				user = new UserInfoParser().parse(object.getJSONObject("results").getJSONObject("user"));
			}
		} catch (JSONException e) {
			Log.e("userInfo", e.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		
		return user;
	}
	
	public CheckinDetails getCheckinDetails() throws UntappdException {
		CheckinDetails checkinDetails = null;
		
		try {
			JSONObject object = postResponse(CHECKIN_DETAILS + "?key=" + key);
			if (object.getJSONObject("results") != null) {
				checkinDetails = new CheckinDetailsParser().parse(object.getJSONObject("results"));
			}
		} catch (JSONException e) {
			Log.e("userInfo", e.getStackTrace().toString());
		} catch (UntappdException ue) {
			throw ue;
		}
		
		return checkinDetails;
	}
	
	private JSONObject getResponse(String url) throws UntappdException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpResponse httpresponse;
		JSONObject object = null;
		try {
			HttpGet httpget = new HttpGet(API_ENDPOINT + url);
			
			httpresponse = httpclient.execute(httpget);
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpresponse.getEntity().getContent(), "UTF-8"));
			StringBuilder builder = new StringBuilder();
			for (String line = null; (line = reader.readLine()) != null;) {
				builder.append(line).append("\n");
			}
			JSONTokener tokener = new JSONTokener(builder.toString());
			object = new JSONObject(tokener);
			if (object.getInt("http_code") == 401) {
				throw new UntappdCredentialsException(object.getString("error"));
			} else if (object.getInt("http_code") != 200) {
				throw new UntappdException(object.getString("error"));
			}
			return object;
		} catch (ClientProtocolException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} catch (IOException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} catch (JSONException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} 
		
		return object;
	}
	
	private JSONObject postResponse(String url, NameValuePair...nameValuePairs) throws UntappdException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(API_ENDPOINT + url);
		HttpResponse httpresponse;
		JSONObject object = null;
		
		try {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			for (int i = 0; i < nameValuePairs.length; i++) {
				NameValuePair param = nameValuePairs[i];
				if (param.getValue() != null) {
					params.add(param);
				}
			}
			httppost.setEntity(new UrlEncodedFormEntity(params));
			
			httpresponse = httpclient.execute(httppost);
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpresponse.getEntity().getContent(), "UTF-8"));
			StringBuilder builder = new StringBuilder();
			for (String line = null; (line = reader.readLine()) != null;) {
				builder.append(line).append("\n");
			}
			JSONTokener tokener = new JSONTokener(builder.toString());
			object = new JSONObject(tokener);
			if (object.getInt("http_code") == 401) {
				throw new UntappdCredentialsException(object.getString("error"));
			} else if (object.getInt("http_code") != 200) {
				throw new UntappdException(object.getString("error"));
			}
			return object;
		} catch (ClientProtocolException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} catch (IOException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} catch (JSONException e) {
			Log.e("getResponse", e.getStackTrace().toString());
		} 
		
		return object;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}	
}
