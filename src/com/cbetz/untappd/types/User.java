package com.cbetz.untappd.types;

public class User {
	private int mUid;
	private String mUserName;
	private String mFirstName;
	private String mLastName;
	private String mUserAvatar;
	private String mLocation;
    private String mBio;
    private String mUrl;
    private String mDateJoined;
    private boolean mIsPrivate;
    private int mTotalBadges;
    private int mTotalFriends;
    private int mTotalCheckins;
    private int mTotalBeers;
    private int mTotalCreatedBeers;
    private boolean mTwitter;
    private boolean mFoursquare;
    private boolean mFacebook;
    //private boolean mGowalla;
    
    public User(int uid, String userName, String firstName, String lastName,
    		String userAvatar, String location, String bio,
    		String url, String dateJoined, boolean isPrivate, int totalBadges,
    		int totalFriends, int totalCheckins, int totalBeers, 
    		int totalCreatedBeers, boolean twitter, boolean foursquare, 
    		boolean facebook/*, boolean gowalla*/){
    	setUid(uid);
    	setUserName(userName);
    	setFirstName(firstName);
    	setLastName(lastName);
    	setUserAvatar(userAvatar);
    	setLocation(location);
    	setBio(bio);
    	setUrl(url);
    	setDateJoined(dateJoined);
    	setIsPrivate(isPrivate);
    	setTotalBadges(totalBadges);
    	setTotalFriends(totalFriends);
    	setTotalCheckins(totalCheckins);
    	setTotalBeers(totalBeers);
    	setTotalCreatedBeers(totalCreatedBeers);
    	setTwitter(twitter);
    	setFoursquare(foursquare);
    	setFacebook(facebook);
    	//setGowalla(gowalla);
    }
    
	public void setUid(int mUid) {
		this.mUid = mUid;
	}
	public int getUid() {
		return mUid;
	}
	public void setUserName(String mUserName) {
		this.mUserName = mUserName;
	}
	public String getUserName() {
		return mUserName;
	}
	public void setFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}
	public String getFirstName() {
		return mFirstName;
	}
	public void setLastName(String mLastName) {
		this.mLastName = mLastName;
	}
	public String getLastName() {
		return mLastName;
	}
	public void setUserAvatar(String mUserAvatar) {
		this.mUserAvatar = mUserAvatar;
	}
	public String getUserAvatar() {
		return mUserAvatar;
	}
	public void setLocation(String mLocation) {
		this.mLocation = mLocation;
	}
	public String getLocation() {
		return mLocation;
	}
	public void setBio(String mBio) {
		this.mBio = mBio;
	}
	public String getBio() {
		return mBio;
	}
	public void setUrl(String mUrl) {
		this.mUrl = mUrl;
	}
	public String getUrl() {
		return mUrl;
	}
	public void setDateJoined(String mDateJoined) {
		this.mDateJoined = mDateJoined;
	}
	public String getDateJoined() {
		return mDateJoined;
	}
	public void setIsPrivate(boolean mIsPrivate) {
		this.mIsPrivate = mIsPrivate;
	}
	public boolean isIsPrivate() {
		return mIsPrivate;
	}
	public void setTotalBadges(int mTotalBadges) {
		this.mTotalBadges = mTotalBadges;
	}
	public int getTotalBadges() {
		return mTotalBadges;
	}
	public void setTotalFriends(int mTotalFriends) {
		this.mTotalFriends = mTotalFriends;
	}
	public int getTotalFriends() {
		return mTotalFriends;
	}
	public void setTotalCheckins(int mTotalCheckins) {
		this.mTotalCheckins = mTotalCheckins;
	}
	public int getTotalCheckins() {
		return mTotalCheckins;
	}
	public void setTotalBeers(int mTotalBeers) {
		this.mTotalBeers = mTotalBeers;
	}
	public int getTotalBeers() {
		return mTotalBeers;
	}
	public void setTotalCreatedBeers(int mTotalCreatedBeers) {
		this.mTotalCreatedBeers = mTotalCreatedBeers;
	}
	public int getTotalCreatedBeers() {
		return mTotalCreatedBeers;
	}

	public void setTwitter(boolean mTwitter) {
		this.mTwitter = mTwitter;
	}

	public boolean hasTwitter() {
		return mTwitter;
	}

	public void setFoursquare(boolean mFoursquare) {
		this.mFoursquare = mFoursquare;
	}

	public boolean hasFoursquare() {
		return mFoursquare;
	}

	public void setFacebook(boolean mFacebook) {
		this.mFacebook = mFacebook;
	}

	public boolean hasFacebook() {
		return mFacebook;
	}

	/*public void setGowalla(boolean mGowalla) {
		this.mGowalla = mGowalla;
	}

	public boolean hasGowalla() {
		return mGowalla;
	}*/
}
