package com.remarkablesoft.mission.user.model;

import com.remarkablesoft.mission.user.vo.UserInfo;

public interface UserService {
	
	// 회원 등록 실행
	public void userAdd( UserInfo userInfo );
	
	// 회원 상세보기
	public UserInfo userView( UserInfo userInfo );

	// 아이디 중복검사
	public String idDupCheck( UserInfo userInfo );

}
