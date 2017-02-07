package com.remarkablesoft.mission.user.model.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.remarkablesoft.mission.user.vo.UserInfo;

@Repository
public class LoginDAO {

	private final String NS = "com.remarkablesoft.mission.repository.UserSQL";

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public UserInfo checkUser( UserInfo userInfo ) {
		return sqlSession.selectOne( NS + ".checkUser", userInfo );
	}
	
}
