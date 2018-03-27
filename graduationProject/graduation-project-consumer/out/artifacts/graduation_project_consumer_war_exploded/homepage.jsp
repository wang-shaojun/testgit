<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/19
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        window.onload=function () {
            var loginname='<%=request.getParameter("loginname")%>';
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';

            //获取src中的地址
            var src1=$("#rightFrame")[0].src;
            var index=src1+"?loginname="+loginname;
            //修改src中的地址
            $("#rightFrame").attr("src",index);

            //获取src中的地址
            var src2=$("#leftFrame")[0].src;
            var left=src2+"?jurisdictionname="+jurisdictionname;
            //修改src中的地址
            $("#leftFrame").attr("src",left);
        }
    </script>
</head>
<frameset rows="88,*,31" cols="*" frameborder="no" border="0" framespacing="0">
    <frame src="top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
    <frameset cols="187,*" frameborder="no" border="0" framespacing="0">
        <frame src="left.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
        <frame src="index.jsp" name="rightFrame" id="rightFrame" title="rightFrame" />
    </frameset>
</frameset>
<noframes>
<body>
</body></noframes>
</html>
