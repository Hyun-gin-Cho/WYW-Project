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
</head>
<body>
	<header>
		<h2>��� ��� �� �޴�</h2>
	</header>

	<div class="main">
		<h2>����</h2>
		<div class="weather">
			<div class="left"></div>
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