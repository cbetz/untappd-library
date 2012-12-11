package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.User;

public class UserParser {
	public User parse(JSONObject obj) throws JSONException {
		User user = new User();
		
		if (obj.has("id"))
			user.setId(obj.getInt("id"));
		if (obj.has("user_name"))
			user.setUserName(obj.getString("user_name"));
		if (obj.has("first_name"))
			user.setFirstName(obj.getString("first_name"));
		if (obj.has("last_name"))
			user.setLastName(obj.getString("last_name"));
		if (obj.has("user_avatar"))
			user.setAvatar(obj.getString("user_avatar"));
		if (obj.has("is_private"))
			user.setIsPrivate(obj.getInt("is_private"));
		if (obj.has("location"))
			user.setLocation(obj.getString("location"));
		if (obj.has("url"))
			user.setUrl(obj.getString("url"));
		if (obj.has("bio"))
			user.setBio(obj.getString("bio"));
		if (obj.has("relationship"))
			user.setRelationship(obj.getString("relationship"));
		if (obj.has("untappd_url"))
			user.setUntappdUrl(obj.getString("untappd_url"));
		if (obj.has("account_type"))
			user.setAccountType(obj.getString("account_type"));
		if (obj.has("date_joined"))
			user.setDateJoined(obj.getString("date_joined"));
		if (obj.has("contact"))
			if (obj.optJSONObject("contact") != null)
				user.setContact(new ContactParser().parse(obj.getJSONObject("contact")));
		if (obj.has("stats"))
			user.setStats(new StatsParser().parse(obj.getJSONObject("stats")));
		
		return user;
	}
	
	public static class ContactParser {
		public User.Contact parse(JSONObject obj) throws JSONException {
			User.Contact contact = new User.Contact();
			
			if (obj.has("twitter"))
				contact.setTwitter(obj.getString("twitter"));
			if (obj.has("facebook"))
				contact.setFacebook(obj.getInt("facebook"));
			if (obj.has("foursquare"))
				contact.setFoursquare(obj.getInt("foursquare"));
			
			return contact;
		}
	}
	
	public static class StatsParser {
		public User.Stats parse(JSONObject obj) throws JSONException {
			User.Stats stats = new User.Stats();
			
			if (obj.has("total_badges"))
				stats.setTotalBadges(obj.getInt("total_badges"));
			if (obj.has("total_friends"))
				stats.setTotalFriends(obj.getInt("total_friends"));
			if (obj.has("total_checkins"))
				stats.setTotalCheckins(obj.getInt("total_checkins"));
			if (obj.has("total_beers"))
				stats.setTotalBeers(obj.getInt("total_beers"));
			if (obj.has("total_created_beers"))
				stats.setTotalCreatedBeers(obj.getInt("total_created_beers"));
			
			return stats;			
		}
	}
}
