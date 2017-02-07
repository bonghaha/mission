

var login = {
		
	URL_USERID : "userId",
		
	init : function() {
		login.bind();
	},
	
	bind : function() {
		$( "#btnLogin" ).click( function() {
			var loginId = $( "#loginId" ).val();
			var loginPw = $( "#loginPw" ).val();
			
			var data = {
					userId : loginId,
					userPw : loginPw
			}
			
			$.ajax({
				type : "POST",
				url : "/login.json",
				data : data,
				dataType : "json",
				success : function( data ) {
					alert("로그인 성공");
					location.href = "/user_view?" + login.URL_USERID + "=" + data.userId;
				},
				error : function( e ) {
					alert("로그인 실패");
					location.href = "/user_view?" + login.URL_USERID + "=" + data.userId; // ajax에러 수정 후 경로 바꾸기
				}
			});
		});
	}
		
}