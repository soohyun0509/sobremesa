<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	
	
	<%@include file="../header.jsp" %>
	
	<%if(loginId!=null){
		request.getSession().setAttribute("id", null);
		response.sendRedirect("signin.jsp");	
	}%>
	



</body>
</html>