<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>프로젝트 후원(개인정보입력) 폼</h3>
 <hr>
 <form action="suPaySend.do">
<h3> 프로젝트 제목 : ${project.pro_title}</h3> <br>
[리워즈]<br>
후원금액 : ${su_money}<br>
 리워즈 금액:  ${reward.re_money}<br>
 리워즈 아이템: ${reward.re_item}<br>
상품도착예정일: ${reward.re_delivery}<br>
 
 <input type="hidden" name="pro_no" value="${project.pro_no }"><br>
 <input type="hidden" name="re_no" value="${reward.re_no}"><br>
 <input type="text" name="su_money" value="${su_money}"><br>
 
    <input type="radio" name="person" value="1">새로입력
<!--     <input type="radio" name="person" value="2">회원정보와동일 -->
    <br><br>
   이름: <input type="text" name="name" size="6"><br>
  배송주소: <input type="text" name="add1" size="4">-
  <input type="text" name="add2" size="4">
  <input type="button" value="주소찾기"><br>
  <input type="text" name="address" size="27"><br>
  핸드폰: <input type="text" name="phone1" size="3">-
  <input type="text" name="phone2" size="3">-
  <input type="text" name="phone3" size="3"><br>
  <hr>
  <input type="radio" name="pay" value="1">신용카드
    <input type="radio" name="pay" value="2">무통장입금<br>
  입금은행:<select name="bank">
       <option>신한</option>
       <option>우리</option>
       <option>국민</option>
       <option>하나</option>
    </select><br>
 입금자:<input type="text" name="name" size="6"><br>
 
  <hr><br>환불받을계좌<br>
  은행:<select name="bank">
       <option>신한</option>
       <option>우리</option>
       <option>국민</option>
       <option>하나</option>
    </select><br>
    계좌번호:<input type="text" name="account" size="15"><br>
  <input type="submit" value="다음"><br>
  
 </form>

</body>
</html>