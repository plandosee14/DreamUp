<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
   $(function() {
      $('#supponrt').click(function() {
         if($('#m_id').val()==$('#login_id').val()){
            alert('자신의 프로젝트를 후원하실 수 없습니다');
            return false;
         }
      
         location.replace('suReward.do?pro_no=' + $('#pro_no').val());
      });//click event
      
      
      
   });//ready
</script>
<style type="text/css">
.pro-info {
   margin: 5%;
   margin-left: 20%;
   margin-right: 5%;
}

.row {
   margin-bottom: 5%
}

.col-sm-6 {
   margin-right: 100px;
   
}

.content > p > img{
   width: 400px;
}
</style>
</head>
<body>
   
   <input type="hidden" name="pro_no" id="pro_no" value="${project.pro_no}">
   
   <input type="hidden" name="login_id" id="login_id" value="${login_id}">
   <input type="hidden" name="m_id" id="m_id" value="${project.m_id}">
   <div class="pro-info">
      <h1>${project.pro_title}</h1>
      <h2>프로젝트 번호 : ${project.pro_no}</h2>
      


         <div class="row">
            <div class="col-sm-6" style="background-color: white;">
               <embed src="video/${project.pro_video }" width="600" height="400"
                  showstatusbar="1" autoplay="false">
            </div>

            <div class="col-sm-1" style="background-color: white;">
               <br><b>후원자수: ${project.su_count}</b><br>
               <b>현재 후원액 :${project.now_amount}</b><br>
               목표액:${proDetail.pro_goal}<br>
               <b>${proDetail.due_date}일</b><br>
               잔여기간<br>
               <b>마감일 : ${proDetail.pro_end}</b>
               <input type="button" name="supponrt" id="supponrt" value="후원하기" class="btn btn-success">
            </div>
         </div>

      <div class="row">

         <div class="col-sm-3" style="background-color: white;">
            <img src="img/profile/${project.pro_fileImage}" alt="${project.pro_fileImage}" width="150" height="200">
         </div>
         <div class="col-sm-3" style="background-color: white;">
         ${member.m_name }<br>
         <span class="glyphicon glyphicon-envelope"></span> ${member.m_email }<br>
         ${project.pro_fileSns}</div>
         <div class="col-sm-3" style="background-color: white;">${project.pro_fileIntro}</div>
      </div>

      <div class="row">
         <div id="content" class="col-sm-6" style="background-color: white;">${project.pro_content}</div>

         <div class="col-sm-3" style="background-color: white;">
            <center>

               <table align="center" style="margin-bottom: 15px;">
                  <tr>
                     보상 없는 후원
                     <br>
                  <tr>
                  <tr>
                     금액 :
                     <input type="text" name="re_money" id="re_money">원
                     <br>
                  <tr>
               </table>
            </center>
            <c:forEach items="${rewardList}" var="rewardList">
               <form>
               <%-- <table>
                  <tr>
                     <th><input type="text" name="re_money" id="re_money">원</th><br>
                     <th><input type="button" name="next" id="next" value="계속하기"></th>
                  </tr>
                  <tr>
                     <td>${rewardList.re_title}</td><br>
                     <td>${rewardList.re_item}</td><br>
                     <td>${rewardList.re_delivery}</td><br>
                     <td>${rewardList.re_limite}</td><br>
                  <tr>
               </table> --%>
               <table align="center">
                  <center>${rewardList.re_title}<br>
                  보상 품목 : ${rewardList.re_item}
                  <br> 배송 예정일 : ${rewardList.re_delivery}
                  <br> 남은 수량 : ${rewardList.re_limite}
                  <br>
                  <input type="text" name="re_money" id="re_money" value="${rewardList.re_money}">원
                  <br>
                  </center>
                  
               </table>
               </form>
            </c:forEach>
         </div>
      </div>
   </div>

</body>
</html>
