package com.cbetz.untappd.types;

public class Brewery {

    private int mId;
    private String mName;
    private String mLabel;
    private String mCountryName;
    private Contact mContact;
    private Location mLocation;
    
    public static class Contact {
        private String mTwitter;
        private String mFacebook;
        private String mUrl;
        
    	public String getTwitter() {
    		return mTwitter;
    	}
    	public void setTwitter(String twitter) {
    		this.mTwitter = twitter;
    	}
    	public String getFacebook() {
    		return mFacebook;
    	}
    	public void setFacebook(String facebook) {
    		this.mFacebook = facebook;
    	}
    	public String getUrl() {
    		return mUrl;
    	}
    	public void setUrl(String url) {
    		this.mUrl = url;
    	}

    }
    
    public static class Location {
        private String mCity;
        private String mState;
        private double mLat;
        private double mLng;
        
    	public String getCity() {
    		return mCity;
    	}
    	public void setCity(String city) {
    		this.mCity = city;
    	}
    	public String getState() {
    		return mState;
    	}
    	public void setState(String state) {
    		this.mState = state;
    	}
    	public double getLat() {
    		return mLat;
    	}
    	public void setLat(double lat) {
    		this.mLat = lat;
    	}
    	public double getLng() {
    		return mLng;
    	}
    	public void setLng(double lng) {
    		this.mLng = lng;
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
	public String getCountryName() {
		return mCountryName;
	}
	public void setCountryName(String countryName) {
		this.mCountryName = countryName;
	}
	public Contact getContact() {
		return mContact;
	}
	public void setContact(Contact contact) {
		this.mContact = contact;
	}
	public Location getLocation() {
		return mLocation;
	}
	public void setLocation(Location location) {
		this.mLocation = location;
	}
}
