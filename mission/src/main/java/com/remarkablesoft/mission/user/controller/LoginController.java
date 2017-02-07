package com.remarkablesoft.mission.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.remarkablesoft.mission.user.model.LoginService;
import com.remarkablesoft.mission.user.vo.UserInfo;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	// 1.1 login 폼으로 가기
	@RequestMapping( value = "/login", method = RequestMethod.GET )
	public String login() {
		System.out.println("/login(GET) 컨트롤러 실행!");
		return "login/login";
	}
	
	// 1.2 login 액션
	@RequestMapping( value = "/login.json", method = RequestMethod.POST )
	public @ResponseBody UserInfo login(HttpServletRequest request, HttpServletResponse response, UserInfo userInfo ) {
		HttpSession session = request.getSession();
		
		String loginId = userInfo.getUserId();
		
		userInfo = loginService.checkUser( userInfo );
		if( userInfo == null ) {
			return null;
			
		} else {
			session.setAttribute( "userId" , loginId);
			return userInfo;
		}
	}
	
	// 1. logout
	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout() {
		return "logout/logout";
	}
}
