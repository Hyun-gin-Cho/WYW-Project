<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 작성하기</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" href="assets/css/main.css" />
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.poptrox.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/main.js"></script>
<style type="text/css">
#top>p {
	margin-top: 100px;
	margin-left: 50px;
	margin-bottom: 0px;
	font-size: 28pt;
}

body>form {
	margin: 100px 300px;
}

#button {
	background-color: #FFFBC1;
	color: black;
	width: 120px;
	margin: 5px;
	float: right;
}

#s0 {
	float: left;
	width: 34%
}

#s1 {
	float: left;
	width: 33%;
	padding: 25px 0px 25px 0px
}

#s2 {
	float: left;
	width: 100%
}

#s3 {
	float: left;
	width: 30%;
	padding: 0px 0px 0px 10px
}

#s4 {
	padding: 8px 0px 0px 0px
}

#s5 {
	float: left;
	width: 70%;
	padding: 6px 0px 0px 0px
}

#s6 {
	float: left;
}

#ask1 {
	border: 2px solid black;
	background-color: #fffbc1;
	font-weight: bold;
	color: #3f385a;
}

#dd {
	float: left;
}
</style>
</head>
<body>
	<header>
		<div id="s0">
			<a href="#"> <img alt="WYW_날씨를 입다"
				src="images/logo/logo_wyw_yellow.png" width="200" height="100" />
			</a>
		</div>
		<div id="s1">
			<input type="text">
		</div>
		<div id="s1">
			<input id="ask1" type="button" value="검색" onclick=""> <a
				href="#" class="label"> <img id="s4" class="icons"
				src="images/icon/set.png" alt="setting" align="right" width="30px" />
			</a>
		</div>
		<div id="s2"></div>
		<!-- 위쪽 div 와 아래쪽 div를 나누는 용도 -->
		<div id="s2"></div>
		<!-- 위쪽 div 와 아래쪽 div를 나누는 용도 -->
	</header>
	<div id="top">
		<p>공지사항</p>
	</div>
	<%
		String username = (String) session.getAttribute("username");
	String userid = (String) session.getAttribute("userid");
	%>
	<form action="controller.do" method="post">
		<input type="hidden" name="command" value="noticewrite"> 
		<input type="hidden" name="writer" value="<%=username%>"> 
		<input type="hidden" name="userid" value="<%=userid%>">
		<table border="1">
			<tr>
				<th>WRITER</th>
				<td><%=username%></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="30" cols="40" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="취소"
					onclick="location.href='manager.do?command=noticelist'" id="button">
					<input type="submit" value="작성" id="button"></td>
			</tr>
		</table>

	</form>
	<footer id="footer">
		<p>
			&copy; Untitled. All rights reserved. Design: <a
				href="http://templated.co">TEMPLATED</a>. Demo Images: <a
				href="http://unsplash.com">Unsplash</a>.
		</p>
	</footer>
</body>
</html>