<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>마이페이지</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
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
.row{
	margin-left: 25%;
}
</style>
</head>
<body>
<center>
	<div class="row">
		<div class="col-sm-4" style="background-color: lavender;">
			후원받은숫자
			후원한숫자?
			색깔바꿀것</div>
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
						<a><p>프로필 사진 수정</p></a>
						<a><p>하단메뉴2</p></a>
						<a><p>생각이안나유</p></a>
					</div>
				</div>
			</div>
		</div>
</center>

	<div class="container">
		<h2>마이페이징</h2>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">등록 프로젝트</a></li>
			<li><a data-toggle="tab" href="#menu1">후원 프로젝트</a></li>
			<li><a data-toggle="tab" href="#menu2">결제 목록</a></li>
			<li><a data-toggle="tab" href="#menu3">내정보 수정</a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<h3>HOME</h3>
				등록 프로젝트 출력 // 마감된 등록 프로젝트 목록 출력 // 등록프로젝트가 없을시 등록중인 프로젝트 목록
				출력(max(su_date?))
			</div>
			<div id="menu1" class="tab-pane fade">
				<h3>Menu 1</h3>
				후원 프로젝트 목록 출력
			</div>
			<div id="menu2" class="tab-pane fade">
				<h3>Menu 2</h3>
				결제 목록 출력 // 금액 정보 및 프로젝트 사진or타이틀 컬럼에 링크삽입하여 해당 링크 클릭시 프로젝트 상세조회 화면으로
				이동
			</div>
			<div id="menu3" class="tab-pane fade">
				<h3>Menu 3</h3>
				내정보 수정!
			</div>
		</div>
	</div>

</body>
</html>

