<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame
		Remove this if you use the .htaccess -->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8"><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Exam++</title>
		<meta name="viewport"
		content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="keywords" content="">
		<link rel="shortcut icon" href="<%=basePath%>resources/images/favicon.ico" />
		<link href="resources/bootstrap/css/bootstrap-huan.css"
		rel="stylesheet">
		<link href="resources/font-awesome/css/font-awesome.min.css"
		rel="stylesheet">
		<link href="resources/css/style.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/in_out.css" />
		<style>
			.question-number{
				color: #5cb85c;
				font-weight: bolder;
				display: inline-block;
				width: 30px;
				text-align: center;
			}
			
			.question-number-2{
				color: #5bc0de;
				font-weight: bolder;
				display: inline-block;
				width: 30px;
				text-align: center;
			}
			.question-number-3{
				color: #d9534f;
				font-weight: bolder;
				display: inline-block;
				width: 30px;
				text-align: center;
			}
			
			a.join-practice-btn{
				margin:0;
				margin-left:20px;
			}
			
			.content ul.question-list-knowledge{
				padding:8px 20px;
			}
			
			.knowledge-title{
				background-color:#EEE;
				padding:2px 10px;
				margin-bottom:20px;
				cursor:pointer;
				border:1px solid #FFF;
				border-radius:4px;
			}
			
			.knowledge-title-name{
				margin-left:8px;
			}
			
			.point-name{
				width:200px;
				display:inline-block;
			}
		</style>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript">
var arr_imgs = ["6.jpg","2.jpg","3.jpg","4.jpg","5.jpg"];
$(document).ready(function(){
	var timer;
	var index = 0;
	function fun(obj){
		clearTimeout(timer);//清除定时器（必须）
		$("#image").stop();//清除当前动画（必须）
		$("#img_"+index).attr("class","reduceImg unselectImg");//将当前图片的缩略图设为未选中样式
		obj.attr("class","reduceImg selectImg");//将选中的缩略图设为选中样式
		var path = obj.attr("src");
		var currentImg = path.substring(path.lastIndexOf("/")+1);
		$("#image").attr("src","${pageContext.request.contextPath}/images/"+currentImg);//设置要显示的图片
		$("#image").fadeTo(500,1);//淡入图片
		for(var i=0; i < arr_imgs.length; i++){//将index设置为当前显示图片的下标
			if(arr_imgs[i] == currentImg){
				index = i;
				break;
			}
		}
	}
	for(var i=0; i < arr_imgs.length; i++){//初始化缩略图
		var imgSrc = "${pageContext.request.contextPath}/images/"+arr_imgs[i];
		var imgTag = "<img id=\"img_"+i+"\" ";
		if(i==0){//第一张缩略图默认为选中样式
			imgTag += "class=\"reduceImg selectImg\"";
		}else{//其余缩略图默认为未选中样式
			imgTag += "class=\"reduceImg unselectImg\"";
		}
		imgTag += " src=\""+imgSrc+"\" />";
		$("#imglist").append(imgTag);//将缩略图添加到imglist元素中
		$("#img_"+i).mouseover(function (){//设置缩略图鼠标悬停事件
			fun($(this));
		});
		$("#img_"+i).mouseout(function (){//设置缩略图鼠标移出事件
			start();
		});
	}
	start();//开启效果
	function start(){
		timer = setTimeout(imgOut,3000);//每张图片停留2秒，然后轮换
	}
	function imgChange(){//改换图片
		index = ++index >= arr_imgs.length ? 0 : index;
		$("#image").attr("src","${pageContext.request.contextPath}/images/"+arr_imgs[index]);
	}
	function imgOut(){
		$("#image").fadeTo(1500,0.05,imgIn);//淡出图片，在淡出后调用imgIn方法淡入图片
	}
	function imgIn(){
		$("#img_"+index).attr("class","reduceImg unselectImg");//设置淡出图片的缩略图样式
		imgChange();//改换图片
		$("#img_"+index).attr("class","reduceImg selectImg");//设置淡入图片的缩略图样式
		$("#image").fadeTo(1500,1,start);//淡入图片，在淡入后继续调用start方法，以达到循环效果
	}
});

