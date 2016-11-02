<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


여기는 프로필 입력합니다~!
<center>
<body>
<div >
<input type="button" style="font-size:10px" value="기본정보">
<input type="button" style="font-size:10px" value="리워즈">
<input type="button" style="font-size:10px" value="스토리">
<input type="button" style="font-size:10px" value="프로필">
<input type="button" style="font-size:10px" value="계좌">

&nbsp;
&nbsp;
<input type="button" style="font-size:10px" value="미리보기">
<input type="button" style="font-size:10px" value="등록">

</div>

<br>
<div>
프로필
</div>

<form action="pro_file.do"method="post" 
         enctype="multipart/form-data" id="frm">
 <br>
 <br>

 <table border ="1" width="400" height="100">
 <tr>
  <td>
   &nbsp;&nbsp;
사진 
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="file" name="myfile"><br>
  </td>
 </tr>
 </table>
  

 <table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
이름
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" size="10" value="이름"> 
  </td>
 </tr>
 </table>



<table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
소개
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <textarea rows="5" cols="40" name="pro_fileIntro">
 </textarea>
  </td>
 </tr>
 </table>
   
<br>

<table border ="1" width="400" height="100">

 <tr>
  <td>
  주소
  <input type="text" name="Pro_zip"><br>
  <input type="text" name="pro_address">
  <input type="button" value="주소찾기">
 <div>
 <center>
 </div>
  </td>

  
 </tr>
 

 </table>

<table border ="1" width="400" height="30">
 <tr>
  <td>
   SNS
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" size="40" name="pro_fileSns">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="m_id" value="${login_id}">
  </td>
 </tr>
 </table>



<table width="400" height="30">
 <tr>
  <td align="right">
  <input type="submit" size="2" value ="다음단계">
  </td>
 </tr>
 </table>




</form>
</center>



</body>
</html>