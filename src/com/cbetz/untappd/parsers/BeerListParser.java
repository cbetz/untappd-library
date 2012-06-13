package com.cbetz.untappd.parsers;
import org.json.JSONException;

import org.json.JSONObject;

import com.cbetz.untappd.types.Beer;

public class BeerListParser {

	public Beer parse(JSONObject json) throws JSONException {
		Beer beer = new Beer(
			json.getInt("beer_id"),
			json.getString("beer_name"),
			json.getString("brewery_name"),
			json.getString("beer_stamp")
		);
		
		return beer;
	}
}
