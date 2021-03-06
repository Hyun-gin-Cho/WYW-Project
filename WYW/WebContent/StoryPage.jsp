<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
	<head>
		<title>StoryPage</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<!-- Style -->
		<style type="text/css">
			#s0{ float: left; width: 34% }
			#s1{ float: left; width: 33%; padding: 25px 0px 25px 0px }
			#s2{ float: left; width: 100% }
			#s4{ padding: 8px 0px 0px 0px; margin-left: 25px; }
			#s6{ float: left; }
			#ask1{ 
				border: 2px solid black;
				background-color: #fffbc1; 
				font-weight: bold; 
				color: #3f385a;
			}
			a{ text-decoration: none }
			.avatacon {
			    width: 30px; 
			    height: 30px;
			    object-fit: cover;
			    object-position: top;
			    border-radius: 50%;
			}
			#select {
				font-size: 15px;
				background: #ff6382;
				vertical-align: middle; 
				text-align-last: center;
				color: #d3d3d3;
			}
		</style>
	<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/jquery.poptrox.min.js"></script>
		<script src="assets/js/skel.min.js"></script>
		<script src="assets/js/main.js"></script>
		<script type="text/javascript">
			window.onload = function(){
				var h = document.getElementById('hidemenu');
				var op = document.getElementById('viewmenu');
				var opp = document.getElementById('menu');
				
				op.style.display = 'none';
				opp.style.display = 'none';
				
				h.onclick = function(){
					h.style.display = 'none';
					op.style.display = '';
					opp.style.display = '';
				}
				
				op.onclick = function(){
					op.style.display = 'none';
					opp.style.display = 'none';
					h.style.display = '';
				}
			}
		</script>
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header>
						<div id="s0">
							<a href="#">
								<img alt="WYW_날씨를 입다" src="images/logo/logo_wyw_yellow.png" width="200" height="100">
							</a>
						</div>
						<div id="s1"><input type="text"></div>
						<div id="s1">
							<input id="ask1" type="button" value="검색" onclick="">
							<a href="#" class="label">
								<img id="s4" class="icons" src="images/icon/setting.png" alt="setting" align="right" width="30px">
								<img id="s4" class="icons" src="images/icon/user.png" alt="user" align="right" width="30px">
								<img id="s4" class="icons" src="images/icon/up.png" alt="upload" align="right" width="30px">
							</a>
						</div>
						<div id="s2"></div><!-- 위쪽 div 와 아래쪽 div를 나누는 용도 -->
					</header>

				<!-- Main -->
					<section>
							<div style="position: absolute;">
								<div style="position: relative;top: 110px; left: 385px;">
									<a href="#">
								    	<img class="avatacon" src="images/avatar.jpg">
								    	<strong>&nbsp;&nbsp;userID</strong>
							    	</a>
								</div>
								<div style="position: relative;top: 75px; left: 690px;">
									<img id="hidemenu" alt="menu" src="images/icon/menu.png" width="30px">
									<img id="viewmenu" alt="menu" src="images/icon/overmenu.png" width="30px">								
								</div>
								<div id="menu" style="position: relative; top: 33px; left: 728px; background-color: #fffbc1; color: black; font-weight: bold;">
									<form name="upload" method="post" action="">
										<table border="1">
											<col width="250">
											<tr>
												<td align="center">
													<select id="select" name="selectloc">
														<option value="">현재 계신 도시를 선택해주세요.</option>
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
												</td>
											</tr>
											<tr>
												<td align="center">
													<select id="select" name="selectsex">
														<option value="">성별 선택</option>
														<option value="M">남성</option>
														<option value="FM">여성</option>
														<option value="O">그외</option>
													</select>
												</td>
											</tr>
											<tr>
												<td align="center">
													<input name="fname" type="file" value="사진 선택" style="color: black;" accept=".jpg, .jpeg, .png, .gif, .bmp; images/storyimg/*; capture=camera"/>
												</td>
											</tr>
											<tr>
												<td align="center"><input type="submit" style="width: 100%; height: 100%;" value="내용 업로드" onclick=""></td>
											</tr>
										</table>
									</form>
								</div>
							</div>
						    <div id="header">
						    	<img alt="img" src="images/thumbs/01.jpg"/>
						    </div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<p>&copy; Untitled. All rights reserved. Design: <a href="http://templated.co">TEMPLATED</a>. Demo Images: <a href="http://unsplash.com">Unsplash</a>.</p>
					</footer>

			</div>

	</body>
</html>