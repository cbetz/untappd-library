package com.cbetz.untappd.types;

public class Badge {
	private String mName;
	private String mDescrip;
	private String mImgSm;
	private String mImgMd;
	private String mImgLg;
	
	public Badge(String name, String descrip, String imgSm, String imgMd, String imgLg){
		setName(name);
		setDescrip(descrip);
		setImgSm(imgSm);
		setImgMd(imgMd);
		setImgLg(imgLg);
	}
	
	public void setName(String mName) {
		this.mName = mName;
	}
	public String getName() {
		return mName;
	}
	public void setDescrip(String mDescrip) {
		this.mDescrip = mDescrip;
	}
	public String getDescrip() {
		return mDescrip;
	}
	public void setImgSm(String mImgSm) {
		this.mImgSm = mImgSm;
	}
	public String getImgSm() {
		return mImgSm;
	}
	public void setImgMd(String mImgMd) {
		this.mImgMd = mImgMd;
	}
	public String getImgMd() {
		return mImgMd;
	}
	public void setImgLg(String mImgLg) {
		this.mImgLg = mImgLg;
	}
	public String getImgLg() {
		return mImgLg;
	}
}
