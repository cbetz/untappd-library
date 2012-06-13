package com.cbetz.untappd.types;

public class UserCheckin {
	int mUserId;
	String mUserName;
	String mUserAvatar;
	int mBeerId;
	String mBeerName;
	String mBreweryName;
	String mBeerStamp;
	String mComment;
	
	public UserCheckin(int userId, String userName, String userAvatar, int beerId, String beerName, String breweryName, String beerStamp, String comment) {
		setUserId(userId);
		setUserName(userName);
		setUserAvatar(userAvatar);
		setBeerId(beerId);
		setBeerName(beerName);
		setBreweryName(breweryName);
		setBeerStamp(beerStamp);
		setComment(comment);
	}
	
	public int getBeerId() {
		return mBeerId;
	}
	public void setBeerId(int mBeerId) {
		this.mBeerId = mBeerId;
	}
	public String getBeerName() {
		return mBeerName;
	}
	public void setBeerName(String mBeerName) {
		this.mBeerName = mBeerName;
	}
	public String getBreweryName() {
		return mBreweryName;
	}
	public void setBreweryName(String mBreweryName) {
		this.mBreweryName = mBreweryName;
	}

	public String getUserAvatar() {
		return mUserAvatar;
	}

	public void setUserAvatar(String mUserAvatar) {
		this.mUserAvatar = mUserAvatar;
	}

	public int getUserId() {
		return mUserId;
	}

	public void setUserId(int mUserId) {
		this.mUserId = mUserId;
	}

	public String getUserName() {
		return mUserName;
	}

	public void setUserName(String mUserName) {
		this.mUserName = mUserName;
	}

	public String getBeerStamp() {
		return mBeerStamp;
	}

	public void setBeerStamp(String mBeerStamp) {
		this.mBeerStamp = mBeerStamp;
	}

	public String getComment() {
		return mComment;
	}

	public void setComment(String mComment) {
		this.mComment = mComment;
	}
}
