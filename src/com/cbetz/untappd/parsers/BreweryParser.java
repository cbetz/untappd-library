package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Brewery;

public class BreweryParser {
	public Brewery parse(JSONObject obj) throws JSONException {
		Brewery brewery = new Brewery();
		
		if (obj.has("brewery_id"))
			brewery.setId(obj.getInt("brewery_id"));
		if (obj.has("brewery_name"))
			brewery.setName(obj.getString("brewery_name"));
		if (obj.has("brewery_label"))
			brewery.setLabel(obj.getString("brewery_label"));
		if (obj.has("country_name"))
			brewery.setCountryName(obj.getString("country_name"));
		if (obj.has("contact"))
			brewery.setContact(new ContactParser().parse(obj.getJSONObject("contact")));
		if (obj.has("location"))
			brewery.setLocation(new LocationParser().parse(obj.getJSONObject("location")));
		
		return brewery;
	}

	public static class ContactParser {
		public Brewery.Contact parse(JSONObject obj) throws JSONException {
			Brewery.Contact contact = new Brewery.Contact();
			
			if (obj.has("twitter"))
				contact.setTwitter(obj.getString("twitter"));
			if (obj.has("facebook"))
				contact.setFacebook(obj.getString("facebook"));
			if (obj.has("url"))
				contact.setUrl(obj.getString("url"));
			
			return contact;
		}
	}
	
	public static class LocationParser {
		public Brewery.Location parse(JSONObject obj) throws JSONException {
			Brewery.Location location = new Brewery.Location();
			
			if (obj.has("brewery_city"))
				location.setCity(obj.getString("brewery_city"));
			if (obj.has("brewery_state"))
				location.setState(obj.getString("brewery_state"));
			if (obj.has("lat"))
				location.setLat(obj.getDouble("lat"));
			if (obj.has("lng"))
				location.setLng(obj.getDouble("lng"));
			
			return location;
		}
	}
}
