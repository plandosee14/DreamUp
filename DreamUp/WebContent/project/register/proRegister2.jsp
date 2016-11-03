<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#rewardOk').click(function() {
		if ($('#re_money').val() == "") {
			alert('서약금액을 입력하세요');
			$('#re_money').focus();
			return false;
		}  else if ($('#title').val() == "") {
			alert('리워드 타이틀을 입력하세요');
			$('#title').focus();
			return false;
		} else if ($('#item').val() == "") {
			alert('리워드 아이템을 입력하세요');
			$('#item').focus();
			return false;
		} else if ($('#duedate').val() == "") {
			alert('배송 예정일을 입력하세요');
			$('#duedate').focus();
			return false;
		} else if ($('#amount').val() == "") {
			alert('리워드 한정수량을 입력하세요');
			$('#amount').focus();
			return false;
		} 
		nextStep();
	});//click event
});

	var cnt = 0;
	var i = 0;
	var deleteList = [];
	function addItem() {

		var newDiv = document.createElement("div"); //<div></div>
		newDiv.setAttribute('id', 'item_' + cnt); //<div id="item_1"></div>

		newDiv.innerHTML = '<center>'

				+ '<h1>리워즈</h1>'
				+ '<fieldset>'
				+ '<label for="name">서약금액:</label>'
				+ '<input type="text" id="re_money" name="re_money'+cnt+'"><br>'
				+ '<label for="name">제목:</label>'
				+ '<input type="text" id="title" name="title'+cnt+'"><br>'
				+ '<label for="name">아이템:</label>'
				+ '<input type="text" id="item" name="item'+cnt+'"><br>'
				+ '<label for="name">배송예정일:</label>'
				+ '<input type="date" id="duedate" name="duedate'+cnt+'"><br>'
				+ '<label for="name">한정수량:</label>'
				+ '<input type="text" id="amount" name="amount'+cnt+'"><br>'
				+ '<button type="button" onclick="removeItem(' + cnt
				+ ')" style="right:200px; width: 100px; onclick=removeItem('
				+ cnt + ')">삭제</button></fieldset>'

				+ '</center>';

		var itemList = document.getElementById('itemList');
		itemList.appendChild(newDiv);

		cnt++;
	}
	function removeItem(no) {

		deleteList[i] = no;
		i++;
		var delDiv = document.getElementById('item_' + no);
		//부모노드.removeChild(삭제할 자식노드);
		//var itemList = document.getElementById('itemList');
		// itemList.removeChild(delNode);
		delDiv.parentNode.removeChild(delDiv);
	}
	function nextStep() {

		document.reward.cnt.value = cnt;
		document.reward.deleteList.value = deleteList;

		document.reward.submit();
	}
	window.onload = function() {
		addItem();
	}
</script>
</head>
<!-- changeUsingDom.html -->
<body>
	<center>
		<ul id="progressbar">
			<!--<li class="active">Account Setup</li>  -->
			<li>기본정보</li>
			<li class="active">리워즈</li>
			<li>스토리</li>
			<li>프로필</li>
			<li>계좌</li>
		</ul>

		${pro_No}

		<form name="reward" action="pro_reward.do" method="post">


			<div id="itemList"></div>
			<input type="button" value="추가" onclick="addItem()"> 
			<input type="hidden" value="" name="cnt"> 
			<input type="hidden" value="" name="deleteList"> 
			<input type="hidden" value="${login_id}" name="m_id"> 
			<input id="rewardOk" type="button" value="다음단계">

		</form>

	</center>
</body>
</html>