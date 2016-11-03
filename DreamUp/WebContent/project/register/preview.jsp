<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
미리보기페이지입니다~!
${project.pro_no}

<br>
프로젝트 제목: ${project.pro_title}<br>
프로젝트 썸네일: <img src="img/thumnail/${project.pro_thumbnail}" alt="${project.pro_thumbnail}" width="300px"
							height="200px"><br>
프로젝트 카테고리: ${project.pro_catagory}<br>
프로젝트 시작날짜: ${project.pro_start}<br>
프로젝트 끝날짜: ${project.pro_end}<br>
비디오: 
<embed src="video/${project.pro_video }" width="500" height="700" showstatusbar="1">

<input type="button" value="등록" onclick="">
</body>
</html>