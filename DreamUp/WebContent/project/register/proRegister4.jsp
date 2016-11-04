<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#proFileOk').click(function() {
			if (!$('#file').val()) {
				alert('프로필 사진 첨부는 필수사항입니다.');
				return false;
			}/*  else if ($('#pro_fileIntro').val()=="") {
						alert('등록자 소개 정보를 입력하세요');
						$('#pro_fileIntro').focus();
						return false;
					}  */else if ($('#pro_address').val() == "") {
				alert('등록자 주소 정보를 입력하세요');
				$('#pro_address').focus();
				return false;
			} else if ($('#pro_fileSns').val() == "") {
				alert('sns 주소 정보를 입력하세요');
				$('#pro_fileSns').focus();
				return false;
			}
		});//click
	});//ready
</script>
<style type="text/css">
.table-responsive {
	margin-left: 30%;
	margin-right: 30%;
}
</style>
</head>
<body>
	<center>
		<ul class="pagination">
			<li><a href="#">기본정보</a></li>
			<li><a href="#">리워즈</a></li>
			<li><a href="#">스토리</a></li>
			<li class="active"><a href="#">프로필</a></li>
			<li><a href="#">계좌</a></li>
			<li><a href="#">미리보기</a></li>
			<li><a href="#">등록</a></li>
		</ul>
		<hr>
		<br>
		<div>프로필</div>

		<form action="pro_file.do" method="post" enctype="multipart/form-data"
			id="frm">
			<br>
			<br>
			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>프로필 사진<input type="file" name="myfile" id="file"><br>
								</th>
							</tr>
					</table>
				</div>
			</div>

			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>등록자 이름<input type="text" size="10">
								</th>
							</tr>
					</table>
				</div>
			</div>

			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>소개<br>
								<textarea rows="5" cols="45" name="pro_fileIntro"
										id="pro_fileIntro"></textarea>
								</th>
							</tr>
					</table>
				</div>
			</div>

			<br>
			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>주소<!--  <input type="text" name="Pro_zip"><br> --> <input
									type="text" name="pro_address" id="pro_address"> <input
									type="button" value="주소찾기" class="btn btn-success"> </tg>
							</tr>
					</table>
				</div>
			</div>

			<div class="container">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
						<th>SNS : <input type="text" size="40" name="pro_fileSns"
						id="pro_fileSns"> <input type="hidden" name="m_id"
						value="${login_id}">
					</th>
				</tr>
			</table>

			<table width="400" height="30">
				<tr>
					<td align="right"><input class="btn btn-success" id="proFileOk" type="submit" size="2"
						value="다음단계"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>