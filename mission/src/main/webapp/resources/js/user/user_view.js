
var userView = {
		
	USER_ID : "userId",
		
	init : function() {
		
		userView.bind();
		userView.view();
		
	},
	
	bind : function() {
		
	},
	
	view : function() {
		var userId = $.urlParam(userView.USER_ID);
		
		var data = {
			userId : userId	
		};
		
		console.log();
		userView.display();
		// 회원 상세정보 보여주기
//		$.ajax({
//			type : "POST",
//			url : "/user_view.json",
//			data : data,
//			dataType : "json",
//			success : function( data ) {
//				userView.display( data );
//			},
//			complete : function( data ) {
//				console.log( "userId : " + data.userId );
//				console.log( "userName : " + data.userName );
//			},
//			error : function( data ) {
////				console.log( "userId : " + data.userId );
////				console.log( "userName : " + data.userName );
//				userView.display( data ); // ajax에러 확인 후 수정
//			}
//		});
		
	},
	
	display : function( data ) {
		$( "[data-userId]" ).text( data.userId );
		$( "[data-userName]" ).text( data.userName );
	}
	
	
}

// url의 특정 key의 값 가져오기
$.urlParam = function(name){
	var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
	return results[1] || 0;
}