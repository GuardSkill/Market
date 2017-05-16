<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="/struts-tags" prefix="s" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome</title>
</head>
<body>
<form action="newGood" method="post">
			<button class="but" type="submit">登录</button>
			 <span id="show"><s:actionmessage/> </span>
</form>
</body>
</html>