<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="css/custom.css"> -->
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
<script language="javascript" src="register.js"></script>

<style>
#radio {
	margin-left: 15px;
}

#homeTag {
	margin-bottom: 5%;
}

h1 {
	text-align: center;
	margin-bottom: 20ox;
}

th {
	text-align: left;
	width: 100px;
	height: 45px;
}

.table {
	width: 25%;
	max-width: 50%;
	margin-left: auto;
	margin-right: auto;
}

.nav>li>a {
	border-radius: 15px;
}

#ulul {
	width: 50%;
}

li {
	border-radius: 15px;
}

.nav>li>a {
	padding: 10px 15px;
}

.navbar-nav>li>a {
	line-height: 10px;
}

.nav>li>a:hover {
	text-decoration: none;
	background-color: #FFFFFF;
}

.nav>li:FIRST-CHILD {
	background-color: #FFFFFF
}

.nav>li:nth-child(2) {
	background-color: #FFFFFF
}
</style>


</head>
<body>
	<div id="homeTag" class="manage-label" align="center">
		<h1>
			<a href="main.do" class="label label-primary">DreamUp</a>
		</h1>
	</div>

	<h1>회원가입</h1>
	<form action="register.do" method="post" name="member_Info">
		<div>
			<table class="table">

				<th><input type="text" id="member_Name" name="member_Name"
					class="form-control" placeholder="아이디"></th>
				<tr></tr>

				<th><input type="password" id="member_Phone"
					name="member_Phone" class="form-control" placeholder="비밀번호"></th>
				<tr></tr>

				<th><input type="password" id="member_Phone"
					name="member_Phone" class="form-control" placeholder="비밀번호 재입력"></th>
				<tr></tr>

				<th><input type="text" id="member_Share" name="member_Share"
					class="form-control" placeholder="이름"></th>
				<tr></tr>

				<!-- <th>주소</th> -->
				<th><input type="text" id="member_Address"
					name="member_Address" class="form-control" placeholder="Email"></th>
				<tr></tr>

			</table>

			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right" id="ulul">
					<input type="submit" class="btn btn-success" value="회원가입">
					<button id="cancle" class="btn btn-danger">취소</button>
				</ul>
			</div>
		</div>
	</form>


</body>
</html>