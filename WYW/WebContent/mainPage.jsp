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
 <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBg3XCX9YlpK-ohJiE75xcdbLAa4kv-FWY"
  type="text/javascript"></script>
<script type="text/javascript" src="./js/jquery-3.5.1.js"></script>

<script type="text/javascript">
 	$(function(){
		getJson();
	});
	
	function getJson(){
		$.getJSON('http://api.openweathermap.org/data/2.5/forecast?id=1835848&appid=d3689315a68c7fb612f372f174579300&units=metric',
				function(data){
				
			for(var i=1; i<data.list.length; i++){
				var maxTemp = data.list[0].main.temp_max;
				var minTemp = data.list[0].main.temp_min;
				
				if(maxTemp<(data.list[i].main.temp_max)){
					maxTemp = data.list[i].main.temp_max
				}
				if(minTemp>(data.list[i].main.temp_min)){
					minTemp = data.list[i].main.temp_min
				}
			}
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
		    	var geocoder = new google.maps.Geocoder();
				var latlng = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
								
				geocoder.geocode({'latLng':latlng}, function(results, status){
					if(status == google.maps.GeocoderStatus.OK){
						if(results[1]){
							$('.nowloc').append(results[3].formatted_address);
						}else{
							alert("Geocoder failed due to : "+status);
						}
					}
				});
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
/* 	$(function(){
		getLocation();
	});
		
	function getLocation() {
		if(navigator.geolocation){
			navigator.geolocation.watchPosition(showPosition);
		} else{
			alert("GPS�� �������� �ʽ��ϴ�.")
		}
	}
	
	function showPosition(){
		var geocoder = new google.maps.Geocoder();
		var latlng = new google.maps.LatLng(position.coords.lastitude, position.coords.longtitude);
		
		geocoder.geocode({'latLng':latlng}, function(results, status)){
			if(status == google.maps.GeocoderStatus.OK){
				if(results[1]){
					forAddress.innerHTML = results[3].firmatted_address;
				}else{
					alert("Geocoder failed due to : "+status);
				}
			}
		}
	} */
	
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