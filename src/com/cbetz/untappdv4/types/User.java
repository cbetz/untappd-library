package com.cbetz.untappdv4.types;

public class User {
	private int mId;
	private String mUserName;
	private String mFirstName;
	private String mLastName;
	private String mAvatar;
	private int mIsPrivate;
	private String mLocation;
	private String mUrl;
	private String mBio;
	private String mRelationship;
	private String mUntappdUrl;
	private String mAccountType;
	private String mDateJoined;
	private Contact mContact;
	private Stats mStats;
	
	public class Contact {	
		private int mFoursquare;
		private int mFacebook;
		private String mTwitter;
			
		public int getFoursquare() {
			return mFoursquare;
		}
		public void setFoursquare(int foursquare) {
			this.mFoursquare = foursquare;
		}
		public int getFacebook() {
			return mFacebook;
		}
		public void setFacebook(int facebook) {
			this.mFacebook = facebook;
		}
		public String getTwitter() {
			return mTwitter;
		}
		public void setTwitter(String twitter) {
			this.mTwitter = twitter;
		} 
	}
	
	public class Stats {			
	    private int mTotalBadges;
	    private int mTotalFriends;
	    private int mTotalCheckins;
	    private int mTotalBeers;
	    private int mTotalCreatedBeers;
	    	    
		public int getTotalBadges() {
			return mTotalBadges;
		}
		public void setTotalBadges(int totalBadges) {
			this.mTotalBadges = totalBadges;
		}
		public int getTotalFriends() {
			return mTotalFriends;
		}
		public void setTotalFriends(int totalFriends) {
			this.mTotalFriends = totalFriends;
		}
		public int getTotalCheckins() {
			return mTotalCheckins;
		}
		public void setTotalCheckins(int totalCheckins) {
			this.mTotalCheckins = totalCheckins;
		}
		public int getTotalBeers() {
			return mTotalBeers;
		}
		public void setTotalBeers(int totalBeers) {
			this.mTotalBeers = totalBeers;
		}
		public int getTotalCreatedBeers() {
			return mTotalCreatedBeers;
		}
		public void setTotalCreatedBeers(int totalCreatedBeers) {
			this.mTotalCreatedBeers = totalCreatedBeers;
		}
	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		this.mId = id;
	}

	public String getUserName() {
		return mUserName;
	}

	public void setUserName(String userName) {
		this.mUserName = userName;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public void setFirstName(String firstName) {
		this.mFirstName = firstName;
	}

	public String getLastName() {
		return mLastName;
	}

	public void setLastName(String lastName) {
		this.mLastName = lastName;
	}

	public String getAvatar() {
		return mAvatar;
	}

	public void setAvatar(String avatar) {
		this.mAvatar = avatar;
	}

	public int getIsPrivate() {
		return mIsPrivate;
	}

	public void setIsPrivate(int isPrivate) {
		this.mIsPrivate = isPrivate;
	}

	public String getLocation() {
		return mLocation;
	}

	public void setLocation(String location) {
		this.mLocation = location;
	}

	public String getUrl() {
		return mUrl;
	}

	public void setUrl(String url) {
		this.mUrl = url;
	}

	public String getBio() {
		return mBio;
	}

	public void setBio(String bio) {
		this.mBio = bio;
	}

	public String getRelationship() {
		return mRelationship;
	}

	public void setRelationship(String relationship) {
		this.mRelationship = relationship;
	}

	public String getUntappdUrl() {
		return mUntappdUrl;
	}

	public void setUntappdUrl(String untappdUrl) {
		this.mUntappdUrl = untappdUrl;
	}

	public String getAccountType() {
		return mAccountType;
	}

	public void setAccountType(String accountType) {
		this.mAccountType = accountType;
	}

	public String getDateJoined() {
		return mDateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.mDateJoined = dateJoined;
	}

	public Contact getContact() {
		return mContact;
	}

	public void setContact(Contact contact) {
		this.mContact = contact;
	}

	public Stats getStats() {
		return mStats;
	}

	public void setStats(Stats stats) {
		this.mStats = stats;
	}
}
