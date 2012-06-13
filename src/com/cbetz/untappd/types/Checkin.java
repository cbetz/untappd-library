package com.cbetz.untappd.types;

public class Checkin{
	private String mResult;
	private Badge[] mBadges;
	private String mCheckinTotalBeer;
	private String mCheckinTotalMonth;
	
	public Checkin(String result, 
			String checkinTotalBeer, 
			String checkinTotalMonth,
			Badge[] badges){
				setResult(result);
				setCheckinTotalBeer(checkinTotalBeer);
				setCheckinTotalMonth(checkinTotalMonth);
				setBadges(badges);
	}
	
	public void setResult(String mResult) {
		this.mResult = mResult;
	}

	public String getResult() {
		return mResult;
	}

	public void setBadges(Badge[] mBadges) {
		this.mBadges = mBadges;
	}

	public Badge[] getBadges() {
		return mBadges;
	}

	public void setCheckinTotalBeer(String mCheckinTotalBeer) {
		this.mCheckinTotalBeer = mCheckinTotalBeer;
	}

	public String getCheckinTotalBeer() {
		return mCheckinTotalBeer;
	}

	public void setCheckinTotalMonth(String mCheckinTotalMonth) {
		this.mCheckinTotalMonth = mCheckinTotalMonth;
	}

	public String getCheckinTotalMonth() {
		return mCheckinTotalMonth;
	}
}
