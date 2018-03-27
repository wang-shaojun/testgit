<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/19
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function name(){
            var loginname='<%=request.getParameter("loginname")%>';
            document.getElementById("login").innerHTML=loginname;
        }
    </script>
</head>
<body onload="name()">

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
    </ul>
</div>

<div class="mainindex">


    <div class="welinfo">
        <span><img src="images/sun.png" alt="天气" /></span>
        你好<b id="login"></b>，欢迎使用教师团队管理系统
    </div>

    <br>

    <div>
        <b>教师团队管理系统简介</b>
    </div>

    <ul class="infolist">
        <li><span>教师团队管理系统开发出来是为了简化管理教师组成小组团体进行教学科研工作的管理系统</span></li>
        <li><span>在这里，您可以对教师信息进行管理操作</span></li>
        <li><span>在这里，您可以对团队信息进行管理操作</span></li>
        <li><span>在这里，您可以对团队进行的工作所发布的公告进行查看等操作</span></li>
        <li><span>在这里，您可以进行密码修改、账户设置等操作</span></li>
    </ul>

</div>



</body>
</html>

