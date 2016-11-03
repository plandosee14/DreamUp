<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DreamUp</title>
<!-- Smart Editor -->
<script type="text/javascript" src="<%=request.getContextPath()%>/project/se2/js/HuskyEZCreator.js" charset="utf-8"></script>
<!-- <script type="text/javascript" src="../se2/photo_uploader/plugin/hp_SE2M_AttachQuickPhoto.js" charset="utf-8"></script> -->
<!--  <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.0.min.js"></script>  -->
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#register').click(function() {
			if ($('#id').val() == "") {
				alert('아이디를 입력하세요');
				$('#id').focus();
				return false;
			} else if ($('#pass').val() == "") {
				alert('비밀번호를 입력하세요');
				$('#pass').focus();
				return false;
			}

		});//click event
	});//ready
</script>
</head>
<body>
여기는 스토리 입력입니다~!!

<center>
<input type="button" style="font-size:10px" value="기본정보">
<input type="button" style="font-size:10px" value="리워즈">
<input type="button" style="font-size:10px" value="스토리">
<input type="button" style="font-size:10px" value="프로필">
<input type="button" style="font-size:10px" value="계좌">
<br>
<br>
<br>

<form action="pro_story.do"method="post" 
         enctype="multipart/form-data" id="frm">
         <br><br>
등록자 아이디 : ${login_id} <br><br>
<input type="hidden" value="${login_id }" name="login_id">
비디오: <input type="file" name="myfile">

<br>
내용 : <br>
<textarea name="content" id="ir1" rows="10" cols="100" style="width:766px; height:412px; display:none;"></textarea>
링크 : <input type="text" name="link">
<input type="button" id="save" value="다음단계"/>


</form>
</center> 

<script type="text/javascript">

var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
    oAppRef: oEditors,
    elPlaceHolder: "ir1",
    sSkinURI: "<%=request.getContextPath()%>/project/se2/SmartEditor2Skin.html",
    fCreator: "createSEditor2"
});



//textArea에 이미지 첨부
function pasteHTML(filepath){
    var sHTML = '<img src="<%=request.getContextPath()%>/img/pro_img/'+filepath+'">';
	
    
	oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
    
   
}

/* function pasteHTML(filepath){ 
	var sHTML = '<span style="color:#FF0000;"><img src="'+filepath+'"></span>';
	oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
	} */

 
//‘저장’ 버튼을 누르는 등 저장을 위한 액션을 했을 때 submitContents가 호출된다고 가정한다.
function submitContents(elClickedObj) {
    // 에디터의 내용이 textarea에 적용된다.
    oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", [ ]);
 
    // 에디터의 내용에 대한 값 검증은 이곳에서
    // document.getElementById("textAreaContent").value를 이용해서 처리한다.
  
    try {
        elClickedObj.form.submit();
    } catch(e) {
     
    }
}
	
	 $("#save").click(function(){
         oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []);
         $("#frm").submit();
     });    

</script>

</body>
</html>