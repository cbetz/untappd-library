package com.cbetz.untappd.types;

import java.util.List;

public class CheckinResponse {
	private int mId;
    private String mResult;
    private String mComment;
    private User mUser;
    private Beer mBeer;
    private Brewery mBrewery;
    private List<Badge> mBadges;
    private Stats mStats;
    
    public static class Stats {
    	private String mBeer;
    	private String mBeerMonth;
    	
		public String getBeer() {
			return mBeer;
		}
		public void setBeer(String beer) {
			this.mBeer = beer;
		}
		public String getBeerMonth() {
			return mBeerMonth;
		}
		public void setBeerMonth(String beerMonth) {
			this.mBeerMonth = beerMonth;
		}
    }
    
	public int getId() {
		return mId;
	}
	public void setId(int mId) {
		this.mId = mId;
	}
	public String getComment() {
		return mComment;
	}
	public void setComment(String mComment) {
		this.mComment = mComment;
	}
	public User getUser() {
		return mUser;
	}
	public void setUser(User mUser) {
		this.mUser = mUser;
	}
	public Beer getBeer() {
		return mBeer;
	}
	public void setBeer(Beer mBeer) {
		this.mBeer = mBeer;
	}
	public Brewery getBrewery() {
		return mBrewery;
	}
	public void setBrewery(Brewery mBrewery) {
		this.mBrewery = mBrewery;
	}
	public List<Badge> getBadges() {
		return mBadges;
	}
	public void setBadges(List<Badge> mBadges) {
		this.mBadges = mBadges;
	}
	public String getResult() {
		return mResult;
	}
	public void setResult(String result) {
		this.mResult = result;
	}
	public Stats getStats() {
		return mStats;
	}
	public void setStats(Stats stats) {
		this.mStats = stats;
	}

}
