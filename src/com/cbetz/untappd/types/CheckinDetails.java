package com.cbetz.untappd.types;

public class CheckinDetails {
	private int mCheckinId;
	private User mUser;
	private Beer mBeer;
	private int mToastCount;
	private boolean mYouToast;
	private Comment[] mComments;
	
	public int getCheckinId() {
		return mCheckinId;
	}
	public void setCheckinId(int mCheckinId) {
		this.mCheckinId = mCheckinId;
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
	public int getToastCount() {
		return mToastCount;
	}
	public void setToastCount(int mToastCount) {
		this.mToastCount = mToastCount;
	}
	public boolean isYouToast() {
		return mYouToast;
	}
	public void setYouToast(boolean mYouToast) {
		this.mYouToast = mYouToast;
	}
	public Comment[] getComments() {
		return mComments;
	}
	public void setComments(Comment[] mComments) {
		this.mComments = mComments;
	}
}
