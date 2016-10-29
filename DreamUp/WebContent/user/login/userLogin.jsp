<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${login-fail}=='fail'">
 <script type="text/javascript">
  alert("로그인 실패라네여~");
 </script>
 
</c:if>

여기는 로그인 페이지입니다
 <h3>로그인 폼</h3>
  <hr>
  <form action="login-ing.do" method="get">
          아이디:  <input type="text" name="id"><br>
          비밀번호: <input type="password" name="pass"><br>
     <input type="submit" value="로그인">
     <input type="button" value="회원가입" onclick="location='join.do'" >
 
  </form>
  
  


</body>
</html>