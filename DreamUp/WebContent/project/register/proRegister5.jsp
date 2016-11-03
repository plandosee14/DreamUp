<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#accountOk').click(function(){
		if(!confirm("선택하신 은행이 [" + $('select[name=bank]').val()+"] 이 맞나요?")){
			return false;
		}
		if($('#account').val()==""){
			alert('계좌 정보를 입력하세요');
			return false;
		}
	});//click
});//ready
</script>
<style type="text/css">
.table-responsive{
margin-left : 30%;
margin-right :30%;
}


</style>
</head>
<body>

	<center>
		<ul class="pagination">
	    <li ><a href="#">기본정보</a></li>
	    <li ><a href="#">리워즈</a></li>
	    <li><a href="#">스토리</a></li>
	    <li><a href="#">계좌</a></li>
	    <li class="active"><a href="#">프로필</a></li>
	    <li><a href="#">미리보기</a></li>
	    <li><a href="#">등록</a></li>
	</ul>
		<hr>

		<br>
		<div>프로필</div>

		<br> <br>
		<form action="pro_account.do">
			<table border="1" width="400" height="30">
				<tr>
					<td>계좌등록	은행 <select name="bank">
							<option>신한은행</option>
							<option>국민은행</option>
							<option>농협은행</option>
							<option>우리은행</option>
							<option>하나/외한은행</option>
					</select> <input type="hidden" value="${login_id}" name="m_id"> 
					<input type="text" name="account" id="account">
					</td>

				</tr>
			</table>
			<center>
			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>은행</th>
								<th><select name="bank">
							<option>신한은행</option>
							<option>국민은행</option>
							<option>농협은행</option>
							<option>우리은행</option>
							<option>하나/외한은행</option></th>
							</tr>
							<tr>
								<th>계좌</th>
								<th><input type="text"></th>
							</tr>
							
						</thead>
					</table>
				</div>
			</div>
			</center>

			<table width="400" height="30">
				<tr>
					<td align="right"><input id="accountOk" type="submit" size="2" value="미리보기">
					</td>
				</tr>
			</table>
		</form>

	</center>
</body>
</html>