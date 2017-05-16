<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");                  //请求的编码方式
		response.setContentType("text/html;charset=UTF-8");    //页面的编码方式
	%>
亲爱的:

：<%=request.getParameter("username")%><br> 
欢迎您
</body>
</html>