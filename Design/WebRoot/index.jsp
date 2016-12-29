<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>魏鹏辉个人博客网页</title>
<meta name="keywords" content="2016/11/30，毕业设计--个人博客" />
<meta name="description" content="这是一个基于ssh框架搭建的个人博客" />
<link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animation.css" rel="stylesheet">
<!-- 返回顶部调用 begin -->
<link href="${pageContext.request.contextPath}/css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<script type="text/javascript">
	
	function updateLike(m){
		
		$.ajax({
			data:"likear.articleid="+m,
			dataType:"html",
			url:"likeAction.action",
			success:function(){
				var x = document.getElementById("likeli_"+m);
				alert("x:" + x+",m="+m+",x.innerHTML:"+x.innerHTML );
				var n_v =  parseInt(x.innerHTML)+1;
				x.innerHTML=n_v;
			},
			error:function(){
				alert("错误了");
				var x = document.getElementById("likea_"+m);
				alert("x:" + x+",m="+m);
				var n_v =  parseInt(document.getElementById("likeli").innerHTML)+1;
				x.innerHTML="";
				x.innerHTML=" <li class='likes'>"+n_v+
            "</li>";
			}
		});
	}
	
	function showComment(arid){
           
            $.ajax({
            	data:"",
            	dataType:"",
            	url:"",
            	success:function(){
            		 document.getElementById("comment_"+ardi).style.display="block";
            	},
            	error:function(){
            		alert("本文章暂时没有评论");
            	}
            });
	}

</script>
<!-- 返回顶部调用 end-->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<header>
  <nav id="nav">
    <ul>
      <li><a href="${pageContext.request.contextPath}/index.jsp" >网站首页</a></li>
      <li><a href="${pageContext.request.contextPath}/manager/managerlogin.jsp" target="_blank" title="博主管理登陆">博主之家</a></li>
      <li><a href="${pageContext.request.contextPath}/recommended.jsp" target="_blank" title="文章推荐">文章推荐</a></li>
      <li><a href="${pageContext.request.contextPath}/webnavigation.jsp" target="_blank" title="网站建设">相册</a></li>
      <li><a href="${pageContext.request.contextPath}/jstt.jsp" target="_blank" title="技术探讨">技术实例文件</a></li>
      <li><a href="${pageContext.request.contextPath}/showsay.action" target="_blank" title="碎言碎语">碎言碎语</a></li>
    </ul>
    <script src="${pageContext.request.contextPath}/js/silder.js"></script><!--获取当前页导航 高亮显示标题--> 
  </nav>
