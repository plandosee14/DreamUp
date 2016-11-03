<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login View</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.form-horizontal {
	margin-left: 38%;
}
</style>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#login').click(function() {
			if ($('#id').val() == "") {
				alert('아이디를 입력하세요');
				$('#id').focus();
				return false;
			} else if ($('#pass').val() == "") {
				alert('비밀번호를 입력하세요');
				$('#pass').focus();
				return false;
			}
		});//click event
	});//ready
</script>
</head>
<body>
	<%-- 	<c:if test="${login-fail}=='fail'">
		<script type="text/javascript">
			alert("로그인 실패라네여~");
		</script>
	</c:if> --%>
	<!-- 
	여기는 로그인 페이지입니다
	<h3>로그인 폼</h3>
	<hr>
	<form action="login-ing.do" method="get">
		아이디: <input type="text" name="id"><br> 비밀번호: <input
			type="password" name="pass"><br> <input type="submit"
			value="로그인"> <input type="button" value="회원가입"
			onclick="location='join.do'">

	</form> -->
	<div class="container">
		<center>

			<h2>로그인</h2>
		</center>
		<form class="form-horizontal" action="login-ing.do" method="get">
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">아이디 :</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="id" name="id"
						placeholder="아이디를 입력하세요">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pass">비밀번호 :</label>
				<div class="col-sm-4">
					<input type="password" class="form-control" id="pass" name="pass"
						placeholder="비밀번호를 입력하세요">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10"></div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input id="login" class="btn btn-default" type="submit" value="로그인">
					<input class="btn btn-default" type="button" value="회원가입"
						onclick="location='join.do'">
				</div>
			</div>
		</form>
	</div>
</body>
</html>