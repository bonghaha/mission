

var userAdd = {
		
	
	
	init : function() {
		
		userAdd.bind();
		
	},
	
	bind : function() {
		
		// 유효성 검사
		var re_userId = /^[a-zA-Z0-9_-]{3,16}$/;							// 아이디 검사식
		var re_userPw = /^[a-z0-9_-]{6,18}$/; 								// 비밀번호 검사식
		var re_userName = /^[가-힣]{2,10}$/;									// 한글이름 검사식
		var re_userBirthday = /^[0-9]{2}[01][0-9][0-3][0-9]$/; 				// 생년월일 검사식
		var re_userResiNum = /^[1-4][0-9]{6}$/; 							// 주민번호뒷자리 검사식
		var re_userEmail = /^([\w\.-]+)@([a-z\d\.-]+)\.([a-z\.]{2,6})$/; 	// 이메일 검사식
		var re_userPhoneOne = /^[0-1]{3}$/; 								// 폰번호 앞
		var re_userPhoneTwo = /^[0-9]{4}$/; 								// 폰번호 가운데
		var re_userPhoneThr = /^[0-9]{4}$/; 								// 폰번호 뒤
//		var re_userAddress = /^[0-9]{4}$/; 									// 주소
		
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
		$( "#userIdHelper" ).after( "<strong></strong>" );
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
				s.text( "중복체크를 해주세요" );
			}
		});
		
		// 비번 유효성 검사
		$( "#userPwHelper" ).after( "<strong></strong>" );
		userPw.keyup( function() {
			var s = $( "#userPwHelper" ).next( "strong" );
			s.text( "" );										// 초기화
			if( userPw.val().length == 0 ) { 					// 입력 값이 없을 때
				s.text( "" );
			}else if( userPw.val().length < 6 ) { 				// 입력 값이 6보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPw.val().length > 18 ) { 				// 입력 값이 18보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPw.test( userPw.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 비번과 값 같은지 확인
		$( "#userPwForCheckHelper" ).after( "<strong></strong>" );
		userPwForCheck.keyup( function() {
			var s = $( "#userPwForCheckHelper" ).next( "strong" );
			s.text( "" );														// 초기화
			if( userPwForCheck.val().length == 0 ) { 							// 입력 값이 없을 때
				s.text( "" );
			}else if( userPwForCheck.val().length < 6 ) { 						// 입력 값이 3보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPwForCheck.val().length > 18 ) { 						// 입력 값이 16보다 클 때
				s.text( "너무 길어요" );
			}else if( userPw.val() != userPwForCheck.val() ){
				s.text( "일치하는 비밀번호를 입력해 주세요" );
			}else{
				s.text( "일치합니다" );
			}
		});
		
		// 이름 유효성 검사
		$( "#userNameHelper" ).after( "<strong></strong>" );
		userName.keyup( function() {
			var s = $( "#userNameHelper" ).next( "strong" );
			s.text( "" );											// 초기화
			if( userName.val().length == 0 ) { 						// 입력 값이 없을 때
				s.text( "" );
			}else if( userName.val().length < 2 ) { 				// 입력 값이 2보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userName.val().length > 10 ) { 				// 입력 값이 10보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userName.test( userName.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 생년월일 유효성 검사
		$( "#userBirthResiHelper" ).after( "<strong></strong>" );
		userBirthday.keyup( function() {
			var s = $( "#userBirthResiHelper" ).next( "strong" );
			s.text( "" );												// 초기화
			if( userBirthday.val().length == 0 ) { 						// 입력 값이 없을 때
				s.text( "" );
			}else if( userBirthday.val().length < 6 ) { 				// 입력 값이 6보다 작을 때
				s.text( "생년월일이 너무 짧아요" );
			}else if( userBirthday.val().length > 6 ) { 				// 입력 값이 6보다 클 때
				s.text( "생년월일이 너무 길어요" );
			}else if( re_userBirthday.test( userBirthday.val()) != true ){
				s.text( "생년월일 형식에 맞게 입력해주세요" );
			}else{
				s.text( "뒷자리를 입력해 주세요" );
			}
		});
		
		// 주민등록번호 뒷자리 검사
		userResiNum.keyup( function() {
			var s = $( "#userBirthResiHelper" ).next( "strong" );
			s.text( "" );												// 초기화
			if( userResiNum.val().length == 0 ) { 						// 입력 값이 없을 때
				s.text( "" );
			}else if( userResiNum.val().length < 7 ) { 					// 입력 값이 7보다 작을 때
				s.text( "뒷자리가 너무 짧아요" );
			}else if( userResiNum.val().length > 7 ) { 					// 입력 값이 7보다 클 때
				s.text( "뒷자리가 너무 길어요" );
			}else if( re_userResiNum.test( userResiNum.val()) != true ){
				s.text( "뒷자리를 형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 이메일 유효성 검사
		$( "#userEmailHelper" ).after( "<strong></strong>" );
		userEmail.keyup( function() {
			var s = $( "#userEmailHelper" ).next( "strong" );
			s.text( "" );												// 초기화
			if( userEmail.val().length == 0 ) { 						// 입력 값이 없을 때
				s.text( "" );
			}else if( re_userEmail.test( userEmail.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 휴대폰 번호 앞자리 유효성 검사
		$( "#userPhoneHelper" ).after( "<strong></strong>" );
		userPhoneOne.keyup( function() {
			var s = $( "#userPhoneHelper" ).next( "strong" );
			s.text( "" );													// 초기화
			if( userPhoneOne.val().length == 0 ) { 							// 입력 값이 없을 때
				s.text( "" );
			}else if( userPhoneOne.val().length < 3 ) { 					// 입력 값이 3보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPhoneOne.val().length > 3 ) { 					// 입력 값이 3보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPhoneOne.test( userPhoneOne.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 가운데자리 검사
		userPhoneTwo.keyup( function() {
			var s = $( "#userPhoneHelper" ).next( "strong" );
			s.text( "" );													// 초기화
			if( userPhoneTwo.val().length == 0 ) { 							// 입력 값이 없을 때
				s.text( "" );
			}else if( userPhoneTwo.val().length < 4 ) { 					// 입력 값이 4보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPhoneTwo.val().length > 4 ) { 					// 입력 값이 4보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPhoneTwo.test( userPhoneTwo.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 뒷자리 검사
		userPhoneThr.keyup( function() {
			var s = $( "#userPhoneHelper" ).next( "strong" );
			s.text( "" );													// 초기화
			if( userPhoneThr.val().length == 0 ) { 							// 입력 값이 없을 때
				s.text( "" );
			}else if( userPhoneThr.val().length < 4 ) { 					// 입력 값이 4보다 작을 때
				s.text( "너무 짧아요" );
			}else if( userPhoneThr.val().length > 4 ) { 					// 입력 값이 4보다 클 때
				s.text( "너무 길어요" );
			}else if( re_userPhoneThr.test( userPhoneThr.val()) != true ){
				s.text( "형식에 맞게 입력해주세요" );
			}else{
				s.text( "적당해요" );
			}
		});
		
		// 아이디 중복 검사
		$( "#idDupCheck" ).click( function() {
			
			var data = {
				userId : userId.val()	
			};
			
			$.ajax({
				type : "POST",
				url : "/user_idDupCheck.json",
				data : data,
				success : function( data ) {
					var s = $( "#userIdHelper" ).next( "strong" );
					if( $.trim( data.result ) == "0" && $.trim( data.userId ) != "" ) {
						s.text( "사용 가능한 아이디 입니다." );
					} else if( $.trim( data.userId ) == "" ) {
						s.text( "아이디를 입력하세요." );
					} else {
						s.text( "이미 사용중인 아이디입니다." );
					}
				},
				error : function( xhr,status,error ) {
					s.text( "중복체크 에러" );
				}
			});
		});
		
		// 확인버튼 클릭 시
		$( "#btnUserAdd" ).click( function() {
			
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
		});
		
		$( "#btnCancel" ).click( function() {
			location.href = "/login";
		});
	},
}




