package com.cbetz.untappd.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappd.types.Badge;

public class BadgeParser {
	public Badge parse(JSONObject obj) throws JSONException {
		Badge badge = new Badge();
		
		if (obj.has("badge_name"))
			badge.setName(obj.getString("badge_name"));
		if (obj.has("badge_description"))
			badge.setDescription(obj.getString("badge_description"));
		if (obj.has("created_at"))
			badge.setCreatedAt(obj.getString("created_at"));
		if (obj.has("badge_image"))
			badge.setImage(new ImageParser().parse(obj.getJSONObject("badge_image")));
		
		return badge;
	}
	
	public static class ImageParser {
		public Badge.Image parse(JSONObject obj) throws JSONException {
			Badge.Image image = new Badge.Image();
			
			if (obj.has("sm"))
				image.setSm(obj.getString("sm"));
			if (obj.has("md"))
				image.setMd(obj.getString("md"));
			if (obj.has("lg"))
				image.setLg(obj.getString("lg"));
			
			return image;
		}
	}
}
