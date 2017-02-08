package com.remarkablesoft.mission.user.model.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.remarkablesoft.mission.user.vo.UserInfo;

@Repository
public class UserDAO {
	
	private final String NS = "com.remarkablesoft.mission.repository.UserSQL";

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	// 1.2 회원 등록 실행
	public void userAdd( UserInfo userInfo ) {
		sqlSession.insert( NS + ".userAdd", userInfo );
	}

	// 2. 회원 상세 보기
	public UserInfo userView(UserInfo userInfo) {
		return sqlSession.selectOne( NS + ".userView", userInfo );
	}
}
