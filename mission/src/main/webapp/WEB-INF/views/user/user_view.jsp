<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
/*
Controller : com.remarkablesoft.mission.user.controller.UserController
URL : user/user_view
*/
%>
<!DOCTYPE html>
<html>
<head>
<title>회원상세정보</title>
</head>
<body>
	<h1>회원상세정보</h1>
	<div>
		<table>
			<tr>
				<td>
					<span>회원 아이디</span>
				</td>
				<td>
					<span id="userId"></span>
				</td>
			</tr>
			<tr>
				<td>
					<span>이름</span>
				</td>
				<td>
					<span id="userName"></span>
				</td>
			</tr>
			<tr>
				<td>
					<span>주민등록번호</span>
				</td>
				<td>
					<span id="userBirthday"></span><span> - </span><span id="userResiNum"></span>
				</td>
			</tr>
			<tr>
				<td>
					<span>이메일 주소</span>
				</td>
				<td>
					<span id="userEmail"></span>
				</td>
			</tr>
			<tr>
				<td>
					<span>휴대폰 번호</span>
				</td>
				<td>
					<span id="userPhoneOne"></span><span> - </span><span id="userPhoneTwo"></span><span> - </span><span id="userPhoneThr"></span>
				</td>
			</tr>
			<tr>
				<td>
					<span>주소</span>
				</td>
				<td>
					<span id="userAddress"></span>
				</td>
			</tr>
		</table>
	</div>
	<form id="logoutForm" action="/logout" method="GET">
		<div>
			<span><input type="button" id="btnLogout" value="logout"></span>
		</div>
	</form>
	
<script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/js/user/user_view.js"></script>
<script type="text/javascript">
	$(function () {
		
		userView.init();
		
	})
</script>
</body>
</html>