<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#basicOk').click(function(){
		if(!$('#file').val()){
			alert('파일첨부는 필수사항입니다.');
			return false;
		} else if($('#pro_title').val()==""){
			alert('프로젝트 제목을 입력하세요');
			$('#pro_title').focus();
			return false;
		} else if(!(($('#inputDay').val()=="" && $('#insertDay').val()!="")||($('#inputDay').val()!="" && $('#insertDay').val()==""))){
			alert('프로젝트 종료기간을 설정하세요');
			$('#inputDay').focus();
			return false;y
		} else if ($('#pro_goal').val()=="") {
			alert('목표 금액을 입력하세요');
			$('#pro_goal').focus();
			return false;
		}
	});//click
	
});//ready

</script>
<style type="text/css">
.select{
	background-color: aqua;
}
.preView{
	margin-left: 10px;
}

</style>
</head>
<body>
	<%-- 	<c:if test="${empty login_id }">

	</c:if>
	여기는 프로젝트 만들것입니다~!
	<br> --%>

	<center>
<!-- 		<div>
			<input type="button" style="font-size: 10px" value="기본정보"> <input
				type="button" style="font-size: 10px" value="리워즈"> <input
				type="button" style="font-size: 10px" value="스토리"> <input
				type="button" style="font-size: 10px" value="프로필"> <input
				type="button" style="font-size: 10px" value="계좌"> &nbsp;
			&nbsp; <input type="button" style="font-size: 10px" value="미리보기">
			<input type="button" style="font-size: 10px" value="등록">
		</div> -->
		
	<ul class="pagination">
	    <li class="active"><a href="#">기본정보</a></li>
	    <li ><a href="#">리워즈</a></li>
	    <li><a href="#">스토리</a></li>
   		<li><a href="#">프로필</a></li>
	    <li><a href="#">계좌</a></li>
	    <li><a href="#">미리보기</a></li>
	    <li><a href="#">등록</a></li>
	</ul>
	<hr>
  
		<br>
		<div>
			<h3>기본정보</h3>
		</div>
		<hr>
		<br>
		<br>

		<form action="pro_basic.do" method="post"
			enctype="multipart/form-data">
			<table border="1" width="400" height="100">
				<tr>
					<td><b>타이틀 사진</b> 파일:<input type="file" name="myfile" id="file"> <br>파일
						</div> 등록자 ID : ${login_id} <input type="hidden" name="m_id"
						value="${login_id}"></td>
				</tr>
			</table>

			<table border="1" width="400" height="30">
				<tr>
					<td><b>제목</b><input id="pro_title" type="text" size="10"
						name="pro_title"></td>
				</tr>
			</table>

			<table border="1" width="400" height="30">
				<tr>
					<td>카테고리<select name="pro_category">
							<option>음악</option>
							<option>미술</option>
							<option>아이디어</option>
							<option>영화/비디오</option>
							<option>디자인</option>
							<option>식품</option>
					</select>
					</td>
				</tr>
			</table>

			<br>

			<table border="1" width="400" height="100">
				<tr>
					<td>&nbsp;&nbsp;
						<div>
							<b>후원기간</b>
						</div> 기간 : <input type="Radio" size="2" name="day-type" value="days">
						<input type="text" name="pro_days" size=10 id="inputDay"><br>

						마감일 : <input type="Radio" checked="checked" size="2"
						name="day-type" value="end-day"> <input type="date"
						name="pro_End" size=10 id="insertDay"><br>
					</td>
				</tr>
			</table>

			<table border="1" width="400" height="30">
				<tr>
					<td><b>목표금액</b> : <input type="text" size="30" name="pro_goal"
						id="pro_goal"></td>
				</tr>
			</table>

			<table width="400" height="30">
				<tr>
					<td align="right"><input id="basicOk" type="submit" size="2" value="다음단계"></td>
				</tr>
			</table>
		</form>

	</center>
	<!-- <a href="register_2.do">2단계></a> -->
</body>
</html>