package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Badge;
import com.cbetz.untappd.types.Checkin;

public class CheckinParser {
	Checkin checkin = null;
	
	public Checkin parse(JSONObject json) throws JSONException {
		Badge[] badges = null;
			
/*		if (json.getJSONArray("badges") != null) {
			badges = new Badge[json.getJSONArray("badges").length()];
			Badge badge;
						
			for (int i=0; i<json.getJSONArray("badges").length(); ++i) {
				badge = new BadgeParser().parse(json.getJSONArray("badges").getJSONObject(i));
				badges[i] = badge;
			}
		} */
		
		checkin = new Checkin(
				json.getString("result"),
				json.getJSONObject("checkin_total").getString("beer"),
				json.getJSONObject("checkin_total").getString("beer_month"),
				badges);
		
		return checkin;
	}

}
