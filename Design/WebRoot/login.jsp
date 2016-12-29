<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<meta http-equiv="Pragma" content="no-cache"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Expires" content="0"> 
<title>后台登录</title> 
<link href="${pageContext.request.contextPath}/css/login.css" type="text/css" rel="stylesheet"> 
</head> 
<body> 

<div class="login">
    <div class="message">博客-博主登录</div>
    <div id="darkbannerwrap"></div>
    
    <form method="post" action="loginuserAction.action">
		<input name="action" value="login" type="hidden">
		 <input id="username" name="bl.username" type="text" value=".....username" onfocus="this.value=''" onblur="if(this.value==''){this.value='.....username'}"/>
		<hr class="hr15">
		<input id="pass" name="bl.pass" type="password" value="" onfocus="this.value=''" onblur="if(this.value==''){this.value=''}"/>
		<hr class="hr15">
		<input value="登录" style="width:100%;" type="submit">
		<br/>
		<p>还没有账号？</p><a href="zhuce.jsp">马上去注册</a>
		<hr class="hr20">
		<!-- 帮助 <a onClick="alert('请联系管理员')">忘记密码</a> -->
	</form>

	
</div>

<div class="copyright">友情链接<a href="http://www.mycodes.net/" target="_blank">源码之家</a></div>

</body>
</html>
