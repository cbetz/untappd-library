package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Badge;

public class BadgeParser {
	public Badge parse(JSONObject json) throws JSONException {
		Badge badge = new Badge(
			json.getString("name"),
			json.getString("descrip"),
			json.getString("img_sm"),
			json.getString("img_md"),
			json.getString("img_lg")
		);
		
		return badge;
	}
}
