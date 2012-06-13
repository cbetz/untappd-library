package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.User;

public class UserInfoParser {
	public User parse(JSONObject json) throws JSONException {
		User user = new User(
			json.getInt("uid"),
            json.getString("user_name"),
            json.getString("first_name"),
            json.getString("last_name"),
            json.getString("user_avatar"),
            json.getString("location"),
            json.getString("bio"),
            json.getString("url"),
            json.getString("date_joined"),
            json.getBoolean("is_private"),
            json.getInt("total_badges"),
            json.getInt("total_friends"),
            json.getInt("total_checkins"),
            json.getInt("total_beers"),
            json.getInt("total_created_beers"),
            json.getJSONObject("social_accounts").getBoolean("twitter"),
            json.getJSONObject("social_accounts").getBoolean("foursquare"),
            json.getJSONObject("social_accounts").getBoolean("facebook")//,
            //json.getJSONObject("social_accounts").getBoolean("gowalla")
		);
		
		return user;
	}
}