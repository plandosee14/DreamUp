<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#supponrt').click(function() {
			alert($('#pro_no').val());
			location.replace('supportForm.do?pro_no='+$('#pro_no').val());
		});//click event
	});//ready
</script>
<style type="text/css">
.pro-info {
	margin: 5%;
	margin-left: 20%;
	margin-right: 5%;
}

.row {
	margin-bottom: 5%
}

.col-sm-6 {
	margin-right: 30px;
}
</style>
</head>
<body>
	<input type="button" name="supponrt" id="supponrt" value="후원하기">
	<input type="hidden" name="pro_no" id="pro_no" value="${project.pro_no}">
	<div class="pro-info">
		<h1>${project.pro_title}</h1><h2>프로젝트 번호 : ${project.pro_no}</h2>
		
		<center>
			<div class="row">
				<div class="col-sm-6" style="background-color: yellow;">동영상pro_video</div>

				<div class="col-sm-3" style="background-color: yellow;"><b>${project.su_count}</b><br>후원자수<br>
				<b>현재 후원액 : ${project.now_amount}</b><br>목표액:${proDetail.pro_goal}<br><b>${proDetail.due_date}일</b><br>잔여기간</div>
			</div>
			<div class="row">

				<div class="col-sm-6" style="background-color: pink;">${project.pro_goal}등록자 사진</div>
				<div class="col-sm-3" style="background-color: pink;">등록자 정보</div>
			</div>

			<div class="row">
				<div class="col-sm-6" style="background-color: yellow;">프로젝트
					소개 정보</div>

				<div class="col-sm-3" style="background-color: yellow;">리워드 정보
				</div>
			</div>
	</div>
	</center>

</body>
</html>

