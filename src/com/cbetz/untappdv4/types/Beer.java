package com.cbetz.untappdv4.types;

public class Beer {
	private int mId;
	private String mName;
	private String mLabel;
	private double mAbv; 
	private String mDescription;
	private String mStyle;
	private int mIsInProduction; 
	private int mIsHomebrew; 
	private String mCreatedAt;
	private int mRatingCount;
	private double mRatingScore;
	private int mAuthRating;
	private boolean mWishList;
	private Stats mStats;
	private Brewery mBrewery;
	
	public static class Stats {
	    private int mTotalCount;
	    private int mMonthlyCount;
	    private int mUserCount;
	    private int mTotalUserCount;
	    
		public int getTotalCount() {
			return mTotalCount;
		}
		public void setTotalCount(int totalCount) {
			this.mTotalCount = totalCount;
		}
		public int getMonthlyCount() {
			return mMonthlyCount;
		}
		public void setMonthlyCount(int monthlyCount) {
			this.mMonthlyCount = monthlyCount;
		}
		public int getUserCount() {
			return mUserCount;
		}
		public void setUserCount(int userCount) {
			this.mUserCount = userCount;
		}
		public int getTotalUserCount() {
			return mTotalUserCount;
		}
		public void setTotalUserCount(int totalUserCount) {
			this.mTotalUserCount = totalUserCount;
		}
	}
	
	public int getId() {
		return mId;
	}
	public void setId(int id) {
		this.mId = id;
	}
	public String getName() {
		return mName;
	}
	public void setName(String name) {
		this.mName = name;
	}
	public String getLabel() {
		return mLabel;
	}
	public void setLabel(String label) {
		this.mLabel = label;
	}
	public double getAbv() {
		return mAbv;
	}
	public void setAbv(double abv) {
		this.mAbv = abv;
	}
	public String getDescription() {
		return mDescription;
	}
	public void setDescription(String description) {
		this.mDescription = description;
	}
	public String getStyle() {
		return mStyle;
	}
	public void setStyle(String style) {
		this.mStyle = style;
	}
	public int isIsInProduction() {
		return mIsInProduction;
	}
	public void setIsInProduction(int isInProduction) {
		this.mIsInProduction = isInProduction;
	}
	public int isIsHomebrew() {
		return mIsHomebrew;
	}
	public void setIsHomebrew(int isHomebrew) {
		this.mIsHomebrew = isHomebrew;
	}
	public String getCreatedAt() {
		return mCreatedAt;
	}
	public void setCreatedAt(String createdAt) {
		this.mCreatedAt = createdAt;
	}
	public int getRatingCount() {
		return mRatingCount;
	}
	public void setRatingCount(int ratingCount) {
		this.mRatingCount = ratingCount;
	}
	public double getRatingScore() {
		return mRatingScore;
	}
	public void setRatingScore(double ratingScore) {
		this.mRatingScore = ratingScore;
	}
	public int getAuthRating() {
		return mAuthRating;
	}
	public void setAuthRating(int authRating) {
		this.mAuthRating = authRating;
	}
	public boolean isWishList() {
		return mWishList;
	}
	public void setWishList(boolean wishList) {
		this.mWishList = wishList;
	}
	public Stats getStats() {
		return mStats;
	}
	public void setStats(Stats stats) {
		this.mStats = stats;
	}
	public Brewery getBrewery() {
		return mBrewery;
	}
	public void setBrewery(Brewery brewery) {
		this.mBrewery = brewery;
	}

}
