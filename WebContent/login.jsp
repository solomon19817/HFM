<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="/HFM/resources/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="/HFM/login.js"></script>
<title>Login</title>
</head>
<body>
	<table id="tb_login">
		<tr>
			<td>User Name : </td>
			<td><input type = "text" id="txt_user_name" value=""/></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type = "password" id="txt_password" value=""/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type = "button" id="btn_login" value="Login"/></td>
		</tr>
		<tr>
			<td colspan="2"><span id="validation_result"></span></td>
		</tr>
	</table>
	<table id="tb_users">
		<tr>
			<td><input type = "button" id="btn_list_all_users" value="List All Users"/></td>
		</tr>
	</table>
</body>
</html>