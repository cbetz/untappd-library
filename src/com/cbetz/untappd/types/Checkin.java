package com.cbetz.untappd.types;

import java.util.List;

public class Checkin {
	private int mId;
    private String mCreatedAt;
    private int mRatingScore;
    private String mComment;
    private User mUser;
    private Beer mBeer;
    private Brewery mBrewery;
    private List<Badge> mBadges;
    
	public int getId() {
		return mId;
	}
	public void setId(int mId) {
		this.mId = mId;
	}
	public String getCreatedAt() {
		return mCreatedAt;
	}
	public void setCreatedAt(String mCreatedAt) {
		this.mCreatedAt = mCreatedAt;
	}
	public int getRatingScore() {
		return mRatingScore;
	}
	public void setRatingScore(int mRatingScore) {
		this.mRatingScore = mRatingScore;
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

}
