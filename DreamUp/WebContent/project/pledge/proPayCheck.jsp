<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.outerProvision{
	border: solid;
};

.checkPayInfo
{border-style: solid;
	border: 1 black;
}

</style>

</head>
<body>
	<h3>프로젝트 후원(결제정보확인)</h3>
	<hr>

	
	<p class="checkPayInfo">
<center>
	<form action="supportInsert.do" method="post">
<c:if test="${reward==null}">
[보상없는 후원]<br>
 후원금액 : ${support.su_money}<br>
<input type="hidden" name="rewardCheck" value="false">
</c:if>

<c:if test="${reward!=null}">
		[리워즈]<br>
 후원금액 : ${support.su_money}<br>
 리워즈 금액:  ${reward.re_money}<br>
 리워즈 아이템: ${reward.re_item}<br>
 상품도착예정일: ${reward.re_delivery}<br><br>
 <input type="hidden" name="rewardCheck" value="true">
<input type="hidden" name="re_no" value="${support.re_no}">
 </c:if>
 
		[결제정보]
		이름: ${support.su_name}
		<br> 배송우편번호: ${support.su_zip } <br>
		 배송주소: ${support.su_address } <br>
		핸드폰 : ${support.su_phone } <br>
		결제방식: ${support.paymentPlan} <br>
		 환불은행 : ${support.su_refundAccount } <br>
		 환불계좌: ${support.su_refundBank} <br>
		 
		 <input type="hidden" name="pro_no" value="${support.pro_no}">
		 <input type="hidden" name="su_money" value="${support.su_money}">
		 <input type="hidden" name="su_name" value="${support.su_name}">
		 <input type="hidden" name="su_zip" value="${support.su_zip}">
		 <input type="hidden" name="su_address" value="${support.su_address}">
		 <input type="hidden" name="su_phone" value="${support.su_phone}">
		 <input type="hidden" name="su_paymentPlan" value="${support.paymentPlan}">
		 <input type="hidden" name="su_refundAccount" value="${support.su_refundAccount}">
		 <input type="hidden" name="su_refundBank" value="${support.su_refundBank}">
		<input type="submit" value="결제하기"><br>
		
	</form>
	</center>
	
	</p>
</body>
</html>