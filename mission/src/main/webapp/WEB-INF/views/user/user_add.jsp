<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
/*
Controller : com.remarkablesoft.mission.user.controller.UserController
URL : user/user_add
*/
%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
	<h1>회원 가입</h1>
	<div>
		<form id="userAddForm">
			<div>
				<table class="table">
					<tr>
						<td class="">
							<span>*</span><span>회원 아이디</span>
						</td>
						<td>
							<span><input type="text" id="userId" name="userId"/></span>
							<span><input type="button" id="idDupCheck" class="btn btn-primary btn-xs" value="중복체크"/></span>
							<span id="userIdHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>*</span><span>비밀번호</span>
						</td>
						<td>
							<span><input type="password" id="userPw" name="userPw"/></span>
							<span id="userPwHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>*</span><span>비밀번호확인</span>
						</td>
						<td>
							<span><input type="password" id="userPwForCheck" name="userPwForCheck"/></span>
							<span id="userPwForCheckHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>*</span><span>이름</span>
						</td>
						<td>
							<span><input type="text" id="userName" name="userName"/></span>
							<span id="userNameHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>*</span><span>주민등록번호</span>
						</td>
						<td>
							<span><input type="text" id="userBirthday" name="userBirthday"/></span><span> - </span><span><input type="password" id="userResiNum" name="userResiNum"/></span>
							<span id="userBirthResiHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>*</span><span>이메일 주소</span>
						</td>
						<td>
							<span><input type="text" id="userEmail" name="userEmail"/></span>
							<span id="userEmailHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>휴대폰 번호</span>
						</td>
						<td>
							<span><input type="text" id="userPhoneOne" name="userPhoneOne"/></span><span> - </span><span><input type="text" id="userPhoneTwo" name="userPhoneTwo"/></span><span> - </span><span><input type="text" id="userPhoneThr" name="userPhoneThr"></span>
							<span id="userPhoneHelper"></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>주소</span>
						</td>
						<td>
							<span><textarea id="userAddress" name="userAddress" rows="2" cols="40"></textarea></span>
							<span id="userAddressHelper"></span>
						</td>
					</tr>
				</table>
			</div>
			<div>
				<span>
					<input type="button" id="btnUserAdd" class="btn btn-primary btn-xs" value="확인"/>
				</span>
				<span>
					<input type="button" id="btnCancel" class="btn btn-primary btn-xs" value="취소"/>
				</span>
			</div>
		</form>
	</div>


<script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/js/user/user_add.js"></script>
<script type="text/javascript">
	$(function () {
		
		userAdd.init();
		
	})
</script>
</body>
</html>