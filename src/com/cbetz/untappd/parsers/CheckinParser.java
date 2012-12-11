package com.cbetz.untappd.parsers;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Badge;
import com.cbetz.untappd.types.Checkin;

public class CheckinParser {
	public Checkin parse(JSONObject obj) throws JSONException {
		Checkin checkin = new Checkin();
		
		if (obj.has("checkin_id"))
			checkin.setId(obj.getInt("checkin_id"));
		if (obj.has("created_at"))
			checkin.setCreatedAt(obj.getString("created_at"));
		if (obj.has("rating_score"))
			checkin.setRatingScore(obj.getInt("rating_score"));
		if (obj.has("checkin_comment"))
			checkin.setComment(obj.getString("checkin_comment"));
		if (obj.has("user"))
			checkin.setUser(new UserParser().parse(obj.getJSONObject("user")));
		if (obj.has("beer"))
			checkin.setBeer(new BeerParser().parse(obj.getJSONObject("beer")));
		if (obj.has("brewery"))
			checkin.setBrewery(new BreweryParser().parse(obj.getJSONObject("brewery")));
		if (obj.has("badges")) {
			List<Badge> badges = new ArrayList<Badge>();
			JSONArray arr = obj.getJSONObject("badges").getJSONArray("items");
			for (int i = 0; i < arr.length(); i++) {
				badges.add(new BadgeParser().parse(arr.getJSONObject(i)));
			}
			checkin.setBadges(badges);
		}

		return checkin;
	}
}