</script>

	</head>

	<body>
		<header>
			<div class="container">
				<div class="row">
					<div class="col-xs-5">
						<div class="logo">
							<h1><a href="#"><img alt="" src="${pageContext.request.contextPath}/resources/images/logo.png"></a></h1>
						</div>
					</div>
					<div class="col-xs-7" id="login-info">
						<c:choose>
							<c:when test="${not empty sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username}">
								<div id="login-info-user">
									
									<a href="user-detail/${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username}" id="system-info-account" target="_blank">${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username}</a>
									<span>|</span>
									<a href="j_spring_security_logout"><i class="fa fa-sign-out"></i> 退出</a>
								</div>
							</c:when>
							<c:otherwise>
								<a class="btn btn-primary" href="user-register">用户注册</a>
								<a class="btn btn-success" href="user-login-page">登录</a>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
		</header>
		<!-- Navigation bar starts -->

		<div class="navbar bs-docs-nav" role="banner">
			<div class="container">
				<nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="home"><i class="fa fa-home"></i>主页</a>
						</li>
						<li>
							<a href="start-exam"><i class="fa fa-edit"></i>试题练习</a>
						</li>
						<li>
							<a href="student/usercenter"><i class="fa fa-dashboard"></i>会员中心</a>
						</li>
						<li>
							<a href="student/setting"><i class="fa fa-cogs"></i>个人设置</a>
						</li>
						<li>
							<a href="show_news_action.action?nowpage=1"><i class="fa fa-news"></i>新闻</a>
						</li>
						<li>
							<a href="student/setting"><i class="fa fa-community"></i>社区</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>

		<!-- Navigation bar ends -->

		<!-- Slider starts -->

		<div class="full-slider">
			<!-- Slider (Flex Slider) -->

			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="flexslider">
							<div class="flex-caption">
								<!-- 新闻列表 -->
								<div class="col-l">
								     <ul>
<h3>国内新闻</h3>
<c:forEach var="news" items="${newList}">
<li><span>${news.ndate}</span><a href="/news/china/2012-12-10/69.html" style="color: white" title="广东丹霞山发现巨型"青铜剑"(组图)">&nbsp;&nbsp;&nbsp;${news.ntitle}</a></li>
</c:forEach>
<li><span>2012-12-10</span><a href="/news/china/2012-12-10/68.html" style="color: white" title="驻日大使崔天凯:胡锦涛主席访日有三点值得关注">&nbsp;&nbsp;&nbsp;驻日大使崔天凯:胡锦涛主席访日有三点值得</a></li>

<li><span>2012-12-10</span><a href="/news/china/2012-12-10/67.html" style="color: white" title="杭州湾跨海大桥日均车流量逾10万(组图)">&nbsp;&nbsp;&nbsp;杭州湾跨海大桥日均车流量逾10万(组图)</a></li>

<li><span>2012-12-10</span><a href="/news/china/2012-12-10/66.html" style="color: white" title="广东省物价局：粮价节后上涨不可信">&nbsp;&nbsp;&nbsp;广东省物价局：粮价节后上涨不可信</a></li>

<li><span>2012-12-10</span><a href="/news/china/2012-12-10/65.html" style="color: white" title="柏杨葬礼将于14日举行 骨灰抛撒绿岛海面">&nbsp;&nbsp;&nbsp;柏杨葬礼将于14日举行 骨灰抛撒绿岛海面</a></li>
<h3>国际新闻</h3>

<li><span>2012-12-10</span><a href="/news/world/2012-12-10/72.html" style="color: white" title="中国紧急援助物资运抵缅甸仰光(组图)">&nbsp;&nbsp;&nbsp;中国紧急援助物资运抵缅甸仰光(组图)</a></li>

<li><span>2012-12-10</span><a href="/news/world/2012-12-10/70.html" style="color: white" title="俄罗斯第三任总统梅德韦杰夫宣誓就职">&nbsp;&nbsp;&nbsp;俄罗斯第三任总统梅德韦杰夫宣誓就职</a></li>

