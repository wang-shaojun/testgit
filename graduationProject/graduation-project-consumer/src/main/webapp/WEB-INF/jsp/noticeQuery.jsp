<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>noticeQuery</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <style type="text/css">
        .textarer{
            height: 500px;
            width: 300px;
        }
    </style>
    <script type="text/javascript">
        function noticeQuery() {
            var noticeid='<%=request.getParameter("noticeid")%>';
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            var teacherusername='<%=request.getParameter("teacherusername")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/notice/query",
                data: JSON.stringify({"noticeid":noticeid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var noticecreatedTime=obj['noticecreatedTime'];
                            var noticecreatedBy=obj['noticecreatedBy'];
                            var noticeupdatedTime=obj['noticeupdatedTime'];
                            var noticeupdatedBy=obj['noticeupdatedBy'];
                            var noticedeleted=obj['noticedeleted'];
                            var noticetitle=obj['noticetitle'];
                            var noticecontent=obj['noticecontent'];
                            var notice="<h2 align='center'>"+noticetitle+"</h2><hr>"+
                            "<div align='center'>"+"作者："+teacherusername+
                                "     创建时间："+noticecreatedTime+
                                "     创建人："+noticecreatedBy+
                                "     修改时间："+noticeupdatedTime+
                                "     创建人："+noticeupdatedBy+"</div><br>"+
                                "<div align='center'><textarea class='textarer'>"+noticecontent+"</textarea></div>";
                            $("#notice").append(notice);
                        });
                    }else
                    {
                        alert("失败")
                    }

                }

            })
        }


    </script>
    <script type="text/javascript">
        function update() {
            var noticeid='<%=request.getParameter("noticeid")%>';
            var teacherusername='<%=request.getParameter("teacherusername")%>';
            window.location = 'noticeUpdate.jsp?noticeid='+noticeid+'&teacherusername='+teacherusername;
        }
    </script>
</head>
<body onload="noticeQuery()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">公告信息</a></li>
        <li><a href="#">详情</a></li>
    </ul>
</div>
<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click" onclick="update()"><span><img src="images/t02.png" /></span>修改</li>
        </ul>

    </div>

    <table  width="60%" border="1" align="center" id="notice">

    </table>
</div>

</body>
</html>
