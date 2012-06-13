package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.UserCheckin;

public class UserCheckinParser {
	public UserCheckin parse(JSONObject json) throws JSONException {		
		UserCheckin userCheckin = new UserCheckin(
				json.getJSONObject("user").getInt("uid"),
				json.getJSONObject("user").getString("user_name"),
				json.getJSONObject("user").getString("user_avatar"),
				json.getInt("beer_id"), 
				json.getString("beer_name"), 
				json.getString("brewery_name"),
				json.getString("beer_stamp"),
				json.getString("check_in_comment"));
		
		return userCheckin;
	}
}
