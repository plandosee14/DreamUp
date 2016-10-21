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

	<div class="outerProvision">
	1111
	</div>
	
	<p class="checkPayInfo">
	<form>


		이름: <input type="text" name="name" size="6"><br> 배송주소: <input
			type="text" name="add1" size="4">- <input type="text"
			name="add2" size="4"> <input type="submit" value="주소찾기"><br>
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
	</p>
</body>
</html>