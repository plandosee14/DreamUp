<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
여기는 프로젝트 만들것입니다~!
  <br>

  
   <center>
  
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
기본정보
</div>
<input type="textArea">

 <br>
 <br>

 <table border ="1" width="400" height="100">
 <tr>
  <td>
   &nbsp;&nbsp;
   타이틀 사진 
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="image" size="2"> 
  </td>
 </tr>
 </table>
  

 <table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
  제목
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="textArea" size="10" name="title"> 
  </td>
 </tr>
 </table>



<table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
  카테고리
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <select name="category">
       <option>하은</option>
       <option>하은2</option>
       <option>하은3</option>
       <option>하은4</option>
   </select>
  </td>
 </tr>
 </table>
   
<br>

<table border ="1" width="400" height="100">
 <tr>
  <td>
  &nbsp;&nbsp;
  <div>
  후원기간
  </div> 
  기간<input type="Radio" size="2" > 

  마감일<input type="Radio" size="2" > 
  </td>
   





  
 </tr>
 </table>

<table border ="1" width="400" height="30">
 <tr>
  <td>
   금액
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" size="2">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

  </td>
 </tr>
 </table>



<table width="400" height="30">
 <tr>
  <td align="right">
  <input type="button" size="2" value ="다음단계">
  </td>
 </tr>
 </table>





</center>
<!-- <a href="register_2.do">2단계></a> -->
</body>
</html>