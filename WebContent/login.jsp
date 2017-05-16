<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path=request.getContextPath();
String basePath=request.getScheme()+"://"+request.getServerName()+":"+
request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<!-- 当前所有页面中的链接，前面默认会帮忙加上basePath -->
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
html {
	width: 100%;
	height: 100%;
	overflow: hidden;
	font-style: sans-serif;
}

body {
	width: 100%;
	height: 100%;
	font-family: 'Open Sans', sans-serif;
	margin: 0;
	background-color: #4A374A;
	background-image: url(backgroud.jpg);
	background-size: 100% 100%;
	background-repeat: no-repeat;
}

#login {
	position: absolute;
	top: 50%;
	left: 50%;
	margin: -150px 0 0 -150px;
	width: 300px;
	height: 300px;
}

#login h1 {
	color: #fff;
	text-shadow: 0 0 10px;
	letter-spacing: 1px;
	text-align: center;
}

h1 {
	font-size: 2em;
	margin: 0.67em 0;
}

input {
	width: 278px;
	height: 18px;
	margin-bottom: 10px;
	outline: none;
	padding: 10px;
	font-size: 13px;
	color: #fff;
	text-shadow: 1px 1px 1px;
	border-top: 1px solid #312E3D;
	border-left: 1px solid #312E3D;
	border-right: 1px solid #312E3D;
	border-bottom: 1px solid #56536A;
	border-radius: 4px;
	background-color: #2D2D3F;
}

.but {
	width: 300px;
	min-height: 20px;
	display: block;
	background-color: #4a77d4;
	color: #fff;
	font-size: 15px;
	line-height: normal;
	border-radius: 5px;
	border-top-width: 5px;
	border-right-width: 5px;
	border-bottom-width: 5px;
	border-left-width: 5px;
	padding: 10px;
	border-top-style: none;
	border-right-style: none;
	border-bottom-style: none;
	border-left-style: none;
	margin-top: 15px;
}

#show {
	font-size: 12px;
	color: #F00;
}
</style>
<script type="text/javascript">
</script>
</head>
<body>


	<div id="login">
		<h1>Login</h1>
		<form action="userLogin" method="post">
			<input name="user.uName" required="required" placeholder="用户名"
				type="text" /> 
			<input name="user.uPassword"
				required="required" placeholder="密码" type="password" /> 
			 <span id="show"><s:actionmessage/> </span>
		  <button class="but" type="submit">登录</button>
		  <button class="but" type="button"onclick="window.location.href='register.jsp'">注册</button>
		</form>
	</div>



</body>
</html>
