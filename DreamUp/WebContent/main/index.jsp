<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%--base.jsp(레이아웃 설정페이지 ==> table,div) --%>
<body>
	<h3>TitlesFramework 테스트</h3>
	<hr>
	<table width="100%" border="1">
	  <tr>
	    <td  align="center">
	  
	      <jsp:include page="header.jsp" flush="true"></jsp:include>
	    </td>
	  </tr>
	  <tr>
	    <td><jsp:include page="menu.jsp" flush="true"></jsp:include></td>
	  </tr>
	  <tr>
	    <td><jsp:include page="body.jsp" flush="true"></jsp:include></td>
      </tr>
	  <tr>
	    <td><jsp:include page="footer.jsp" flush="true"></jsp:include></td> 
	  </tr>

	</table>
</body>
</html>