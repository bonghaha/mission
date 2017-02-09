package com.remarkablesoft.mission.user.vo;

public class UserInfo {
	private String userCode = "";		// 유저코드(주키)
	private String userId = "";			// 아이디
	private String userPw = "";			// 비밀번호
	private String userName = "";		// 이름
	private int userBirthday = 0;		// 생년월일			
	private int userResiNum = 0;		// 주민번호뒷자리
	private String userEmail = "";		// 이메일
	private String userPhoneOne = "";	// 폰번호 앞
	private String userPhoneTwo = "";	// 폰번호 가운데
	private String userPhoneThr = "";	// 폰번호 뒤 
	private String userAddress = "";	// 주소
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserBirthday() {
		return userBirthday;
	}
	
	public void setUserBirthday(int userBirthday) {
		this.userBirthday = userBirthday;
	}
	
	public int getUserResiNum() {
		return userResiNum;
	}
	
	public void setUserResiNum(int userResiNum) {
		this.userResiNum = userResiNum;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserPhoneOne() {
		return userPhoneOne;
	}
	
	public void setUserPhoneOne(String userPhoneOne) {
		this.userPhoneOne = userPhoneOne;
	}
	
	public String getUserPhoneTwo() {
		return userPhoneTwo;
	}
	
	public void setUserPhoneTwo(String userPhoneTwo) {
		this.userPhoneTwo = userPhoneTwo;
	}
	
	public String getUserPhoneThr() {
		return userPhoneThr;
	}
	
	public void setUserPhoneThr(String userPhoneThr) {
		this.userPhoneThr = userPhoneThr;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
