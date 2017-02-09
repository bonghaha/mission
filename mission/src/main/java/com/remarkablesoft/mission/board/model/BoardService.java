package com.remarkablesoft.mission.board.model;

import java.util.HashMap;
import java.util.List;

import com.remarkablesoft.mission.board.vo.ArticleInfo;
import com.remarkablesoft.mission.board.vo.CommentInfo;

public interface BoardService {

	// 1.2 게시글 등록 액션
	public void articleAdd( ArticleInfo articleInfo );

	// 2.1 글 리스트 보기
	public List<ArticleInfo> articleList( HashMap<String, String> map);

	// 2.2 글 상세보기, 글 수정 폼으로 이동할때  정보 불러오기
	public void articleView( ArticleInfo articleInfo );

	// 3.2 글 수정 액션
	public void articleEdit( ArticleInfo articleInfo );

	// 4.1 글 삭제 액션
	public void articleDelete( ArticleInfo articleInfo );

	// 특정 글에 대한 댓글 삭제
	public void commentDelete( ArticleInfo articleInfo );
	
	// 5.1 댓글 등록 액션
	public void commentAdd( CommentInfo commentInfo );

	// 5.2 댓글 수정 액션
	public void commentEdit( CommentInfo commentInfo );

	// 5.3 댓글 삭제 액션
	public void commentDelete( CommentInfo commentInfo );


}
