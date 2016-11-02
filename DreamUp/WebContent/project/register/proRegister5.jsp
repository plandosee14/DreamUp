<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
계좌입력하는 창입니다!

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
프로필
</div>

<br>
<br>

</center>
<center>

<form action="pro_account.do" >





<table border ="1" width="400" height="30">
 <tr>
  <td>
  &nbsp;&nbsp;
  계좌등록
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  은행
  <select name="bank">
       <option>신한은행</option>
       <option>국민은행</option>
       <option>농협은행</option>
       <option>우리은행</option>
       <option>하나/외한은행</option>
   </select>
  	<input type="text" value="${login_id}" name="m_id">
     <input type="text" name="account">
  </td>
   
 </tr>

 </table>



<table width="400" height="30">
 <tr>
  <td align="right">
  <input type="submit" size="2" value ="미리보기">
  </td>
 </tr>
 </table>
 
 </form>





</center>

</body>
</html>