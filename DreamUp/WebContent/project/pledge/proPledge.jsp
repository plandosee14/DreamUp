<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">

$(function(){
	$('#re_money').keyup(function(){
		//alert($('#re_money').val());
		//var re_money = comma($(this).val());// +"원";
		var re_money = viewKorean(uncomma($(this).val()));
		$('#checkingMoney').text(re_money);
		//$('#re_money').val(re_money);
	});//change
	
/* 	$( "input" ).keyup(function() {
	    var value = $( this ).val();
	    $( "p" ).text( value );
	  }).keyup(); */
});//ready
	
	function comma(str) {
	    str = String(str);
	    return str.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
	}
	
	function uncomma(str) {
	    str = String(str);
	    return str.replace(/[^\d]+/g, '');
	}
	
	function inputNumberFormat(str) {
		    str.value = comma(uncomma(str.value));
	}

	function viewKorean(num) {	
	    var hanA = new Array("","일","이","삼","사","오","육","칠","팔","구","십 ");
	    var danA = new Array("","십","백","천","","십","백","천","","십","백","천","","십","백","천");
	    var result = "";
		for(i=0; i<num.length; i++) {		
			str = "";
			han = hanA[num.charAt(num.length-(i+1))];
			if(han != "")
				str += han+danA[i];
			if(i == 4) str += "만";
			if(i == 8) str += "억";
			if(i == 12) str += "조";
			result = str + result;
		}
		if(num != 0)
			result = result + "원";
	    return result ;
	}

</script>

</head>
<body>
  <h3>프로젝트 후원(리워드) 폼</h3>
 <hr>
<h4> ${project.pro_title} </h4>
				<center>
			  <form action="suRewardSend.do">
				     <h4>보상없는 후원</h4><br>
					<table align="center" >
						<tr>
							<td>
						<input type="hidden" name="pro_no" value="${project.pro_no}"></td>
						</tr>
						    <td>
							서약 금액 :
							<!-- <input type="text" name="re_money" id="re_money">원 -->
							<input type="text" name="re_money" id="re_money" onkeyup="inputNumberFormat(this)">원
							<p style="font-weight: bold;" id="checkingMoney"></p>
						    <input type="hidden" name="reCheck" value="false">	
						    </td>
						<tr>
						<td>
						<input type="button" name="next" id="tess" value="tess">
							<input type="submit" name="next" id="next" value="계속하기">
						</td>
						</tr>
					</table>
				 </form>
				</center>
				<c:forEach items="${rewardList}" var="rewardList">
					
					  <br>
					  <br>
					<center>
					<form action="suRewardSend.do">
						<input type="hidden" name="re_no" value="${rewardList.re_no }">
						<input type="hidden" name="pro_no" value="${project.pro_no }">
						<input type="hidden" name="reCheck" value="true">
						<h4>${rewardList.re_title}</h4><br>
					    <table align="center" >
						<tr>
						<td>보상 품목 : ${rewardList.re_item}</td>
						</tr>
						<tr><td> 배송 예정일 : ${rewardList.re_delivery}</td></tr>
						<tr><td> 남은 수량 : ${rewardList.re_limite}</td></tr>
						
						<tr><td>
						서약금액: <input type="text" name="re_money" id="re_money" value="${rewardList.re_money}">원
						</td></tr>
						<tr><td>
						<input type="submit" name="next" id="next" value="계속하기">
						</td></tr>
					</table>
					</form>
					</center>
				</c:forEach>
 


</body>
</html>