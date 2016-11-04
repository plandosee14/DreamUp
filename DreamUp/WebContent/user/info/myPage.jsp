<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>마이페이지</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">

$(function(){
	$('#supportProList').click(function(){
		$(this).
		$.ajax({
			url : 'supportProList.do?m_id='+$('#loginId').val(),
/* 			data : $('#loginId').val(),
			type : 'POST', */
			success : function(supportProList){
				$('#resultView').html(supportProList);
			}
		});//ajax
	});//click event
});//ready

/* 	$(function() {
		$('#memberInfo').click(function() {
				alert('11');
			 $.ajax({
				url : 'memberInfoView.do',
				success : function(memberInfo){
					$('#memberInfo').html(memberInfo);
				};//성공시 데이터 뿌리기 
			});//ajax 사용자 정보 뿌리기
		});//memberInfo click event
	});//ready */
	/* $(function(){
		$('#memberInfo').click(function(){
			//alert($('#m_id').val());
			 $.ajax({
				url : 'checkPwdView.do',
				data : {
					m_id : $('#m_id').val()
				},
				type : 'POST',
				success : function(checkPwdView){
					alert(checkPwdView);
					$('#resultView').html(checkPwdView);
				}//success
			});//ajax 
		});
	}); */
</script>
<!-- <style>
.container {
	padding: 80px 120px;
}

.person {
	border: 10px solid transparent;
	margin-bottom: 25px;
	width: 80%;
	height: 80%;
	opacity: 0.7;
}

.person:hover {
	border-color: #f1f1f1;
}

.row {
	margin-left: 25%;
}
</style> -->
</head>
<body>
	<!-- 	<center>
		<div class="topView">
			<div class="row">
				<div class="col-sm-4" style="background-color: lavender;">
					후원받은숫자 후원한숫자? 색깔바꿀것</div>
				<div class="col-sm-4" style="background-color: lavenderblush;">
					<div class="row">
						<div class="col-sm-8">
							<p class="text-center">
								<strong>정대맹</strong>
							</p>
							<br> <a href="#demo3" data-toggle="collapse"> <img
								src="image/daemang2.jpg" class="img-circle person"
								alt="Random Name" width="233" height="233">
							</a>
							<div id="demo3" class="collapse">
								<a><p>프로필 사진 수정</p></a> <a><p>하단메뉴2</p></a> <a><p>생각이안나유</p></a>
							</div>
						</div>
					</div>
				</div>
			</div>
	</center> -->
	<div class="container">
		<h2>마이페이징</h2>
		<ul class="nav nav-pills">
  <li class="active"><a href="#">Home</a></li>
  <li><a href="#">Menu 1</a></li>
  <li><a href="#">Menu 2</a></li>
  <li><a href="#">Menu 3</a></li>
</ul>
		<ul class="nav nav-tabs">
			<li class="active"><a>등록 프로젝트</a></li>
			<li id="supportProList"><a>후원 프로젝트</a></li>
			<li><a>결제 목록</a></li>
			<li id="memberInfo"><a href="checkPwdView.do">내정보
					수정
			</a></li>
		</ul>
<!-- 		<ul><li><a href="checkPwdView.do">비밀번호 재입력창</a></li></ul> -->
<input type="hidden" id="loginId" value="${login_id }">
			<div id="resultView" ></div>
		</div>
	</div>
</body>
</html>

