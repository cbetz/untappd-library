package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Beer;

public class BeerInfoParser {
	public Beer parse(JSONObject json) throws JSONException {
		Beer beer = new Beer(
			json.getInt("beer_id"),
			json.getString("name"),
			json.getString("brewery"),
			json.getString("img"),
			json.getString("total_count"),
			json.getString("unique_count"), 
			json.getString("monthly_count"), 
			json.getString("weekly_count"), 
			json.getString("beer_abv"), 
			json.getString("type"),
			json.getInt("avg_rating"),
			json.getInt("your_rating"),
			json.getBoolean("is_had")
		);
		
		return beer;
	}
}
