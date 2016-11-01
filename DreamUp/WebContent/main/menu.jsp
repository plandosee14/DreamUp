<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" 
          prefix="h" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
menu.jsp
<body>

<a href="project.do">프로젝트</a>
<h:link action="/menu2">프로젝트 등록</h:link>
<a href="main.do">Dream Up</a>
<a href="login.do">로그인</a>

</body>
</html>
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>DreamUp!</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.do">DreamUp</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">

			<ul class="nav navbar-nav">
				<li><a href="project.do">프로젝트 보기</a></li>
				<li><a href="menu2.do">프로젝트 등록</a></li>
			</ul>
			<div>
				<!-- <form class="form-inline">
					<input type="email" class="form-control" size="50"
						placeholder="Project Name" required>
					<button type="button" class="btn btn-danger">검색</button>
				</form> -->
				<ul class="nav navbar-nav navbar-right">
					<c:if test="${empty login_id}">
						<a href="login.do" class="btn btn-info btn-lg"> <span
							class="glyphicon glyphicon-user"></span> 로그인
						</a>
					</c:if>
					<c:if test="${!empty login_id}">
						<div class="dropdown">
						
							<div class="btn btn-default dropdown-toggle" data-toggle="dropdown"><a href="#logout.do" class="btn btn-info btn-lg"> <span
								class="glyphicon glyphicon-user"></span> ${login_id }
							</a></div>
							<ul class="dropdown-menu">
							<li><a href="mypage.do">마이페이지</a>
							<li class="divider"></li>
							<li><a href="#">등록 프로젝트</a></li>
							<li><a href="#">후원 프로젝트</a></li>
							<li><a href="#">결제 내역</a></li>
							<li><a href="#">내정보 수정</a></li>
							<li class="divider"></li>
							<li><a>로그아웃</a></li>
							</ul>
						</div>
					</c:if>
				</ul>
			</div>

		</div>
	</div>
	</nav>

</body>
</html>
