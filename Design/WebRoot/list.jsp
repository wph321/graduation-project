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
<meta charset="gb2312">
<title>view-黑色时间轴个人博客模板</title>
<meta name="keywords" content="黑色模板,个人网站模板,个人博客模板,博客模板,css3,html5,网站模板" />
<meta name="description" content="这是一个有关黑色时间轴的css3 html5 网站模板" />
<link href="css/styles.css" rel="stylesheet">
<link href="css/view.css" rel="stylesheet">
<!-- 返回顶部调用 begin -->
<link href="css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/js.js"></script>
<!-- 返回顶部调用 end-->
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
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
  <div class="blogs">
    <div class="newlist">
  <h2><span>
      
</span>博主心旅</h2>
  <c:forEach var="say" items="${fsay}">
     <ul>
<p class="ptime">发布时间：${say.SDate} 作者：${say.blogUser.userName}</p>
<p class="pcon">${say.SContext}</P>
<div class="line"></div>
</c:forEach>
<p class="ptit"><b><a href="/jstt/div/2013-08-10/575.html" target="_blank" title="li列表在网页中常见应用例举（一）">li列表在网页中常见应用例举（一）</a></b></p>
<p class="ptime">发布时间：2013-08-10 作者：杨青  分类：div+css </p>
<a href="/jstt/div/2013-08-10/575.html" target="_blank" title="li列表在网页中常见应用例举（一）"><img src="images/s2.jpg" class="imgdow" alt="li列表在网页中常见应用例举（一）"></a> <p class="pcon">li在网页中的应用,list-style-type,设置或检索对象的列表项所使用的预设标记。list-style-image：属性使用图像来替换列表项的标记,li列表前面用图片来展示.注意：ol对象和ul对象的type特性为其后的所有列表项目（如li对象）指明列表属性。 <a href="/jstt/div/2013-08-10/575.html" target="_blank" title="li列表在网页中常见应用例举（一）">详细信息</a></P>
<div class="line"></div>

<p class="ptit"><b><a href="/jstt/bj/2013-08-06/570.html" target="_blank" title="帝国cms怎样修改列表分页函数">帝国cms怎样修改列表分页函数</a></b></p>
<p class="ptime">发布时间：2013-08-06 作者：杨青  分类：心得笔记 </p>
<a href="/jstt/bj/2013-08-06/570.html" target="_blank" title="帝国cms怎样修改列表分页函数"><img src="images/s3.jpg" class="imgdow" alt="帝国cms怎样修改列表分页函数"></a> <p class="pcon">修改帝国默认的列表分页样式和伪静态页面留言版的分页样式。本来想在默认的模板标签上修改，看了看代码，b和a标签前后都多了空格，如果在现在的基础上改，简单改改也行，不过实在是受不了那么多空格符，而且如果用display:block的话... <a href="/jstt/bj/2013-08-06/570.html" target="_blank" title="帝国cms怎样修改列表分页函数">详细信息</a></P>
<div class="line"></div>

<p class="ptit"><b><a href="/jstt/div/2013-08-03/549.html" target="_blank" title="html css 十一条网页设计经典实用的代码片段">html css 十一条网页设计经典实用的代码片段</a></b></p>
<p class="ptime">发布时间：2013-08-03 作者：杨青  分类：div+css </p>
<a href="/jstt/div/2013-08-03/549.html" target="_blank" title="html css 十一条网页设计经典实用的代码片段"><img src="images/s4.jpg" class="imgdow" alt="html css 十一条网页设计经典实用的代码片段"></a> <p class="pcon">这十一条网页设计经典实用的代码片段，在网站的应用中都比较广泛。方便快速的查阅以及建设一个新的页面，非常适合刚接触的web前端设计。包括设置一些字体、站点链接、IE6bug的处理，导航菜单以及高亮显示菜单，还有表单的一些设计... <a href="/jstt/div/2013-08-03/549.html" target="_blank" title="html css 十一条网页设计经典实用的代码片段">详细信息</a></P>
<div class="line"></div>

<p class="ptit"><b><a href="/jstt/div/2013-07-31/532.html" target="_blank" title="Fieldset教你如何绘制带标题的表单框">Fieldset教你如何绘制带标题的表单框</a></b></p>
<p class="ptime">发布时间：2013-07-31 作者：杨青  分类：div+css </p>
<a href="/jstt/div/2013-07-31/532.html" target="_blank" title="Fieldset教你如何绘制带标题的表单框"><img src="images/s5.jpg" class="imgdow" alt="Fieldset教你如何绘制带标题的表单框"></a> <p class="pcon">一朋友问我像这样的表单样式是怎么实现的，我看到图，第一眼的印象应该是用图片来实现的，或者是用postion来定位实现的。本例演示如何在数据周围绘制一个带标题的框。 <a href="/jstt/div/2013-07-31/532.html" target="_blank" title="Fieldset教你如何绘制带标题的表单框">详细信息</a></P>
<div class="line"></div>

<p class="ptit"><b><a href="/jstt/bj/2013-07-28/530.html" target="_blank" title="如果要学习web前端开发，需要学习什么？">如果要学习web前端开发，需要学习什么？</a></b></p>
<p class="ptime">发布时间：2013-07-28 作者：杨青  分类：心得笔记 </p>
<a href="/jstt/bj/2013-07-28/530.html" target="_blank" title="如果要学习web前端开发，需要学习什么？"><img src="images/s6.jpg" class="imgdow" alt="如果要学习web前端开发，需要学习什么？"></a> <p class="pcon">遇到很多新手，都会问，如果要学习web前端开发，需要学习什么？难不难？多久能入门？怎么能快速建一个网站？工资能拿到多少？还有些让我推荐一些培训机构什么的要去学习。我建议是自学，实在是觉得自己没有这个能力，确实是需要一个老师的话，那你还是自己做主找个老师吧！ <a href="/jstt/bj/2013-07-28/530.html" target="_blank" title="如果要学习web前端开发，需要学习什么？">详细信息</a></P>
<div class="line"></div>


  </ul><!-- 
<div class="page"><a title="Total record"><b>38</b></a><b>1</b><a href="/jstt/index_2.html">2</a><a href="/jstt/index_2.html">></a><a href="/jstt/index_2.html">>></a></div>
-->
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