</header>
<!--header end-->
<div id="mainbody">
  <div class="info">
    <figure> <img id="changimg" src="${pageContext.request.contextPath}/images/art.jpg"  alt="Panama Hat">
      <figcaption><strong>渡人如渡己，渡已，亦是渡</strong> 当我们被误解时，会花很多时间去辩白。 但没有用，没人愿意听，大家习惯按自己的所闻、理解做出判别，每个人其实都很固执。与其努力且痛苦的试图扭转别人的评判，不如默默承受，给大家多一点时间和空间去了解。而我们省下辩解的功夫，去实现自身更久远的人生价值。其实，渡人如渡己，渡已，亦是渡人。</figcaption>
    </figure>
    <div class="card">
    <c:forEach var="user" items="${user1}">
      <h1>我的名片</h1>
      <p>网名：${user.userName}</p>
 	</c:forEach>
      <p>年龄：${usermessage.MAge}</p>
      <p>性别：${usermessage.MSex}</p>
      <p>电话：${usermessage.MPhone}</p>
     <!--  <ul class="linkmore">
        <li><a href="${pageContext.request.contextPath}/leave.jsp" class="talk" title="给我留言"></a></li>
        <li><a href="index.jsp" class="address" title="返回首页"></a></li>
        <li><a href="http://mail.163.com/" class="email" title="给我写信"></a></li>
        <li><a href="photo.jsp" class="photos" title="生活照片"></a></li>
      </ul>-->
    </div>
  </div>
  <!--info end-->
  <div class="blank"></div>
  <div class="blogs">
    <ul class="bloglist">
      <li> 
        <div class="arrow_box">
          <div class="ti"></div>
          
          <!--三角形-->
          <div class="ci"></div> 
			  <!--圆形-->
			  
			<form action="articleAction" method="post">
          <h2 class="title"><br/>
          <input type="text" name="ac.title" value=".....title" onfocus="this.value=''" onblur="if(this.value==''){this.value='.....title'}">
          </h2>
          <br/>
          <ul class="textinfo">
            <a href="/"><img src="${pageContext.request.contextPath}/images/s2.jpg"/></a>
            <p><textarea name="ac.context" cols="50" rows="10" value="有什么趣闻想要分享？" onfocus="this.value=''" onblur="if(this.value==''){this.value='有什么趣闻想要分享？'}"></textarea>
            <input type="submit" value="发表"></p>
          </ul>
             </form>
          <ul class="details">
          </ul>
        </div>
     
        <!--arrow_box end--> 
          
     </li>
     <c:forEach var="article1" items="${article}">
      <li>
        <div class="arrow_box">
          <div class="ti"></div>
          <!--三角形-->
          <div class="ci"></div>
          <!--圆形-->
          <h2 class="title"><a href="wholeArticle.action?id=${article1.AId}" target="_blank">${article1.ATitle}</a></h2>
          <ul class="textinfo">
            <a href="/"><img src="${pageContext.request.contextPath}/images/s2.jpg"></a>
            <p> ${article1.AContext}</p>
          </ul>
         <ul class="details">
         <!--点赞 -->
         <a id="likea_${article1.AId}" onclick="updateLike(${article1.AId})">
            <li class="likes" id="likeli_${article1.AId}">
            ${article1.AOption1}
            </li>
         </a>
         <!-- 评论 
            <li class="comments">-->
            <!-- 显示评论 
            <a id="comm_${article1.AId}" onclick="showComment(${article1.AId})">2</a>
            </li>-->
          <!-- 时间 -->
            <li class="icon-time">
            <a href="#">${article1.AData}</a>
            </li>
          </ul>
          
          <ul id="comment_${article1.AId}" class="details" style="display: none;">
          		<!-- 评论展示 -->
          	<li id="comment_"></li><a onclick="commentback()">回复</a>
          		<!-- 回复文本框，默认隐藏，点击回复显示 -->
          	<li id="comment_back" stytle="display: none;">
          	<form action="arcommentbackAction.action" method="post">
          		<input type="text" name="  " />
          		<input type="submit" value="回复" />
          	</form>
          	</li>
          </ul>
        </div>
        </li>
       </c:forEach>
        
        <!--arrow_box end--> 
      <li>
        <div class="arrow_box">
          <div class="ti"></div>
          <!--三角形-->
          <div class="ci"></div>
          <!--圆形-->
          <h2 class="title"><a href="/" target="_blank">Nothing is as sweet as you</a></h2>
          <ul class="textinfo">
            <a href="/"><img src="${pageContext.request.contextPath}/images/s3.jpg"></a>
            <p> 有时候不是我不理你，其实我也想你了，只是我不知道该对你说什么。不管过去如何，过去的已经过去，最好的总在未来等着你。当我们懂得珍惜平凡的幸福的时候，就已经成了人生的赢家。Nothing is as sweet as you再没什么，能甜蜜如你。我以为只要很认真的喜欢就能打动一个人...</p>
          </ul>
         
          <ul class="details">
            <li class="likes"><a onclick="var x = parseInt(this.innerHTML);this.innerHTML=x+1">15</a></li>
            <li class="comments"><a href="#">2</a></li>
            <li class="icon-time"><a href="#">2013-8-7</a></li>
          </ul>
          
        </div>
        <!--arrow_box end--> 
      </li>
      <li>
        <div class="arrow_box">
          <div class="ti"></div>
          <!--三角形-->
          <div class="ci"></div>
          <!--圆形-->
          <h2 class="title"><a href="/" target="_blank">谁更心软，谁就先长大</a></h2>
          <ul class="textinfo">
            <a href="/"><img src="${pageContext.request.contextPath}/images/s4.jpg"></a>
            <p> 男人都是孩子，需要用一生时间来长大。女人都想当孩子，却最擅长的角色是妈妈。恋爱一开始，是两个孩子之间的游戏，到后来，成了大人和孩子之间的游戏。恋爱这回事，总要有一个人先长大，对另一半多些包容和宠溺。而通常来看：谁更心软，谁就先长大...</p>
          </ul>
         <ul class="details">
            <li class="likes"><a onclick="var x = parseInt(this.innerHTML);this.innerHTML=x+1">15</a></li>
            <li class="comments"><a href="#">2</a></li>
            <li class="icon-time"><a href="#">2013-8-7</a></li>
          </ul>
        </div>
        <!--arrow_box end--> 
      </li>
      <li>
        <div class="arrow_box">
          <div class="ti"></div>
          <!--三角形-->
          <div class="ci"></div>
          <!--圆形-->
          <h2 class="title"><a href="/" target="_blank">趁我们都还年轻</a></h2>
          <ul class="textinfo">
            <a href="/"><img src="${pageContext.request.contextPath}/images/s5.jpg"></a>
            <p> 趁我们都还年轻,多走几步路，多欣赏下沿途的风景，不要急于抵达目的地而错过了流年里温暖的人和物；趁我们都还年轻，多说些浪漫的话语，多做些幼稚的事情，不要嫌人笑话错过了生命中最美好的片段和场合；趁我们都还年轻，把距离缩短，把时间延长。趁我们都还年轻，多做些我们想要做的任何事...</p>
          </ul>
         <ul class="details">
            <li class="likes"><a onclick="var x = parseInt(this.innerHTML);this.innerHTML=x+1">15</a></li>
            <li class="comments"><a href="#">2</a></li>
            <li class="icon-time"><a href="#">2013-8-7</a></li>
          </ul>
        </div>
        <!--arrow_box end--> 
      </li>
    </ul>
    <!--bloglist end-->
    <aside>
      <div class="tuijian">
        <h2>博主心旅</h2>
        <ol>
        <c:forEach var="say" items="${say}" step="1" begin="1" end="9" varStatus="i">
          <li><span><strong>${i.index}</strong></span><a href="showSay.action?sayid=${say.SId}">${say.SContext}有一种思念，是淡淡的幸福,一个心情一行文字</a></li>
          </c:forEach>
         <!--  <li><span><strong>2</strong></span><a href="showarticl.jsp">励志人生-要做一个潇洒的女人</a></li>
          <li><span><strong>3</strong></span><a href="showarticl.jsp">女孩都有浪漫的小情怀――浪漫的求婚词</a></li>
          <li><span><strong>4</strong></span><a href="showarticl.jsp">Green绿色小清新的夏天-个人博客模板</a></li>
          <li><span><strong>5</strong></span><a href="showarticl.jsp">女生清新个人博客网站模板</a></li>
          <li><span><strong>6</strong></span><a href="showarticl.jsp">Wedding-婚礼主题、情人节网站模板</a></li>
          <li><span><strong>7</strong></span><a href="showarticl.jsp">Column 三栏布局 个人网站模板</a></li>
          <li><span><strong>8</strong></span><a href="showarticl.jsp">时间煮雨-个人网站模板</a></li>
          <li><span><strong>9</strong></span><a href="showarticl.jsp">花气袭人是酒香―个人网站模板</a></li>  -->
        </ol>
      </div>
     
      
     
      <div class="viny">
        <dl>
          <dt class="art"><img src="${pageContext.request.contextPath}/images/artwork.png" alt="专辑"></dt>
          <dd class="icon-song"><span></span>打错了</dd>
          <dd class="icon-artist"><span></span>歌手：林俊杰（JJ）</dd>
          <dd class="icon-album"><span></span>所属专辑：《梦想音乐人》</dd>
          <dd class="icon-like"><span></span><a href="/">喜欢</a></dd>
          <dd class="music">
            <audio src="${pageContext.request.contextPath}/music/nf.mp3" controls></audio>
          </dd>
          <!--也可以添加loop属性 音频加载到末尾时，会重新播放-->
        </dl>
      </div>
       <div class="toppic">
        <h2>我的关注</h2>
        <ul>
        	<c:forEach var="friend" items="${friend}">
          <div width="100%"><a href="showFriendiIndex.action?id=${friend.coId}"><li><img src="${pageContext.request.contextPath}/images/k01.jpg">${friend.blogUserByFriendId.userName}
            </li></a><br/>&nbsp;&nbsp;&nbsp;<br/></div>
            </c:forEach>
         
        </ul>
      </div>
    </aside>
  </div>
  <!--blogs end--> 
