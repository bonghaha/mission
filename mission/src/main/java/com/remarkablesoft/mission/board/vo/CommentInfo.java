package com.remarkablesoft.mission.board.vo;

import java.util.Date;

public class CommentInfo {
	private String commentCode;		// 댓글 코드번호
	private String articleCode;		// 글 코드번호
	private String userCode;		// 댓글 작성자 코드번호
	private int commentNo;			// 댓글번호
	private String commentContent;	// 댓글내용
	private Date commentCredate;	// 댓글작성일
	private Date commentModdate;	// 댓글수정일
	
	public String getCommentCode() {
		return commentCode;
	}
	
	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}
	
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
	
	public int getCommentNo() {
		return commentNo;
	}
	
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	
	public String getCommentContent() {
		return commentContent;
	}
	
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentCredate() {
		return commentCredate;
	}

	public void setCommentCredate(Date commentCredate) {
		this.commentCredate = commentCredate;
	}

	public Date getCommentModdate() {
		return commentModdate;
	}

	public void setCommentModdate(Date commentModdate) {
		this.commentModdate = commentModdate;
	}
	
}
