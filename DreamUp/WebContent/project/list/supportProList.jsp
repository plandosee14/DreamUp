<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3>후원 프로젝트 목록</h3>
<table border="1">
	<tr>
		
		<th>#</th>
		<th>타이틀</th>
		<th>카테고리</th>
		<th>마감일</th>
		<th>후원자수</th>
	</tr>
	<c:forEach items="${supportProList }" var="supportProList">
		<tr>
			<td><a href="projectView.do?pro_no=${supportProList.pro_no}"><img
					src="img/thumnail/${supportProList.pro_thumbnail}" alt="
					${supportProList.pro_thumbnail}" width="100" height="150"></a></td>
			<td>${supportProList.pro_title}</td>
			<td>${supportProList.pro_catagory}</td>
			<td>${supportProList.pro_end}</td>
			<td>${supportProList.su_count}</td>
		</tr>
	</c:forEach>

</table>
