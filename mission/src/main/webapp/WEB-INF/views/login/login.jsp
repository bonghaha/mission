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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style>
	.info{ width : 150px; }
</style>
</head>
<body>
	<div>
		<h3>
			Login  
		</h3>
		<div>
			<div>
				<table class="table">
					<tr>
						<td class="info">아이디</td>
						<td class="active"><input type="text" id="loginId"/></td>
					</tr>
					<tr>
						<td class="info">비밀번호</td>
						<td class="active"><input type="password" id="loginPw"/></td>
					</tr>
				</table>
			</div>
			<div>
				<span><input type="button" id="btnLogin" class="btn btn-primary btn-xs" value="로그인"></span>
			</div>
			<hr/>
			<div>
				<span>아직 회원이 아니시라면 </span><span><input type="button" id="btnGoUserAdd" class="btn btn-primary btn-xs" value="회원가입"></span>
			</div>
		</div>
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