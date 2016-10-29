<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입폼
   <form action="Join-ing.do">
     <table cellpadding="10" bgcolor="#FFF29E">
    <tr>
        <td>ID: </td> 
        <td> <input type="text" size="15" name="id"> <input type="button" value="중복확인" onclick="overOpen()"> </td>
    </tr>
    <tr>
        <td>비 번:</td>
        <td><input type="password" size=15 name="pass"></td>
    </tr>
    <tr>
        <td>비번확인:</td>
        <td><input type="password" size=15 name="passCheck"></td>
    </tr>
    <tr>
        <td>이 름:</td>
        <td><input type="text" size="15" name="name"></td>
    </tr>
    <tr>
        <td>이메일:</td>
        <td><input type="text" size="15" name="email"></td>
    </tr>

    <tr>
        <td colspan="2" align="center"><input type="submit" value="등록" > <input type="reset" value="취소"></td>
    </tr>
  
  </table>


  </form>


</body>
</html>