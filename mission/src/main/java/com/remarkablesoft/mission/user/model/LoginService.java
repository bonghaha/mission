package com.remarkablesoft.mission.user.model;

import com.remarkablesoft.mission.user.vo.UserInfo;

public interface LoginService {

	// login
	UserInfo checkUser( UserInfo userInfo );
	
}
