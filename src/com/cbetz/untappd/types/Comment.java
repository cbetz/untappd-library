package com.cbetz.untappd.types;

public class Comment {
	private int mCommentId;
	private User mUser;
	private String mText;
	private String mSource;
	
	public Comment(int commentId, User user, String text, String source) {
		setCommentId(commentId);
		setUser(user);
		setText(text);
		setSource(source);
	}
	
	public int getCommentId() {
		return mCommentId;
	}
	public void setCommentId(int mCommentId) {
		this.mCommentId = mCommentId;
	}
	public User getUser() {
		return mUser;
	}
	public void setUser(User mUser) {
		this.mUser = mUser;
	}
	public String getText() {
		return mText;
	}
	public void setText(String mText) {
		this.mText = mText;
	}
	public String getSource() {
		return mSource;
	}
	public void setSource(String mSource) {
		this.mSource = mSource;
	}
}
