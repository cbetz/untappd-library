package com.cbetz.untappd.types;

public class Beer {
	private int mBeerId;
	private String mBeerName;
	private String mBeerStamp;
	private String mBreweryName;
	private String mTotalCount;
	private String mUniqueCount;
	private String mMonthlyCount;
	private String mWeeklyCount;
	private String mBeerAbv;
	private String mType;
	private int mAvgRating;
	private int mYourRating;
	private boolean mIsHad;
	
	public Beer(int beerId, String beerName, String breweryName, String beerStamp) {
		setBeerId(beerId);
		setBeerName(beerName);
		setBreweryName(breweryName);
		setBeerStamp(beerStamp);
	}
	
	public Beer(int beerId, String beerName, String breweryName, String beerStamp, 
		String totalCount, String uniqueCount, String monthlyCount, 
		String weeklyCount, String beerAbv, String type, int avgRating, int yourRating,
		boolean isHad) {
			setBeerId(beerId);
			setBeerName(beerName);
			setBreweryName(breweryName);
			setBeerStamp(beerStamp);
			setTotalCount(totalCount);
			setUniqueCount(uniqueCount);
			setMonthlyCount(monthlyCount);
			setWeeklyCount(weeklyCount);
			setBeerAbv(beerAbv);
			setType(type);
			setAvgRating(avgRating);
			setYourRating(yourRating);
			setIsHad(isHad);
	}
	
	public Beer() {
	}

	public void setBeerId(int mBeerId) {
		this.mBeerId = mBeerId;
	}

	public int getBeerId() {
		return mBeerId;
	}

	public void setBeerName(String mBeerName) {
		this.mBeerName = mBeerName;
	}

	public String getBeerName() {
		return mBeerName;
	}

	public void setBeerStamp(String mBeerStamp) {
		this.mBeerStamp = mBeerStamp;
	}

	public String getBeerStamp() {
		return mBeerStamp;
	}

	public void setBreweryName(String mBreweryName) {
		this.mBreweryName = mBreweryName;
	}

	public String getBreweryName() {
		return mBreweryName;
	}

	public void setTotalCount(String mTotalCount) {
		this.mTotalCount = mTotalCount;
	}

	public String getTotalCount() {
		return mTotalCount;
	}

	public void setUniqueCount(String mUniqueCount) {
		this.mUniqueCount = mUniqueCount;
	}

	public String getUniqueCount() {
		return mUniqueCount;
	}

	public void setMonthlyCount(String mMonthlyCount) {
		this.mMonthlyCount = mMonthlyCount;
	}

	public String getMonthlyCount() {
		return mMonthlyCount;
	}

	public void setWeeklyCount(String mWeeklyCount) {
		this.mWeeklyCount = mWeeklyCount;
	}

	public String getWeeklyCount() {
		return mWeeklyCount;
	}

	public void setBeerAbv(String mBeerAbv) {
		this.mBeerAbv = mBeerAbv;
	}

	public String getBeerAbv() {
		return mBeerAbv;
	}

	public void setType(String mType) {
		this.mType = mType;
	}

	public String getType() {
		return mType;
	}

	public void setAvgRating(int avgRating) {
		this.mAvgRating = avgRating;
	}

	public int getAvgRating() {
		return mAvgRating;
	}

	public void setYourRating(int mYourRating) {
		this.mYourRating = mYourRating;
	}

	public int getYourRating() {
		return mYourRating;
	}

	public void setIsHad(boolean mIsHad) {
		this.mIsHad = mIsHad;
	}

	public boolean getIsHad() {
		return mIsHad;
	}
}
