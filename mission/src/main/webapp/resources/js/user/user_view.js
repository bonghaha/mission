
var userView = {
		
	init : function() {
		
		userView.bind();
		userView.view();
		
	},
	
	bind : function() {
		
		$( "#btnLogout" ).click( function() {
			$( "#logoutForm" ).submit();
		});
		
	},
	
	view : function() {
		
		var userId = $.urlParam( "userId" );
		
		var data = {
			userId : userId
		};
		
		// 회원 상세정보 가져오기
		$.ajax({
			type : "POST",
			url : "/user_view.json",
			data : data,
			success : function( data ) {
				userView.display( data );
			},
			error : function( xhr,status,error ) {
				
			}
		});
		
	},
	
	display : function( data ) {
		$( "#userId" ).text( data.userId );
		$( "#userName" ).text( data.userName );
		$( "#userBirthday" ).text( data.userBirthday );
		$( "#userResiNum" ).text( data.userResiNum );
		$( "#userEmail" ).text( data.userEmail );
		$( "#userPhoneOne" ).text( data.userPhoneOne );
		$( "#userPhoneTwo" ).text( data.userPhoneTwo );
		$( "#userPhoneThr" ).text( data.userPhoneThr );
		$( "#userAddress" ).text( data.userAddress );
	}
}

// url의 특정 key의 값 가져오기
$.urlParam = function(name){
	var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
	return results[1] || 0;
}