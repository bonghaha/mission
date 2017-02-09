package com.remarkablesoft.mission.board.model.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.remarkablesoft.mission.board.model.BoardService;
import com.remarkablesoft.mission.board.vo.ArticleInfo;
import com.remarkablesoft.mission.board.vo.CommentInfo;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	// 1.2 게시글 등록 액션
	@Override
	public void articleAdd( ArticleInfo articleInfo ) {
		boardDAO.userAdd( articleInfo );
	}

	// 2.1 글 리스트 보기
	@Override
	public List<ArticleInfo> articleList( HashMap<String, String> map ) {
		return boardDAO.articleList( map );
	}

	// 2.2 글 상세보기, 글 수정 폼으로 이동할때  정보 불러오기
	@Override
	public void articleView( ArticleInfo articleInfo ) {
		boardDAO.articleView( articleInfo );
	}

	// 3.2 글 수정 액션
	@Override
	public void articleEdit( ArticleInfo articleInfo ) {
		boardDAO.articleEdit( articleInfo );
	}

	// 4.1 글 삭제 액션
	@Override
	public void articleDelete( ArticleInfo articleInfo ) {
		boardDAO.articleDelete( articleInfo );
	}

	// 특정 글에 대한 댓글 삭제
	@Override
	public void commentDelete( ArticleInfo articleInfo ) {
		boardDAO.commentDelete( articleInfo );
	}

	// 5.1 댓글 등록 액션
	@Override
	public void commentAdd( CommentInfo commentInfo ) {
		boardDAO.commentAdd( commentInfo );
	}

	// 5.2 댓글 수정 액션
	@Override
	public void commentEdit( CommentInfo commentInfo ) {
		boardDAO.commentEdit( commentInfo );
	}

	// 5.3 댓글 삭제 액션
	@Override
	public void commentDelete( CommentInfo commentInfo ) {
		boardDAO.commentDelete( commentInfo );
	}

}
