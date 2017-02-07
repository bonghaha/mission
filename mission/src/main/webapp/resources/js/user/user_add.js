

var userAdd = {
	
	LOGIN_URL : "/login",
	URL_USERID : "userId",
		
	init : function() {
		
		userAdd.bind();
		
	},
	
	bind : function() {
		
		// 확인버튼 클릭 시
		$( "#btnUserAdd" ).click( function() {
			var userId = $( "#userId" ).val();
			var userPw = $( "#userPw" ).val();
			var userPwForCheck = $( "#userPwForCheck" ).val();
			var userName = $( "#userName" ).val();
			var userBirthday = $( "#userBirthday" ).val();
			var userResiNum = $( "#userResiNum" ).val();
			var userEmail = $( "#userEmail" ).val();
			var userPhoneOne = $( "#userPhoneOne" ).val();
			var userPhoneTwo = $( "#userPhoneTwo" ).val();
			var userPhoneThr = $( "#userPhoneThr" ).val();
			var userAddress = $( "#userAddress" ).val();
			
			var data = {
				userId : userId,
				userPw : userPw,
				userName : userName,
				userBirthday : userBirthday,
				userResiNum : userResiNum,
				userEmail : userEmail,
				userPhoneOne : userPhoneOne,
				userPhoneTwo : userPhoneTwo,
				userPhoneThr : userPhoneThr,
				userAddress : userAddress
			}
			
			$.ajax({
				type : "POST",
				url : "/user_add.json",
				data : data,
				dataType : "json",
				success : function() {
					alert("가입 되었습니다.");
					location.href = userAdd.LOGIN_URL;
				},
				error : function( e ) {
					alert("가입 실패");
					location.href = userAdd.LOGIN_URL; // ajax에러 수정 후 경로 바꾸기
				}
			});
		});
	}
}