<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=10, initial-scale=1">

<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<!-- jquery CDN -->
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<!-- bootstrap -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>

<!-- css -->
<style type="text/css">
.form-login {
	max-width: 330px;
}

.form-control {
	postion: relative;
}

.form-login input[type="text"] {
	margin-bottom: -1px;
}

.form-login input[type="password"] {
	margin-bottom: 5px;
}

.container {
	margin-top: 10%;
}
.image{
	width: 20%;
	height :20%;
}
</style>

</head>
<body>

	<div class="container" align="center">
			<center>
				<img class="image" src="../../image/daemang2.jpg">
			</center>
		</a> <br>

		<form class="form-login" action="" method="post">
			<label for="managerid"></label>
			<div>
				<input class="form-control" type="text" name="" placeholder="아이디"
					required autofocus> <label for="managerpwd"></label> <input
					class="form-control" type="password" name="" placeholder="비밀번호">
					
				<button class="btn btn-lg btn-primary btn-block" type="submit"
					id="btnlogin">로그인</button>
			</div>
		</form>
	</div>

</body>
</html>