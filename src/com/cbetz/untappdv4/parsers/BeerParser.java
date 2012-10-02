package com.cbetz.untappdv4.parsers;

import org.json.JSONException;
import org.json.JSONObject;

import com.cbetz.untappdv4.types.Beer;

public class BeerParser {
	public Beer parse(JSONObject obj) throws JSONException {
		Beer beer = new Beer();
		
		if (obj.has("bid"))
			beer.setId(obj.getInt("bid"));
		if (obj.has("beer_name"))
			beer.setName(obj.getString("beer_name"));
		if (obj.has("beer_label"))
			beer.setLabel(obj.getString("beer_label"));
		if (obj.has("beer_abv"))
			beer.setAbv(obj.getDouble("beer_abv"));
		if (obj.has("beer_description"))
			beer.setDescription(obj.getString("beer_description"));
		if (obj.has("beer_style"))
			beer.setStyle(obj.getString("beer_style"));
		if (obj.has("is_in_production"))
			beer.setIsInProduction(obj.getInt("is_in_production"));
		if (obj.has("is_homebrew"))
			beer.setIsHomebrew(obj.getInt("is_homebrew"));
		if (obj.has("created_at"))
			beer.setCreatedAt(obj.getString("created_at"));
		if (obj.has("rating_count"))
			beer.setRatingCount(obj.getInt("rating_count"));
		if (obj.has("rating_score"))
			beer.setRatingScore(obj.getDouble("rating_score"));
		if (obj.has("auth_rating"))
			beer.setAuthRating(obj.getInt("auth_rating"));
		if (obj.has("wish_list"))
			beer.setWishList(obj.getBoolean("wish_list"));
		if (obj.has("stats"))
			beer.setStats(new StatsParser().parse(obj.getJSONObject("stats")));
		if (obj.has("brewery"))
			beer.setBrewery(new BreweryParser().parse(obj.getJSONObject("brewery")));
		
		return beer;
	}
	
	public static class StatsParser {
		public Beer.Stats parse(JSONObject obj) throws JSONException {
			Beer.Stats stats = new Beer.Stats();
			
			if (obj.has("total_count"))
				stats.setTotalCount(obj.getInt("total_count"));
			if (obj.has("monthly_count"))
				stats.setMonthlyCount(obj.getInt("monthly_count"));
			if (obj.has("user_count"))
				stats.setUserCount(obj.getInt("user_count"));
			if (obj.has("total_user_count"))
				stats.setTotalUserCount(obj.getInt("total_user_count"));
		
			return stats;
		}
	}
}