</div>
<!--mainbody end-->
<footer>
  <div class="footer-mid">
    <div class="links">
      <h2>友情链接</h2>
      <ul>
        <li><a href="http://www.w3school.com.cn/">w3cSchool</a></li>
        <li><a href="http://www.baidu.com">百度</a></li>
      </ul>
    </div>
    <div class="visitors">
      <h2>最新评论</h2>
      <dl>
        <dt><img src="${pageContext.request.contextPath}/images/s8.jpg">
        <dt>
        <dd>DanceSmile
          <time>49分钟前</time>
        </dd>
        <dd>在 <a href="http://www.yangqq.com/jstt/bj/2013-07-28/530.html" class="title">如果要学习web前端开发，需要学习什么？ </a>中评论：</dd>
        <dd>文章非常详细，我很喜欢.前端的工程师很少，我记得几年前yahoo花高薪招聘前端也招不到</dd>
      </dl>
      <dl>
        <dt><img src="${pageContext.request.contextPath}/images/s7.jpg">
        <dt>
        <dd>yisa
          <time>2小时前</time>
        </dd>
        <dd>在 <a href="http://www.yangqq.com/news/s/2013-07-31/533.html" class="title">芭蕾女孩的心事儿</a>中评论：</dd>
        <dd>我手机里面也有这样一个号码存在</dd>
      </dl>
      <dl>
        <dt><img src="${pageContext.request.contextPath}/images/s6.jpg">
        <dt>
        <dd>小林博客
          <time>8月7日</time>
        </dd>
        <dd>在 <a href="http://www.yangqq.com/jstt/bj/2013-06-18/285.html" class="title">如果个人博客网站再没有价值，你还会坚持吗？ </a>中评论：</dd>
        <dd>博客色彩丰富，很是好看</dd>
      </dl>
    </div>
    <section class="flickr">
      <h2>摄影作品</h2>
      <ul>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/01.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/02.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/03.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/04.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/05.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/06.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/07.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/08.jpg"></a></li>
        <li><a href="/"><img src="${pageContext.request.contextPath}/images/09.jpg"></a></li>
      </ul>
    </section>
  </div>
  <div class="footer-bottom">
    <p>Copyright 2013 Design by <a href="http://www.yangqq.com">DanceSmile</a></p>
  </div>
</footer>
<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
<div id="tbox"> <a id="togbook" href="${pageContext.request.contextPath}/showsay.action"></a> <a id="gotop" href="javascript:void(0)"></a> </div>
<!-- 代码结束 -->
</body>
</html>