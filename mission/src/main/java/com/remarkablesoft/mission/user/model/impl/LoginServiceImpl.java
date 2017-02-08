package com.remarkablesoft.mission.user.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remarkablesoft.mission.user.model.LoginService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	// 로그인 값 확인
	@Override
	public UserInfo checkUser( UserInfo userInfo) {
		return loginDAO.checkUser( userInfo );
	}
}
