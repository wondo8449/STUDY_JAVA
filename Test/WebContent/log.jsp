<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>log.jsp</title>
	</head>
		
	<body>
		로그인 화면 
		<%
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String mail=request.getParameter("mail");
		%>
		
		입력된 아이디 : <%=id %>
		<br>
		입력된 비밀번호 : <%=pw %>
		<br>
		입력된 이메일 : <%=mail %>
	</body>
	
</html>

	