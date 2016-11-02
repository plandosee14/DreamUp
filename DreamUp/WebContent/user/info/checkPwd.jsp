<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.form-horizontal {
	margin-left: 35%;
}
</style>
</head>
<body>
	<center>
		<hr>
	</center>
	<form class="form-horizontal" action="checkPwd.do" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="pass">비밀번호 :</label>
			<div class="col-sm-3">
				<input type="password" class="form-control" id="m_password"
					name="m_password" placeholder="비밀번호를 입력하세요">
			</div>
		</div>
		<input type="hidden" name="m_id" value="${login_id}">
		
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10"></div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<input class="btn btn-default" type="submit" value="확인"> <input
					class="btn btn-default" type="reset" value="취소">
			</div>
		</div>
	</form>

</body>
</html>