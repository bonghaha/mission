

var userAdd = {
	
	init : function() {
		
		userAdd.bind();
		
	},
	
	bind : function() {
		
		// 유효성 검사
//		userAdd.valRule();
		var re_userId = /^[a-zA-Z0-9_-]{3,16}$/;							// 아이디 검사식
		var re_userPw = /^[a-z0-9_-]{6,18}$/; 								// 비밀번호 검사식
		var re_userKorName = /^[가-힣]{2,10}$/;								// 한글이름 검사식
		var re_userEngName = /^[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/;			// 영어이름 검사식
		var re_userBirthday = /^[0-9]{6}$/; 								// 생년월일 검사식
		var re_userResiNum = /^[0-9]{7}$/; 									// 주민번호뒷자리 검사식
		var re_userEmail = /^([\w\.-]+)@([a-z\d\.-]+)\.([a-z\.]{2,6})$/; 	// 이메일 검사식
		var re_userPhoneOne = /^[0-9]{3}$/; 								// 폰번호 앞
		var re_userPhoneTwo = /^[0-9]{4}$/; 								// 폰번호 가운데
		var re_userPhoneThr = /^[0-9]{4}$/; 								// 폰번호 뒤
		var re_userAddress = /^[0-9]{4}$/; 									// 주소
		
		var userId = $( "#userId" );
		var userPw = $( "#userPw" );
		var userPwForCheck = $( "#userPwForCheck" );
		var userName = $( "#userName" );
		var userBirthday = $( "#userBirthday" );
		var userResiNum = $( "#userResiNum" );
		var userEmail = $( "#userEmail" );
		var userPhoneOne = $( "#userPhoneOne" );
		var userPhoneTwo = $( "#userPhoneTwo" );
		var userPhoneThr = $( "#userPhoneThr" );
		var userAddress = $( "#userAddress" );
		
		// 아이디 유효성 검사
		$( $( "#infoMemberIdHelper" ) ).after( "<strong></strong>" );
		userId.keyup( function() {
			var s = $( "#userIdHelper" ).next( "strong" );
			s.text( "" ); 										// 초기화
			if( userId.val().length == 0 ) { 					// 입력 값이 없을 때
				s.text( "" );
			}else if( userId.val().length < 3 ) { 				// 입력 값이 3보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userId.val().length > 16 ) { 				// 입력 값이 16보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userId.test( userId.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{ 												// 입력 값이 3 이상 16 이하일 때
				s.text( "중복확인을 하세요" );
			}
		});
		
		// 비번 유효성 검사
		userPw.keyup( function() {
			var s = $( "#userPwHelper" ).next( "strong" );
			s.text( "" );										//초기화
			if( userPw.val().length == 0 ) { 					// 입력 값이 없을 때
				s.text( "" );
			}else if( userPw.val().length < 6 ) { 				// 입력 값이 3보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPw.val().length > 18 ) { 				// 입력 값이 16보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPw.test( userPw.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{ 												// 입력 값이 3 이상 16 이하일 때
				s.text( "적당해요" );
			}
		});
		
		// 비번과 값 같은지 확인
		userPwForCheck.keyup( function() {
			var s = $( "#userPwForCheckHelper" ).next( "strong" );
			s.text( "" );														//초기화
			if( userPwForCheck.val().length == 0 ) { 							// 입력 값이 없을 때
				s.text( "" );
			}else if( userPwForCheck.val().length < 6 ) { 						// 입력 값이 3보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPwForCheck.val().length > 18 ) { 						// 입력 값이 16보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPwForCheck.test( userPwForCheck.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{ 																// 입력 값이 3 이상 16 이하일 때
				s.text( "적당해요" );
			}
		});
		
		// 이름 유효성 검사
		userName.keyup( function() {
			var s = $( "#userNameHelper" ).next( "strong" );
			s.text( "" );	//초기화
			
			if( userName.val().length == 0 ) { // 입력 값이 없을 때
				s.text( "" ); // strong 요소에 포함된 문자 지움
			}
			
			// 한글이름입력시
			if( re_userKorName.test( userName.val()) == /^[가-힣]$/ ) {
				if( userName.val().length < 2 ) { 							// 한글 입력 값이 3보다 작을 때
					s.text( "너무 짧아요" );
				}else if( userName.val().length > 10 ) { 					// 한글 입력 값이 10보다 클 때
					s.text( "너무 길어요" );
				}else if( re_userKorName.test( userName.val()) != true ){
					s.text( "형식에 맞게 입력해주세요" );
				}else {
					s.text( "적당해요" );
				}
				
			// 영어이름입력시
			}else if( re_userKorName.test( userName.val()) == /^[a-zA-Z]$/ ) {
				if( userName.val().length < 2 ) { 							// 영어 입력 값이 3보다 작을 때
					s.text( "너무 짧아요" );
				}else if( userName.val().length > 21 ) { 					// 영어 입력 값이 10보다 클 때
					s.text( "너무 길어요" );
				}else if( re_userEngName.test( userName.val()) != true ){
					s.text( "형식에 맞게 입력해주세요" );
				}else {
					s.text( "적당해요" );
				}
			}
		});
		
		// 확인버튼 클릭 시
		$( "#btnUserAdd" ).click( function() {
			
			$( "#userAddForm" ).attr( "action", "/user_add.action" );
			$( "#userAddForm" ).attr( "method", "POST" );
			$( "#userAddForm" ).submit();
			
			/*
			// 회원 등록 됐을 경우
			alert("가입 되었습니다.");
			location.href = "/login";
			
			// 회원 등록 실패 했을 경우
			*/
			
/*			
			var userId = $( "#userId" );
			var userPw = $( "#userPw" );
			var userPwForCheck = $( "#userPwForCheck" );
			var userName = $( "#userName" );
			var userBirthday = $( "#userBirthday" );
			var userResiNum = $( "#userResiNum" );
			var userEmail = $( "#userEmail" );
			var userPhoneOne = $( "#userPhoneOne" );
			var userPhoneTwo = $( "#userPhoneTwo" );
			var userPhoneThr = $( "#userPhoneThr" );
			var userAddress = $( "#userAddress" );
			
			var data = {
				userId : userId.val(),
				userPw : userPw.val(),
				userName : userName.val(),
				userBirthday : userBirthday.val(),
				userResiNum : userResiNum.val(),
				userEmail : userEmail.val(),
				userPhoneOne : userPhoneOne.val(),
				userPhoneTwo : userPhoneTwo.val(),
				userPhoneThr : userPhoneThr.val(),
				userAddress : userAddress.val()
			};
			
			$.ajax({
				type : "POST",
				url : "/user_add.json",
				data : data,
				dataType : "text",
				success : function() {
					alert("가입 되었습니다.");
					location.href = "/login";
				},
				error : function( xhr,status,error ) {
					alert("가입 실패");
				}
			});
*/			
			
		});
		
		$( "#btnCancel" ).click( function() {
			
//			location.href = "/login";
			$( "#userAddForm" ).attr( "action", "/login" );
			$( "#userAddForm" ).attr( "method", "GET" );
			$( "#userAddForm" ).submit();
			
		});
	},
	
	valRule : function() {
		
		
	}
}




