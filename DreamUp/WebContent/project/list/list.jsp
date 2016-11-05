<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
/* .container-fluid {
	padding: 60px 50px;
} */

/* 전체 배경화면 색 */
.bg-grey {
	background-color: white;
	margin-left: 7%;
	margin-right: 7%;
}

.thumbnail {
	padding: 0 0 15px 0;
	border: none;
	border-radius: 0;
}

.thumbnail img {
	width: 100%;
	height: 100%;
	margin-bottom: 10px;
}

@media ( min-width : 768px) {
	.col-sm-4 {
		width: 25%;
	}
}

@media ( min-width : 768px) {
	.container {
		width: 100%;
	}
}

@media screen and (max-width: 768px) {
	.col-sm-4 {
		text-align: center;
		margin: 25px 0;
	}
}
</style>
</head>

<body>
	<div class="container-fluid text-center bg-grey">
		<h2>프로젝트 소개</h2>
		<br>
		
		<div style="border: 1px black solid">
			여기는 카테고리
			<input type="button" value="음식">
			<input type="button" value="음악">
			<input type="button" value="힐링">
			<input type="button" value="과학">
			<input type="button" value="게임">
		</div>
		
		<c:forEach items="${projectList}" var="projectList">
			<div class="row text-center">
				<div class="col-sm-4">
					<div class="thumbnail">
						<a href="projectView.do?pro_no=${projectList.pro_no}"><img
							src="img/thumnail/${projectList.pro_thumbnail}"
							alt="${projectList.pro_thumbnail}" width="800" height="600"></a>
						<div class="container">
							<div class="progress">
								<div class="progress-bar progress-bar-striped active"
									role="progressbar" aria-valuenow="${projectList.progress}"
									aria-valuemin="0" aria-valuemax="100"
									style="width: ${projectList.progress}%">${projectList.progress}%</div>
							</div>
						</div>

						<p>
							<strong>타이틀 : ${projectList.pro_title}</strong>
						</p>

						<p>목표 금액 : ${projectList.pro_goal}원</p>
						<p>종료 기간 : ${projectList.pro_end}</p>
						<p>잔여 기간 : ${projectList.due_date}일</p>
						<p>현재 달성률 : ${projectList.progress}%</p>
						<p>후원자 수 : ${projectList.su_count} 명</p>
						
					</div>
				</div>
		</c:forEach>
		<!-- <div class="col-sm-4">
			<div class="thumbnail">
				<img src="image/paris.png" alt="Paris" width="200" height="70">
				<div class="container">
					<div class="progress">
						<div class="progress-bar progress-bar-striped active"
							role="progressbar" aria-valuenow="100" aria-valuemin="0"
							aria-valuemax="100" style="width: 100%">100%</div>
					</div>
				</div>
				<p>
					<strong>프로젝트 제목 2</strong>
				</p>
				<p>프로젝트 소개 2</p>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="thumbnail">
				<img src="image/paris.png" alt="Paris" width="400" height="140">
				<div class="container">
					<div class="progress">
						<div class="progress-bar progress-bar-striped active"
							role="progressbar" aria-valuenow="25" aria-valuemin="0"
							aria-valuemax="100" style="width: 25%">25%</div>
					</div>
				</div>
				<p>
					<strong>프로젝트 제목 3</strong>
				</p>
				<p>프로젝트 소개 3</p>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="thumbnail">
				<img src="image/paris.png" alt="Paris" width="400" height="70">
				<div class="container">
					<div class="progress">
						<div class="progress-bar progress-bar-striped active"
							role="progressbar" aria-valuenow="7" aria-valuemin="0"
							aria-valuemax="100" style="width: 7%">7%</div>
					</div>
				</div>
				<p>
					<strong>프로젝트 제목 4</strong>
				</p>
				<p>프로젝트 소개 4</p>
			</div>
		</div> -->
	</div>

</body>

</html>