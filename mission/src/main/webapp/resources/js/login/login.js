

var login = {
		
	URL_USERID : "userId",
		
	init : function() {
		
		login.bind();
		
	},
	
	bind : function() {
		$( "#btnLogin" ).click( function() {
			var loginId = $( "#loginId" ).val();
			var loginPw = $( "#loginPw" ).val();
			
			$.ajax({
				type : "POST",
				url : "/login.json",
				data : {
					userId : loginId,
					userPw : loginPw
				},
				success : function( loginUserInfo ) {
					console.log( "loginUserInfo : " + loginUserInfo );
					if( loginUserInfo != "" ) {
						console.log( "userId : " + loginUserInfo.userId );
						location.href = "/user_view?" + login.URL_USERID + "=" + loginUserInfo.userId;
					} else {
						alert("아이디나 비밀번호를 확인 후 다시 로그인 해 주세요.");
					}
				},
				error : function( xhr,status,error ) {
					alert("로그인 에러");
				}
			});
		});
		
		$( "#btnGoUserAdd" ).click( function() {
			location.href = "/user_add";
		});
	}
}