<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>个人博客</title>
	<meta name="keywords" content="个人博客">
	<meta name="content" content="个人博客">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/zhuce_css/login.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/zhuce_js/jquery.min.js"></script>

</head>
<body class="login_bj" >

<div class="zhuce_body">
    <div class="zhuce_kong">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>欢迎注册</h3>
       	  	  <form action="zhuceAction.action" method="post">
                <input name="zhuce.userName" type="text" class="kuang_txt phone" placeholder="昵称">
                <input name="zhuce.userNumber" type="text" class="kuang_txt phone" placeholder="账号">
                <input name="zhuce.userPass" type="text" class="kuang_txt phone" placeholder="密码">
                <input name="zhuce.userPhone" type="text" class="kuang_txt phone" placeholder="手机号">
                <input name="zhuce.userHead" type="text" class="kuang_txt phone" placeholder="头像">
                <input name="zhuce.userAge" type="text" class="kuang_txt phone" placeholder="年龄">
                <input name="zhuce.userSex" type="text" class="kuang_txt phone" placeholder="性别">
               
                <div>
               		<input name="" type="checkbox" value=""><span>已阅读并同意<a href="#" target="_blank"><span class="lan">《XXXXX使用协议》</span></a></span>
                </div>
                <input name="注册" type="submit" value="注册">
                
                </form>
            </div>
        	<div class="bj_right">
            	<p>注册声明</p>
                <p>一、账号注册必须使用准确身份信息</p>
                <p>二、账号信息密码请妥善保存，丢失请联系管理员。</p>
                <p>已有账号？<a href="${pageContext.request.contextPath}/login.jsp">立即登录</a></p>
            
            </div>
        </div>
        <P>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</P>
    </div>



    <!-- 
    <form action="zhuceAction.action">
    user_name varchar2(20),
user_number varchar2(20)not null,
user_password varchar2(20) not null,
user_head_img varchar2(20),
user_option1 varchar2(20),
user_option2 varchar2(20)

</form>
     -->
     
     
     
</div>
    

</body>
</html>
