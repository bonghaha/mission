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
		return "login/login";
	}
	
	// 1.2 login 액션
	@RequestMapping( value = "/login.action", method = RequestMethod.POST )
	public @ResponseBody UserInfo login(HttpServletRequest request, HttpServletResponse response, UserInfo userInfo ) {
		HttpSession session = request.getSession();
		
		UserInfo loginUserInfo = loginService.checkUser( userInfo ); 
		
		// 로그인 정보가 없다면
		if(  loginUserInfo == null ) {
			return null;
			
		// userLogin값 체크 완료
		} else {
			String loginId = userInfo.getUserId();
			session.setAttribute( "userId" , loginId);
			return loginUserInfo;
		}
	}
	
	// 1. logout
	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout( HttpServletRequest request, HttpServletResponse response ) {
		HttpSession session = request.getSession();
		if( session.getAttribute( "userId" ) != null ) {
			session.invalidate();
		}
		return "redirect:/login";
	}
}
