package com.remarkablesoft.mission.board.vo;

import java.util.Date;

public class ArticleInfo {
	private String articleCode;		// 글 코드번호
	private String userCode;		// 작성자코드번호
	private int articleNo;			// 글번호
	private String articleTitle;	// 글제목
	private String articleContent;	// 글내용
	private Date articleCredate;	// 작성일
	private Date articleModdate;	// 수정일
	
	public String getArticleCode() {
		return articleCode;
	}
	
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	
	public String getUserCode() {
		return userCode;
	}
	
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public int getArticleNo() {
		return articleNo;
	}
	
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	
	public String getArticleTitle() {
		return articleTitle;
	}
	
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	
	public String getArticleContent() {
		return articleContent;
	}
	
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public Date getArticleCredate() {
		return articleCredate;
	}

	public void setArticleCredate(Date articleCredate) {
		this.articleCredate = articleCredate;
	}

	public Date getArticleModdate() {
		return articleModdate;
	}

	public void setArticleModdate(Date articleModdate) {
		this.articleModdate = articleModdate;
	}
}