<li><span>2012-12-10</span><a href="/news/world/2012-12-10/15.html" style="color: white" title="中国紧急援助物资运抵缅甸仰光(组图)">&nbsp;&nbsp;&nbsp;中国紧急援助物资运抵缅甸仰光(组图)</a></li>

<li><span>2012-12-10</span><a href="/news/world/2012-12-10/14.html" style="color: white" title="印度成功试射一枚“烈火－3”型导弹">&nbsp;&nbsp;&nbsp;印度成功试射一枚“烈火－3”型导弹</a></li>

<li><span>2012-12-10</span><a href="/news/world/2012-12-10/13.html" style="color: white" title="马来红新月会宣布将向缅甸派出救灾小组">&nbsp;&nbsp;&nbsp;马来红新月会宣布将向缅甸派出救灾小组</a></li>
<h3>娱乐新闻</h3>

<li><span>2012-12-10</span><a href="/news/ent/2012-12-10/76.html" style="color: white" title="“最美清洁工”原是《赤壁》宫女">&nbsp;&nbsp;&nbsp;“最美清洁工”原是《赤壁》宫女</a></li>

<li><span>2012-12-10</span><a href="/news/ent/2012-12-10/75.html" style="color: white" title="尹馨大胆亮相《男人装》 嫩肤美腿勾人魂">&nbsp;&nbsp;&nbsp;尹馨大胆亮相《男人装》 嫩肤美腿勾人魂</a></li>

<li><span>2012-12-10</span><a href="/news/ent/2012-12-10/74.html" style="color: white" title="传张艺谋因执导奥运身价涨5倍">&nbsp;&nbsp;&nbsp;传张艺谋因执导奥运身价涨5倍</a></li>

<li><span>2012-12-10</span><a href="/news/ent/2012-12-10/73.html" style="color: white" title="张曼玉广告写真花絮曝光 流露优雅从容">&nbsp;&nbsp;&nbsp;张曼玉广告写真花絮曝光 流露优雅从容</a></li>
<h3>体育新闻</h3>

<li><span>2012-12-10</span><a href="/news/sports/2012-12-10/78.html" style="color: white" title="中国男乒第16次捧起斯韦思林杯">&nbsp;&nbsp;&nbsp;中国男乒第16次捧起斯韦思林杯</a></li>

<li><span>2012-12-10</span><a href="/news/sports/2012-12-10/77.html" style="color: white" title="科比专为大场面而生">&nbsp;&nbsp;&nbsp;科比专为大场面而生</a></li>

<li><span>2012-12-10</span><a href="/news/sports/2012-12-10/71.html" style="color: white" title="奥运圣火成功登顶珠峰">&nbsp;&nbsp;&nbsp;奥运圣火成功登顶珠峰</a></li>
  </ul>
  <div align="center">
  <!-- 页码 -->
  <a href="show_news_action.action?nowpage=1"><button id="firstnewspage" value="1">首页</button></a>&nbsp;&nbsp;&nbsp;
   <a id="jianpagea" href="show_news_action.action?nowpage=${nowpage-1}" ><button id="lastnewspage">上一页</button></a>
    <a id="jiapagea" href="show_news_action.action?nowpage=${nowpage+1}" ><button id="nextpage" >下一页</button></a>&nbsp;&nbsp;&nbsp;
     <a href="show_news_action.action?nowpage=${allPage}"><button id="lastpage" value="${allPage}">末页</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <span id="nowpage"><s:property value="nowpage" /></span><span>/${allPage}</span>
  </div>
  </div>
								<!-- Right column -->
								<div class="col-r">

									<!-- Use the class "flex-back" to add background inside flex slider -->

										<ul id="container">
											<li><img id="image" src="${pageContext.request.contextPath}/images/6.jpg" /><li>
											<li id="diaphaneity"></li>
    										<li id="imglist"></li>
										</ul>
									<!-- <img alt="" src="resources/images/ad.png">-->
									<p>如果您对软件有任何反馈和建议，加入我们的QQ群152258375一起讨论吧</p> 
									<!-- Button -->
										<a class="btn btn-default btn-cta" href="user-register"><i class="fa fa-arrow-circle-down"></i> 马上加入我们吧</a>

								</div>
							</div>
						</div> 
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
