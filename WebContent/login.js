$(document).ready(function() {
	$("#txt_user_name").focus();
	$("#btn_login").click(function() {
		var username = $("#txt_user_name").val();
		var password = $("#txt_password").val();
		var userJson = {
			"username" : username,
			"password" : password
		};
		$.ajax({
			type : "POST",
			url : "/HFM/login/validate_user",
			contentType : "application/json; charset=utf-8",
			data : JSON.stringify(userJson),
			dataType : "json",
			success : function(result) {
				if (result) {
					$("#validation_result").html("Login Successfully!");
				} else {
					$("#validation_result").html("Login Failed!");
				}
			}
		});
	});
	$("#btn_list_all_users").click(function() {
		$.ajax({
			type : "POST",
			url : "/HFM/login/list_all_users",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			success : function(result) {
				var trHTML = "";
				$.each(result, function(key, user) {
					trHTML = "<tr><td>" + user.username + "</td><td>"+user.password+"</td></tr>";
					$("#tb_users").append(trHTML);
				});

			}
		});
	});
});