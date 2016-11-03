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
        var result = confirm('저장하시겠습니다?'+$('#pro_no').val());
	
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
뭐먹지?
미리보기페이지입니다~!
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
<input type="hidden" value="${project.pro_no}" name="pro_no" id="pro_no">
<input type="button" value="등록" onclick="" id="reg">
</body>
</html>