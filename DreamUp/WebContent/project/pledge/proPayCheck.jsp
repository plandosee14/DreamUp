<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form>

		
		이름: ${support.su_name}
		<br> 배송우편번호: ${support.su_zip } <br>
		 배송주소: ${support.su_address } <br>
		핸드폰 : ${support.su_phone } <br>
		결제방식: ${support.paymentPlan} <br>
		 환불은행 : ${support.su_refundAccount } <br>
		 환불계좌: ${support.su_refundBank } <br>
		<input type="text" name="add3" size="27"><br> 핸드폰: <input
			type="text" name="phone1" size="3">- <input type="text"
			name="phone2" size="3">- <input type="text" name="phone3"
			size="3"><br> 서약금액:<input type="text" name="pay"
			size="4"><br> 리워즈:
		<tr bgcolor="#99ccff">
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		<br> 상품도착예정일:<br> <input type="submit" value="결제하기"><br>
	</form>
	</center>
	
	</p>
</body>
</html>