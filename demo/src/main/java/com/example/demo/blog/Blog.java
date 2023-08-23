package com.example.demo.blog;

import java.time.LocalDateTime;

public class Blog {
	private int bid;
	private String penName;
	private String title;
	private String content;
	private LocalDateTime modTime;
	private int viewCount;
	private int isDeleted;
	
	public Blog() {}

	// Insert
	public Blog(String penName, String title, String content) {
		this.penName = penName;
		this.title = title;
		this.content = content;
	}
	
	// Update
	public Blog(int bid, String penName, String title, String content) {
		this.bid = bid;
		this.penName = penName;
		this.title = title;
		this.content = content;
	}

	public Blog(int bid, String penName, String title, String content, LocalDateTime modTime, int viewCount,
			int isDeleted) {
		this.bid = bid;
		this.penName = penName;
		this.title = title;
		this.content = content;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Blog [bid=" + bid + ", penName=" + penName + ", title=" + title + ", content=" + content + ", modTime="
				+ modTime + ", viewCount=" + viewCount + ", isDeleted=" + isDeleted + "]";
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getModTime() {
		return modTime;
	}

	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
