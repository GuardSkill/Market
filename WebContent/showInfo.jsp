<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示信息</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");                  //请求的编码方式
		response.setContentType("text/html;charset=UTF-8");    //页面的编码方式
	%>
	用户名：<%=request.getParameter("username")%><br> 
	密码：<%=request.getParameter("password")%><br>
	爱好：
	<%
		String[] hobbys = request.getParameterValues("hobby");
		for (int i = 0; i < hobbys.length; i++) {
	%>
	<%=hobbys[i]%>           <!-- 这好似一个元素，需要分离 -->
	<%
		}
	%><br> 
	性别：<%=request.getParameter("gender")%><br> 
	出生地：<%=request.getParameter("birthAddress")%>
</body>
</html>