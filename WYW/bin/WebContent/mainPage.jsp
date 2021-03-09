<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
	<title>메인페이지</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="assets/css/main.css" />
<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="assets/js/jquery.poptrox.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">
			<!-- Header -->
			<header>
				<div><img alt="WYW_날씨를 입다" src="images/logo/logo_wyw_yellowChange.png" width="200" height="100"/></div>
			</header>
			<!-- Main -->
			<section id="main">
				<div class="main"><br>
					<div class="weatherimg">
						<select id="city">
							<option hidden>현재 계신 도시를 선택해주세요.</option>
							<option value="seoul">서울특별시</option>
							<option value="incheon">인천광역시</option>
							<option value="daejeon">대전광역시</option>
							<option value="gwangju">광주광역시</option>
							<option value="daegu">대구광역시</option>
							<option value="ulsan">울산광역시</option>
							<option value="busan">부산광역시</option>
							<option value="gyeonggi-do">경기도</option>
							<option value="gangwon-do">강원도</option>
							<option value="chungcheongbuk-do">충청북도</option>
							<option value="chungcheongnam-do">충청남도</option>
							<option value="jeollabuk-do">전라북도</option>
							<option value="jeollanam-do">전라남도</option>
							<option value="gyeongsangbuk-do">경상북도</option>
							<option value="gyeongsangnam-do">경상남도</option>
							<option value="jeju-do">제주도</option>
						</select>
						<div class="weather">
							<div class="weatherDetail">
								<p class="location">현재 위치 : </p>
								<p class="current-temp">현재 기온 : </p>
								<p class="feels-like">체감 온도 : </p>
								<p class="current-time">현재 시간 : </p>
							</div>
							<div class="icon"></div>
						</div>
					</div>
				
					<div class="recommend">
						<div class="circle" id="one">
							<img alt="추천스토리1" src="images/thumbs/01.jpg" onclick="">
						</div>
						<div class="circle" id="two">
							<img alt="추천스토리2" src="images/thumbs/02.jpg" onclick="">
						</div>
						<div class="circle" id="three">
							<img alt="추천스토리3" src="images/thumbs/03.jpg" onclick="">
						</div>
					</div>
				
					<div class="follower">
						<span>스토리 세로 배치 / 클릭 시 해당 페이지로</span>
					</div>
				</div>
			</section>
			<!-- Footer -->
			<footer id="footer">
				<p>&copy; Untitled. All rights reserved. Design: <a href="http://templated.co">TEMPLATED</a>. Demo Images: <a href="http://unsplash.com">Unsplash</a>.</p>
			</footer>
		</div>
</body>
</html>