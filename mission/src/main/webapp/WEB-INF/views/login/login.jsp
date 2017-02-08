<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
/*
Controller : com.remarkablesoft.mission.user.controller.LoginController
URL : login/login
*/
%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h3>
		Login  
	</h3>
	<div>
		<form id="loginForm">
			<div>
				<table>
					<tr>
						<td>아이디</td>
						<td><input type="text" id="loginId" name="loginId"/></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" id="loginPw" name="loginPw"/></td>
					</tr>
				</table>
			</div>
			<div>
				<span><input type="button" id="btnLogin" value="로그인"></span>
			</div>
			<hr/>
			<div>
				<span>아직 회원이 아니시라면 </span><span><input type="button" id="btnGoUserAdd" value="회원가입"></span>
			</div>
		</form>
	</div>
<script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/js/login/login.js"></script>
<script type="text/javascript">
	$(function () {
		
		login.init();
		
	})
</script>
</body>
</html>