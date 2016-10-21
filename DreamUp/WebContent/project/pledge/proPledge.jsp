<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>프로젝트 후원(리워드) 폼</h3>
 <hr>
 <form>
 <table border="1" cellpadding="5">
   <tr>
  <td><input type="radio" name="reward" checked value="0">리워즈 받지않음<br>
  서약금액<br> <input type="text" name="pay1" size="4"> 
   <input type="submit" value="확인"><br>  </td></tr>
   
  <tr>
	<td> <input type="radio" name="reward" value="1">모금액1<br>
       리워드목록1:<br>
  서약금액<br> <input type="text" name="pay2" size="4"> 
   <input type="submit" value="확인"><br> </td></tr>
   
  <tr> 
    <td> <input type="radio" name="reward" value="2">모금액2<br>
    리워드목록2:<br>
  서약금액<br> <input type="text" name="pay3" size="4"> 
   <input type="submit" value="확인"><br> </td></tr>
  
    </table>
 </form>
</body>
</html>