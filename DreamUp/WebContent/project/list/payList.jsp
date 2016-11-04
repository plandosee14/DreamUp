<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3>결제 목록</h3>
<table class="table table-striped">
	<thead>
		<tr>
			<th>프로번호</th>
			<th>결제금액</th>
			<th>결제자</th>
			<th>배송지</th>
			<th>환불여부</th>
		</tr>
	</thead>
	<%-- 	<c:forEach items="${supportProList}" var="supportProList">

			<td><a href="projectView.do?pro_no=${supportProList.pro_no}"><img
					src="img/thumnail/${supportProList.pro_thumbnail}" alt="
					${supportProList.pro_thumbnail}" width="100" height="150"></a></td>
	</c:forEach> --%>
	<c:forEach items="${supportList }" var="supportList">
		<tr>
			<td><a href="projectView.do?pro_no=${supportList.pro_no}">${supportList.pro_no}</a></td>
			<td>${supportList.su_money}</td>
			<td>${supportList.su_name}</td>
			<td>${supportList.su_address}</td>
			<c:if test="${supportList.su_state ==0}">
				<td>X</td>
			</c:if>
		</tr>
	</c:forEach>

</table>
