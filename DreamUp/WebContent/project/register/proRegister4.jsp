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
	$('#proFileOk').click(function(){
		if(!$('#file').val()){
			alert('프로필 사진 첨부는 필수사항입니다.');
			return false;
		}/*  else if ($('#pro_fileIntro').val()=="") {
			alert('등록자 소개 정보를 입력하세요');
			$('#pro_fileIntro').focus();
			return false;
		}  */else if ($('#pro_address').val()=="") {
			alert('등록자 주소 정보를 입력하세요');
			$('#pro_address').focus();
			return false;
		}else if ($('#pro_fileSns').val()=="") {
			alert('sns 주소 정보를 입력하세요');
			$('#pro_fileSns').focus();
			return false;
		}
	});//click
});//ready

</script>
</head>
<body>
	<center>
			<div>
				<input type="button" style="font-size: 10px" value="기본정보"> <input
					type="button" style="font-size: 10px" value="리워즈"> <input
					type="button" style="font-size: 10px" value="스토리"> <input
					type="button" style="font-size: 10px" value="프로필"> <input
					type="button" style="font-size: 10px" value="계좌"> &nbsp;
				&nbsp; <input type="button" style="font-size: 10px" value="미리보기">
				<input type="button" style="font-size: 10px" value="등록">

			</div>

			<br>
			<div>프로필</div>

			<form action="pro_file.do" method="post" enctype="multipart/form-data" id="frm">
			<br><br>
				<table border="1" width="400" height="100">
					<tr>
						<td>프로필 사진<input type="file" name="myfile" id="file"><br>
						</td>
					</tr>
				</table>

				<table border="1" width="400" height="30">
					<tr>
						<td>등록자 이름<input type="text" size="10" value="el로 뿌릴것" >
						</td>
					</tr>
				</table>

				<table border="1" width="400" height="30">
					<tr>
						<td>소개<br><textarea rows="5" cols="54" name="pro_fileIntro" id="pro_fileIntro"></textarea>
						</td>
					</tr>
				</table>
				
				<br>
				<table border="1" width="400" height="100">
					<tr>
						<td>주소<!--  <input type="text" name="Pro_zip"><br> --> 
							<input type="text" name="pro_address" id="pro_address"> <input type="button" value="주소찾기">
						</td>
					</tr>
				</table>

				<table border="1" width="400" height="30">
					<tr>
						<td>SNS : <input type="text" size="40" name="pro_fileSns" id="pro_fileSns"> 
							<input type="hidden" name="m_id" value="${login_id}">
						</td>
					</tr>
				</table>

				<table width="400" height="30">
					<tr>
						<td align="right"><input id="proFileOk" type="submit" size="2" value="다음단계" >
						</td>
					</tr>
				</table>
			</form>
	</center>
</body>
</html>