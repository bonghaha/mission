package com.remarkablesoft.mission.user.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remarkablesoft.mission.user.model.UserService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public void userAdd(UserInfo userInfo) {
		userDAO.userAdd( userInfo );
	}
	
	@Override
	public UserInfo userView( UserInfo userInfo ) {
		return userDAO.userView( userInfo );
	}
}
