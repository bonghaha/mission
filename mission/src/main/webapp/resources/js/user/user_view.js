
var userView = {
		
	USER_ID : "userId",
		
	init : function() {
		
		userView.bind();
		userView.view();
		
	},
	
	bind : function() {
		$( "#btnLogout" ).click( function() {
			location.href = "/logout";
		});
	},
	
	view : function() {
		
		var userId = $.urlParam(userView.USER_ID);
		
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
		$( "[data-userId]" ).text( data.userId );
		$( "[data-userName]" ).text( data.userName );
		$( "[data-userBirthday]" ).text( data.userBirthday );
		$( "[data-userResiNum]" ).text( data.userResiNum );
		$( "[data-userEmail]" ).text( data.userEmail );
		$( "[data-userPhoneOne]" ).text( data.userPhoneOne );
		$( "[data-userPhoneTwo]" ).text( data.userPhoneTwo );
		$( "[data-userPhoneThr]" ).text( data.userPhoneThr );
		$( "[data-userAddress]" ).text( data.userAddress );
	}
}

// url의 특정 key의 값 가져오기
$.urlParam = function(name){
	var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
	return results[1] || 0;
}