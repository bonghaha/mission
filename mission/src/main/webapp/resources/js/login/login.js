

var login = {
		
	init : function() {
		
		login.bind();
		
	},
	
	bind : function() {
		$( "#btnLogin" ).click( function() {
			
			$( "#loginForm" ).attr( "action", "/login.action" );
			$( "#loginForm" ).attr( "method", "POST" );
			$( "#loginForm" ).submit();
			
/*			
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
						location.href = "/user_view?" + "userId" + "=" + loginUserInfo.userId;
					} else {
						alert("아이디나 비밀번호를 확인 후 다시 로그인 해 주세요.");
					}
				},
				error : function( xhr,status,error ) {
					alert("로그인 에러");
				}
			});
*/			
			
		});
		
		$( "#btnGoUserAdd" ).click( function() {
			
//			location.href = "/user_add";
			$( "#loginForm" ).attr( "action", "/user_add" );
			$( "#loginForm" ).attr( "method", "GET" );
			$( "#loginForm" ).submit();
			
		});
	}
}