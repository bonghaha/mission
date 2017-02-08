package com.remarkablesoft.mission.user.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.remarkablesoft.mission.user.model.UserService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 1.1 회원등록 폼 요청
	@RequestMapping( value = "/user_add", method = RequestMethod.GET )
	public String userAdd( ){
		return "user/user_add";
	}
	
	// 1.2 회원 등록 액션
	@RequestMapping( value = "/user_add.json", method = RequestMethod.POST )
	public @ResponseBody HashMap<String, String> userAdd( UserInfo userInfo ){
		userService.userAdd( userInfo );
		
		// 서버에서 아무것도 응답하지 않기 때문에 404 not found -> Response 객체에 응답값을 설정해주면 404에러 발생X
		HashMap<String, String> map = new HashMap<String, String>();
	    map.put("code","1");
	    map.put("msg", "등록하였습니다.");
	    return map;
	}
	
	// 2.1 회원상세정보 보기
	@RequestMapping( value = "/user_view", method = RequestMethod.GET )
	public String userView( HttpServletRequest request, HttpServletResponse response ) {
		HttpSession session = request.getSession();
		
		if( session.getAttribute( "userId" ) == null ) {
			return "redirect:/login";
		} else {
			return "user/user_view";
		}
	}
	
	// 2.2 회원상세정보 가져오기
	@RequestMapping( value = "/user_view.json", method = RequestMethod.POST )
	public @ResponseBody UserInfo userView( UserInfo userInfo ){
		return userService.userView(userInfo);
	}
}
