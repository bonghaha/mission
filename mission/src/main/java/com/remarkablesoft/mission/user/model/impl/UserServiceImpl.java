package com.remarkablesoft.mission.user.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remarkablesoft.mission.user.model.UserService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	// 1.2 아이디 중복검사
	@Override
	public String idDupCheck( UserInfo userInfo ) {
		return userDAO.idDupCheck( userInfo );
	}
	
	// 1.3 회원등록 액션
	@Override
	public void userAdd( UserInfo userInfo ) {
		String userLastKey = "";
		String userCode = "";
		String userPre = "user_";
		
		// 마지막으로 생성된 user_code 번호 select
		userLastKey = userDAO.getUserLastKey();
		
		int lastKeyNum = 0;
		// 회원이 없을 경우
		if( userLastKey == null ){
			lastKeyNum = lastKeyNum + 1;
		}else{ // 회원이 있을 경우
			// 'user_'를 제외한 번호만 뽑아내서 +1 시킴
			lastKeyNum = Integer.parseInt( userLastKey.substring( userPre.length() ) ) + 1;
		}
		
		// user_번호 셋팅
		userCode = userPre + lastKeyNum;
		userInfo.setUserCode(userCode);
		userDAO.userAdd( userInfo );
	}
	
	// 2.2 회원상세정보 가져오기
	@Override
	public UserInfo userView( UserInfo userInfo ) {
		return userDAO.userView( userInfo );
	}
}
