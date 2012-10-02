package com.cbetz.untappdv4.types;

public class Badge {
	private String mName;
    private String mDescription;
    private String mCreatedAt;

    public class Image {
    	private String mSm;
    	private String mMd;
    	private String mLg;
    	
		public String getSm() {
			return mSm;
		}
		public void setSm(String sm) {
			this.mSm = sm;
		}
		public String getMd() {
			return mMd;
		}
		public void setMd(String md) {
			this.mMd = md;
		}
		public String getLg() {
			return mLg;
		}
		public void setLg(String lg) {
			this.mLg = lg;
		}
    }

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		this.mDescription = description;
	}

	public String getCreatedAt() {
		return mCreatedAt;
	}

	public void setCreatedAt(String createdAt) {
		this.mCreatedAt = createdAt;
	}
}
