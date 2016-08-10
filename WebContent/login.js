$(document).ready(function() {
	$("#txt_user_name").focus();

	$("#btn_login").click(function() {
		var userJson = {"username":"solomon","password":"sa1"};
		$.ajax({
			type : "POST",
			url : "/HFM/login/validate_user",
			contentType : "application/json; charset=utf-8",
			data : userJson,
			dataType : "json",
			success : function(result) {
				alert("请求已提交！我们会尽快与您取得联系");
			}
		});
	});
});