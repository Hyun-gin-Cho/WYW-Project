<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"; prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
            <tr>
                  <td>Boardno</td>
                  <td>Title</td>
                  <td>userid</td>
                  <td>userimgname</td>
                  <td>regdate</td>
            </tr>
            
            <c:forEach items="${list}" var="i">
                  <tr>
                        <td>${i.boardno }</td>
                        <td>${i.title }</td>
                        <td>${i.userid }</td>
                        <td>${i.userimgname }</td>
                        <td>${i.regdate }</td>
                  </tr>
            </c:forEach>
      </table>
</body>
</html>