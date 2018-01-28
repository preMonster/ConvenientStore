<%@ page language="java" import="java.util.*,java.net.*"   pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
/* request.setCharacterEncoding("utf-8")
String username = null;
String PASSWORD = null;
response.setContentType("text/html;charset=utf-8"); 
try{
Cookie[] cookies = request.getCookies();
if(cookies!=null){
	for(int i=0; i<cookies.length; i++){
		if(cookies[i].getName().equals("user")){
			username = cookies[i].getValue().split("-")[0];
			 PASSWORD = cookies[i].getValue().split("-")[1];
			 username =  URLDecoder.decode(username,"utf-8");
			request.setAttribute("LOGINNAME", username);
			request.setAttribute("PASSWORD", PASSWORD);
		}
	}
}
}
catch(Exception e){
	e.printStackTrace(); 
}*/
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1" />
	
	<link rel="stylesheet" href="module/css/bootstrap.min.css">	
	<link rel="stylesheet" type="text/css" href="module/css/login/login.css">

  </head>
  
  <body >
     <div class="content">
     	
    	<div>
    		<input id="loginName" placeholder="用户名"/>
    		<input id="password" placeholder="密码"/>
    		<select id="roleType">
    			<option value="1">连锁便利店销售平台</option>
    			<option value="2">连锁便利店后台管理系统</option>
    		</select>
    		<button onclick="login()">登录</button>
    	</div>
     
     </div>
     
     <script src="module/js/jquery-2.1.1.min.js"></script>
     <script src="module/js/jquery.cookie.js"></script>
     <script src="module/js/ajax.js"></script>      
     <script src="module/js/cookie.js"></script>      
     <script src="module/js/login/login.js"></script>      
     <script src="module/js/bootstrap.min.js"></script>
  </body>
</html>
