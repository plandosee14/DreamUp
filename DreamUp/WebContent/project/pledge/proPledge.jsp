<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>프로젝트 후원(리워드) 폼</h3>
 <hr>
 ${project.pro_title}

				<center>
			  <form action="suRewardSend.do">
				     <h4>보상없는 후원</h4><br>
					<table align="center" >
						<tr>
							<td>
						<input type="hidden" name="pro_no" value="${project.pro_no}"></td>
						</tr>
						<td>
							서약 금액 :
							<input type="text" name="re_money" id="re_money">원
						    <input type="hidden" name="reCheck" value="false">	
						</td>
						<tr>
							<input type="submit" name="next" id="next" value="계속하기">
						</tr>
					</table>
				 </form>
				</center>
				<c:forEach items="${rewardList}" var="rewardList">
					
					  <br>
					  <br>
					<center>
					<form action="suRewardSend.do">
						<input type="hidden" name="re_no" value="${rewardList.re_no }">
						<input type="hidden" name="pro_no" value="${project.pro_no }">
						<input type="hidden" name="reCheck" value="true">
						<h4>${rewardList.re_title}</h4><br>
					    <table align="center" >
						<tr>
						<td>보상 품목 : ${rewardList.re_item}</td>
						</tr>
						<tr><td> 배송 예정일 : ${rewardList.re_delivery}</td></tr>
						<tr><td> 남은 수량 : ${rewardList.re_limite}</td></tr>
						
						<tr><td>
						서약금액: <input type="text" name="re_money" id="re_money" value="${rewardList.re_money}">원
						</td></tr>
						<tr><td>
						<input type="submit" name="next" id="next" value="계속하기">
						</td></tr>
					</table>
					</form>
					</center>
				</c:forEach>
 


</body>
</html>