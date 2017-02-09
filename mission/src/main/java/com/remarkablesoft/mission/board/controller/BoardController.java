package com.remarkablesoft.mission.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.remarkablesoft.mission.board.model.BoardService;
import com.remarkablesoft.mission.board.vo.ArticleInfo;
import com.remarkablesoft.mission.board.vo.CommentInfo;

@Controller
@RequestMapping( "/board" )
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 1.1 게시글 등록 폼 요청
	@RequestMapping( value = "/article_add", method = RequestMethod.GET )
	public String articleAdd() {
		return "board/article/article_add";
	}
	
	// 1.2 게시글 등록 액션
	@RequestMapping( value = "/article_add.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> articleAdd( ArticleInfo articleInfo ) {
		boardService.articleAdd( articleInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "등록하였습니다.");
		return map;
	}
	
	// 2.1 글 리스트 보기
	@RequestMapping( value = "/article_list", method = RequestMethod.GET )
	public @ResponseBody List<ArticleInfo> articleList() {
		// 검색조건, 검색단어, 페이징 관련 값 맵핑
		HashMap<String, String> map = null;
		
		List<ArticleInfo> articleList = boardService.articleList( map );
		return articleList;
	}
	
	// 2.2 글 상세보기
	@RequestMapping( value = "/article_view", method = RequestMethod.GET )
	public void articleView( ArticleInfo articleInfo ) {
		boardService.articleView( articleInfo );
	}
	
	// 3.1 글 수정 폼 요청
	@RequestMapping( value = "/article_edit", method = RequestMethod.POST )
	public String articleEditForm( ArticleInfo articleInfo ) {
		boardService.articleView( articleInfo );
		return "board/article/article_edit";
	}
	
	// 3.2 글 수정 액션
	@RequestMapping( value = "/article_edit.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> articleEdit( ArticleInfo articleInfo ) {
		boardService.articleEdit( articleInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "수정되었습니다.");
		return map;
	}
	
	// 4.1 글 삭제 액션 + 댓글 삭제 액션
	@RequestMapping( value = "/article_delete.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> articleDelete( ArticleInfo articleInfo ) {
		
		// 특정 글에 대한 댓글 삭제
		boardService.commentDelete( articleInfo );
		
		// 댓글 삭제 후 글 삭제
		boardService.articleDelete( articleInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "삭제되었습니다.");
		return map;
	}
	
	// 5.1 댓글 등록 액션
	@RequestMapping( value = "/comment_add.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> commentAdd( CommentInfo commentInfo ) {
		boardService.commentAdd( commentInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "댓글 등록");
		return map;
	}
	
	// 5.2 댓글 수정 액션
	@RequestMapping( value = "/comment_edit.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> commentEdit( CommentInfo commentInfo ) {
		boardService.commentEdit( commentInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "댓글 수정");
		return map;
	}
	
	// 5.3 댓글 삭제 액션
	@RequestMapping( value = "/comment_delete.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> commentDelete( CommentInfo commentInfo ) {
		boardService.commentDelete( commentInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("code","1");
		map.put("msg", "댓글 삭제");
		return map;
	}
}
