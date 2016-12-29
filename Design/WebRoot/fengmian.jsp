<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="gb2312"> 
<title>view-黑色时间轴个人博客模板</title>
<meta name="keywords" content="黑色模板,个人网站模板,个人博客模板,博客模板,css3,html5,网站模板" />
<meta name="description" content="这是一个有关黑色时间轴的css3 html5 网站模板" />
<link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/view.css" rel="stylesheet">
<!-- 返回顶部调用 begin -->
<link href="${pageContext.request.contextPath}/css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<!-- 返回顶部调用 end-->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<header>
  <nav id="nav">
    <ul>
      <li><a href="/" >网站首页</a></li>
      <li><a href="/download/" target="_blank" title="个人博客模板">个人博客模板</a></li>
      <li><a href="/book/" target="_blank" title="图书推荐">图书推荐</a></li>
      <li><a href="/web/" target="_blank" title="网站建设">网站建设</a></li>
      <li><a href="/newshtml5/" target="_blank" title="HTML5 / CSS3">HTML5 / CSS3</a></li>
      <li><a href="/jstt/" target="_blank" title="技术探讨">技术探讨</a></li>
      <li><a href="/news/s/" target="_blank" title="慢生活">慢生活</a></li>
      <li><a href="/newstalk/" target="_blank" title="碎言碎语">碎言碎语</a></li>
      <li><a href="/news/jsex/" target="_blank" title="JS 实例代码演示">JS实例</a></li>
    </ul>
    <script src="${pageContext.request.contextPath}/js/silder.js"></script><!--获取当前页导航 高亮显示标题--> 
  </nav>
</header>
<!--header end-->
<div id="mainbody">
   <div class="blogs">
    <div class="newlist">
 
<h2>${wholeArticle.ATitle}</h2>
	<br/><br/>
	<hr/>
	<p>时间:${wholeArticle.AData}</p>
	<p>作者:${wholeArticle.blogUser.userName}</p>
	<p>类型:${wholeArticle.AType}</p>
	<br/>
	<p>${wholeArticle.AContext}</p>
	<br/><br/><br/>
	<form action="articlecomment.action?id=${wholeArticle.AId}" method="post">
	<input type="text" name="context" />
	<input type="submit" value="评论"/>
	</form>
	
	<hr/>
	<c:forEach var="arComment" items="${arComment}">
	<p>${arComment.blogUser.userName}评论: ${arComment.arcContext}</p><br/>
	<p>${arComment.arcDate}</p>
	</c:forEach>
	
</div>
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
        <h2>好友列表</h2>
        <ul>
        	<c:forEach var="friend" items="${friend}">
          <li><a href="/"><img src="${pageContext.request.contextPath}/images/k01.jpg">${friend.blogUserByFriendId.userName}
            </a></li>
            </c:forEach>
          <li><a href="/"><img src="${pageContext.request.contextPath}/images/k02.jpg">问前任，你还爱我吗？无限戳中泪点~
            <p>111</p>
            </a></li>
          <li><a href="/"><img src="${pageContext.request.contextPath}/images/k03.jpg">世上所谓幸福，就是一个笨蛋遇到一个傻瓜。
            <p>222</p>
            </a></li>
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