package com.cbetz.untappdv4.parsers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappdv4.types.Badge;
import com.cbetz.untappdv4.types.CheckinResponse;;

public class CheckinResponseParser {
	public CheckinResponse parse(JSONObject obj) throws JSONException {
		CheckinResponse response = new CheckinResponse();
		
		if (obj.has("checkin_id"))
			response.setId(obj.getInt("checkin_id"));
		if (obj.has("result"))
			response.setResult(obj.getString("result"));		
		if (obj.has("user"))
			response.setUser(new UserParser().parse(obj.getJSONObject("user")));
		if (obj.has("stats"))
			response.setStats(new StatsParser().parse(obj.getJSONObject("stats")));
		if (obj.has("brewery"))
			response.setBrewery(new BreweryParser().parse(obj.getJSONObject("brewery")));
		if (obj.has("badges")) {
			List<Badge> badges = new ArrayList<Badge>();
			JSONArray arr = obj.getJSONObject("badges").getJSONArray("items");
			for (int i = 0; i < arr.length(); i++) {
				badges.add(new BadgeParser().parse(arr.getJSONObject(i)));
			}
			response.setBadges(badges);
		}
		
		return response;
	}
	
	public static class StatsParser {
		public CheckinResponse.Stats parse(JSONObject obj) throws JSONException {
			CheckinResponse.Stats stats = new CheckinResponse.Stats();
			
			if (obj.has("beer"))
				stats.setBeer((obj.getString("beer")));
			if (obj.has("beer_month"))
				stats.setBeerMonth((obj.getString("beer_month")));

		
			return stats;
		}
	}
}
