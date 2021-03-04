<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<title>No Name</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
<!-- Style -->
		<style type="text/css">
			#s0{ float: left; width: 34% }
			#s1{ float: left; width: 33%; padding: 25px 0px 25px 0px }
			#s2{ float: left; width: 100% }
			#s4{ padding: 8px 0px 0px 0px;
				 margin-left: 20px;
			}
			
			#ask1{ 
				border: 2px solid black;
				background-color: #fffbc1; 
				font-weight: bold; 
				color: #3f385a;
			}
		</style>
	<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.poptrox.min.js"></script>
		<script src="assets/js/skel.min.js"></script>
		<script src="assets/js/main.js"></script>
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header>
						<div id="s0">
							<a href="#">
								<img alt="WYW_날씨를 입다" src="images/logo/logo_wyw.png" width="200" height="100">
							</a>
						</div>
						<div id="s1"><input type="text"></div>
						<div id="s1">
							<input id="ask1" type="button" value="검색" onclick="">
							<a href="#" class="label">
								<img id="s4" class="icons" src="images/icon/set.png" alt="setting" align="right" width="30px">
								<img id="s4" class="icons" src="images/icon/user.png" alt="setting" align="right" width="30px">
								<img id="s4" class="icons" src="images/icon/home.png" alt="setting" align="right" width="30px">
							</a>
						</div>
					</header>

				<!-- Main -->
					<section id="main">
					
					</section>

				<!-- Footer -->
					<footer id="footer">
						<p>&copy; Untitled. All rights reserved. Design: <a href="http://templated.co">TEMPLATED</a>. Demo Images: <a href="http://unsplash.com">Unsplash</a>.</p>
					</footer>

			</div>

	</body>
</html>