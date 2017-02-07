<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원상세정보</title>
</head>
<body>
	<h1>회원상세정보</h1>
	<div>
		<table>
			<tbody id="userViewArea">
				<tr>
					<td>
						<span>회원 아이디</span>
					</td>
					<td>
						<span data-userId></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>이름</span>
					</td>
					<td>
						<span data-userName></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>주민등록번호</span>
					</td>
					<td>
						<span data-userBirthday></span><span> - </span><span data-userResiNum></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>이메일 주소</span>
					</td>
					<td>
						<span data-userEmail></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>휴대폰 번호</span>
					</td>
					<td>
						<span data-userPhoneOne></span><span>-</span><span data-userPhoneTwo></span><span>-</span><span data-userPhoneThr></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>주소</span>
					</td>
					<td>
						<span data-userAddress></span>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	
<script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/js/user/user_view.js"></script>
<script type="text/javascript">
	$(function () {
		
		userView.init();
		
	})
</script>
</body>
</html>