<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("UTF-8");%>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ������</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mainPage.css">
<script type="text/javascript" src="./js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function(){
		getJson();
	});
	
	function getJson(){
		$.getJSON('http://api.openweathermap.org/data/2.5/forecast?id=1835848&appid=d3689315a68c7fb612f372f174579300&units=metric',
				function(data){
			var nowTemp = data.list[3].main.temp;
			var maxTemp = data.list[4].main.temp_max;
			var minTemp = data.list[0].main.temp_min;
			
			$('.nowtemp').append(nowTemp);
			$('.maxtemp').append(maxTemp);
			$('.mintemp').append(minTemp);
		});
	}
	$(function(){
		getLocation();
	});
	function getLocation() {
		  if (navigator.geolocation) { // GPS�� �����ϸ�
		    navigator.geolocation.getCurrentPosition(function(position) {
		      $('.nowloc').append(position.coords.latitude + ' ' + position.coords.longitude);
		    }, function(error) {
		      console.error(error);
		    }, {
		      enableHighAccuracy: false,
		      maximumAge: 0,
		      timeout: Infinity
		    });
		  } else {
		    alert('GPS�� �������� �ʽ��ϴ�');
		  }
		}
		
</script>
</head>
<body>
	<header>
		<h2>��� ��� �� �޴�</h2>
	</header>

	<div class="main">
		<h2>����</h2>
		<div class="weather">
			<div class="left">
				<div class="nowloc">���� ��ġ : </div><br>
				<div class="nowtemp">���� �µ� : </div><br>
				<div class="maxtemp">�ְ� ��� : </div><br>
				<div class="mintemp">���� ��� : </div>
			</div>
			<div class="right"></div>
		</div>

		<div class="recommend">
			<div class="circle" id="one"></div>
			<div class="circle" id="two"></div>
			<div class="circle" id="three"></div>
		</div>

		<div class="follower"></div>
	</div>

	<footer>
		<h2>�ϴ� �޴�</h2>
	</footer>

</body>
</html>