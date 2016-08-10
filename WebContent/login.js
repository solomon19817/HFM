$(document).ready(function() {
	$("#txt_user_name").focus();

	$("#btn_login").click(function() {
		var user = {username:"Solomon",password:"sa"};
		$.ajax({
			type : "POST",
			url : "/HFM/login/validate_user",
			contentType : "application/json; charset=utf-8",
			data : user,
			dataType : "json",
			success : function(result) {
				alert("请求已提交！我们会尽快与您取得联系");
			}
		});
	});
});