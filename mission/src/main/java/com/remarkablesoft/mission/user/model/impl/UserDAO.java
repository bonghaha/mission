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
	
	// 1.2 아이디 중복검사
	public String idDupCheck(UserInfo userInfo) {
		return sqlSession.selectOne( NS + ".idDupCheck", userInfo );
	}
	
	// 1.3 회원 등록 액션
	public void userAdd( UserInfo userInfo ) {
		sqlSession.insert( NS + ".userAdd", userInfo );
	}

	// 2.2 회원상세정보 가져오기
	public UserInfo userView(UserInfo userInfo) {
		return sqlSession.selectOne( NS + ".userView", userInfo );
	}

	// 1.4 마지막 회원 코드 가져오기
	public String getUserLastKey() {
		return sqlSession.selectOne( NS + ".getUserLastKey" );
	}
}
