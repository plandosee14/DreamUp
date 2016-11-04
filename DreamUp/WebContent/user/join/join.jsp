<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#register').click(function() {
			if ($('#id').val() == "") {
				alert('아이디를 입력하세요');
				$('#id').focus();
				return false;
			} else if ($('#pass').val() == "") {
				alert('비밀번호를 입력하세요');
				$('#pass').focus();
				return false;
			} else if ($('#passCheck').val() == "") {
				alert('비밀번호를 다시 입력하세요');
				$('#passCheck').focus();
				return false;
			} else if ($('#pass').val() != $('#passCheck').val()) {
				alert('비밀번호를 다시 확인하세요');
				$('#pass').val("");
				$('#passCheck').val("");
				$('#pass').focus();
				return false;
			} else if ($('#name').val() == "") {
				alert('이름을 입력하세요');
				$('#name').focus();
				return false;
			} else if ($('#email').val() == "") {
				alert('이메일을 입력하세요');
				$('#email').focus();
				return false;
			}

		});//click event
	});//ready
</script>
<title>Insert title here</title>
<style type="text/css">
.form-horizontal {
	margin-left: 35%;
}
</style>
</head>
<body>
	<center>
		<h2>회원가입폼</h2>
		<hr>
	</center>
	<form class="form-horizontal" action="Join-ing.do" method="get">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">아이디 :</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="id" name="id"
					placeholder="아이디를 입력하세요">	 <c:if test="${msg!=null}"> <font color="red"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${msg }</font>
	</c:if>
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pass">비밀번호 :</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="pass" name="pass"
					placeholder="비밀번호를 입력하세요">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pass">비밀번호 :</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="passCheck"
					name="passCheck" placeholder="비밀번호를 다시 입력하세요">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pass">이 름 :</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="이름을 입력하세요">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="email">이메일 :</label>
			<div class="col-sm-3">
				<input type="email" class="form-control" id="email" name="email"
					placeholder="이메일을 입력하세요">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10"></div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input id="register" class="btn btn-default" type="submit"
					value="회원가입"> <input class="btn btn-default" type="reset"
					value="취소">
			</div>
		</div>
	</form>
	

	<!-- 		<center>
		<form action="Join-ing.do">
			<table cellpadding="10" bgcolor="#FFF29E">
				<tr>
					<td>ID:</td>
					<td><input type="text" size="15" name="id"> <input
						type="button" value="중복확인" onclick="overOpen()"></td>
				</tr>
				<tr>
					<td>비 번:</td>
					<td><input type="password" size=15 name="pass"></td>
				</tr>
				<tr>
					<td>비번확인:</td>
					<td><input type="password" size=15 name="passCheck"></td>
				</tr>
				<tr>
					<td>이 름:</td>
					<td><input type="text" size="15" name="name"></td>
				</tr>
				<tr>
					<td>이메일:</td>
					<td><input type="text" size="15" name="email"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="등록">
						<input type="reset" value="취소"></td>
				</tr>

			</table>


		</form>
	</center> -->

</body>
</html>