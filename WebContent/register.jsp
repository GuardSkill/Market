<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path=request.getContextPath();
String basePath=request.getScheme()+"://"+request.getServerName()+":"+
request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
<style type="text/css">
html{   
    width: 100%;   
    height: 100%;   
    overflow: hidden;   
    font-style: sans-serif;   
}   
body{
	width: 100%;
	height: 100%;
	font-family: 'Open Sans',sans-serif;
	margin: 0;
	background-color: #4A374A;
	background-image: url(backgroud.jpg);
	background-size: 100% 100%;
	background-repeat: no-repeat;
}   
#login{   
    position: absolute;   
    top: 50%;   
    left:50%;   
    margin: -150px 0 0 -150px;   
    width: 300px;   
    height: 300px;   
}   
#login h1{   
    color: #fff;   
    text-shadow:0 0 10px;   
    letter-spacing: 1px;   
    text-align: center;   
}   
h1{   
    font-size: 2em;   
    margin: 0.67em 0;   
}   
input{   
    width: 278px;   
    height: 18px;   
    margin-bottom: 10px;   
    outline: none;   
    padding: 10px;   
    font-size: 13px;   
    color: #fff;   
    text-shadow:1px 1px 1px;   
    border-top: 1px solid #312E3D;   
    border-left: 1px solid #312E3D;   
    border-right: 1px solid #312E3D;   
    border-bottom: 1px solid #56536A;   
    border-radius: 4px;   
    background-color: #2D2D3F;   
}   
.but{
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
.show2{font-size: 12px;
	color: #F00;}
</style>
 <script src="js/jquery-1.10.2.min.js"   
    type="text/javascript">  
    </script>  
</head>
<body> 
	
	<div id="login">
		<h1>sign up</h1>	
		<form id="myForm" name="myForm" action="userAdd" method="post">
			<input name="user.uName" class="input1" required="required" placeholder="用户名"
				type="text" id="uName" /> <span id="show"> </span>
			<input name="user.uPassword" class="input1" 
				required="required" placeholder="密码" type="password" />
	    <input name="user.uPhone"
				required="required" placeholder="手机" type="text" />
			<span class="show2"> <s:actionmessage/> </span>		
			<button class="but" type="submit">注册</button>
			<button class="but" type="reset">重置</button>		
			</form>
	</div>

	<script type="text/javascript">  
    //为id为uName的按钮绑定事件处理函数  
    $("#uName").blur(function()  
    {  
        //post myForm's data to userExist action  
        $.get("userExist" , $("#myForm").serializeArray() ,   
            //指定回调函数  
            function(data , statusText)  
            {  
                $("#show").html(data + "<br />");  
            },  
            //指定服务器响应为html  
            "html");  
    });  
</script>  
</body>
</html>