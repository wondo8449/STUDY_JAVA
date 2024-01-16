<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>

<body>
	<%-- JSP Expression Language --%>
	<ul>
		<li>ID : ${custmor.id }</li>
		<li>Name : ${custmor.name }</li>
		<li>E-mail : ${custmor.email }</li>
	</ul>
</body>
</html>