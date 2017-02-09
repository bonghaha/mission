package com.remarkablesoft.mission.board.model.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.remarkablesoft.mission.board.vo.ArticleInfo;
import com.remarkablesoft.mission.board.vo.CommentInfo;

@Repository
public class BoardDAO {
	
	private final String NS = "com.remarkablesoft.mission.repository.BoardSQL";

	@Autowired
	private SqlSessionTemplate sqlSession;

	// 1.2 게시글 등록 액션
	public void userAdd( ArticleInfo articleInfo ) {
		sqlSession.insert( NS + ".userAdd", articleInfo );
	}

	// 2.1 글 리스트 보기
	public List<ArticleInfo> articleList( HashMap<String, String> map ) {
		return sqlSession.selectList( NS + ".articleList", map );
	}

	// 2.2 글 상세보기, 글 수정 폼으로 이동할때  정보 불러오기
	public void articleView( ArticleInfo articleInfo ) {
		sqlSession.selectOne( NS + ".articleView" );
	}

	// 3.2 글 수정 액션
	public void articleEdit( ArticleInfo articleInfo ) {
		sqlSession.update( NS + ".articleEdit", articleInfo );
	}

	// 4.1 글 삭제 액션
	public void articleDelete( ArticleInfo articleInfo ) {
		sqlSession.delete( NS + ".articleDelete", articleInfo );
	}

	// 특정 글에 대한 댓글 삭제
	public void commentDelete( ArticleInfo articleInfo ) {
		sqlSession.delete( NS + ".commentDelete", articleInfo );
	}

	// 5.1 댓글 등록 액션
	public void commentAdd( CommentInfo commentInfo ) {
		sqlSession.insert( NS + ".commentAdd", commentInfo );
	}

	// 5.2 댓글 수정 액션
	public void commentEdit( CommentInfo commentInfo ) {
		sqlSession.update( NS + ".commentEdit", commentInfo );
	}

	// 5.3 댓글 삭제 액션
	public void commentDelete( CommentInfo commentInfo ) {
		sqlSession.delete( NS + ".commentDelete", commentInfo );
	}

}
