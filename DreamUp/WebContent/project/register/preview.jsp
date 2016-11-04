<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script type="text/javascript" 
      src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">

 $(document).ready(function(){
    $(':button').click(function() {
        var result = confirm('저장하시겠습니까?'+$('#pro_no').val());
	
        if(result) {
           //yes
            location.replace('confirmPro.do?pro_no='+$('#pro_no').val());
        } else {
            //no
        }
    });
}); 
/* $(function(){
	$('#reg').click(function(){

	});
}); */

$(':button').click(function(){//id=b1을 포함한 엘리먼트를 클릭했다면
	  location.replace('');
});
</script>
<title>Insert title here</title>
</head>
<body>
<center>
		<ul class="pagination">
	    <li ><a href="#">기본정보</a></li>
	    <li><a href="#">리워즈</a></li>
	    <li><a href="#">스토리</a></li>
   	    <li><a href="#">프로필</a></li>	
	    <li><a href="#">계좌</a></li>
	    <li class="active"><a href="#">미리보기</a></li>
	    <li><a href="#">등록</a></li>
	</ul>
		<hr>
${project.pro_no}

<br>   
프로젝트 제목: ${project.pro_title}<br>
프로젝트 썸네일: <img src="img/thumnail/${project.pro_thumbnail}" alt="${project.pro_thumbnail}" width="300px"
							height="200px"><br>
프로젝트 카테고리: ${project.pro_catagory}<br>
프로젝트 시작날짜: ${project.pro_start}<br>
프로젝트 끝날짜: ${project.pro_end}<br>
비디오: 
<embed src="video/${project.pro_video }" width="500" height="700" showstatusbar="1">
프로젝트 목표금액 : ${project.pro_goal }<br>
프로젝트 소개내용 : ${project.pro_content }<br>
프로젝트 관련링크 : ${project.pro_link }<br>
프로젝트 등록자 사진 : <img src="img/profile/${project.pro_fileImage}" alt="${project.pro_thumbnail}" width="300px"
							height="200px"><br>
프로젝트 등록자 소개 정보 : ${project.pro_fileIntro }<br>

프로필등록 회사주소 : ${project.pro_address	 }<br>
등록자 SNS : ${project.pro_fileSns	 }<br>
후원 달성시 입금받을 은행명 : ${project.pro_bank}<br>
후원 달성시 입금받을 계좌명 : ${project.pro_account}<br>
현재 프로젝트가 후원받은 수 : ${project.su_count}<br>
현재까지 후원된 금액 : ${project.now_amount}<br>
<input type="hidden" value="${project.pro_no}" name="pro_no" id="pro_no">
<input type="button" value="등록" id="reg">
</center>
</body>
</html>