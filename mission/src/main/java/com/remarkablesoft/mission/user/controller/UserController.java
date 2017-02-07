package com.remarkablesoft.mission.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.remarkablesoft.mission.user.model.UserService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 1.1 회원등록 폼 요청
	@RequestMapping( value = "/user_add", method = RequestMethod.GET )
	public String userAdd( ){
		System.out.println( "/user_add(GET) 컨트롤러 실행!" );
		return "user/user_add";
	}
	
	// 1.2 회원 등록 액션
	@RequestMapping( value = "/user_add.json", method = RequestMethod.POST )
	public void userAdd( UserInfo userInfo ){
		System.out.println( "/user_add.json 컨트롤러 실행!" );
		userService.userAdd( userInfo );
	}
	
	// 2. 회원상세정보 보기
	@RequestMapping( value = "/user_view", method = RequestMethod.GET )
	public ModelAndView userView( @RequestParam( value = ("userId"), required = false ) String userId,
			UserInfo userInfo){
		System.out.println("/user_view 컨트롤러 실행!");
		userInfo.setUserId(userId);
		userService.userView(userInfo);
		
		System.out.println();
		ModelAndView modelAndView = new ModelAndView( "user/user_view", userId, userInfo );
		return modelAndView;
	}
	
	// 2. 회원상세정보 보기
//	@RequestMapping( value = "/user_view.json", method = RequestMethod.POST )
//	public @ResponseBody UserInfo userView( UserInfo userInfo){
//		System.out.println( "userId : " + userInfo.getUserId());
//		System.out.println( "userName : " + userInfo.getUserPw());
//		
//		return userService.userView(userInfo);
//	}
}
