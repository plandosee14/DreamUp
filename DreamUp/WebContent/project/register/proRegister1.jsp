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


 <br>
 <br>

  <form action="pro_basic.do" method="post" 
         enctype="multipart/form-data"> 
         
  
          
 <table border ="1" width="400" height="100">
 <tr>
  <td>
   &nbsp;&nbsp;
   타이틀 사진 
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

   파일: <input type="file" name="myfile"> <br>
   <input type="text" name="m_id" value="${login_id}">



  </td>
 </tr>
 </table>
  

 <table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
  제목
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" size="10" name="pro_title"> 
  </td>
 </tr>
 </table>



<table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
  카테고리
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <select name="pro_category">
       <option>음악</option>
       <option>미술</option>
       <option>아이디어</option>
       <option>영화/비디오</option>
       <option>디자인</option>
       <option>식품</option>
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
  기간<input type="Radio" size="2" name="day-type" value="days"> <input type="text" name="pro_days" size=10><br>

  마감일<input type="Radio" size="2" name="day-type" value="end-day"> <input type="date" name="pro_End" size=10><br>
  </td>
   





  
 </tr>
 </table>

<table border ="1" width="400" height="30">
 <tr>
  <td>
   목표금액
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" size="50" name="pro_goal">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

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
<!-- <a href="register_2.do">2단계></a> -->
</body>
</html>