<%@ page contentType="text/html; charset=utf-8" language="java"  
    import="java.util.*" errorPage=""%>  
<HTML>  
    <head>  
        <title>测试</title>  
    </head>  
  
    <BODY id="body">  
        <form>  
                <img border=0 src="validatecode" width="40" height="16" id = "imageMask">  
                <a href = "#" style = "font-size: 13px;margin-left: 5px;" onclick = "myReload()">看不清换一张</a>  
        </form>  
        <script type="text/javascript">  
        //用于刷新验证码  
         function myReload(){    
            document.getElementById("imageMask").src=
                document.getElementById("imageMask").src+"?nocache="+new Date().getTime();    
        }    
        </script>  
    </BODY>  
</HTML>  