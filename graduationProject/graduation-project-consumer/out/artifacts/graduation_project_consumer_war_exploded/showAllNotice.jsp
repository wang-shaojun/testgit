<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showAllNotice</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function showAllNotice() {
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/notice/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                           var noticeid=obj['noticeid'];
                           var noticetitle=obj['noticetitle'];
                           var teacheruserid=obj['teacheruserid'];
                            $.ajax({
                                type: 'POST',
                                url: "/graduation/teacheruser/query",
                                data: JSON.stringify({"teacheruserid":teacheruserid}),
                                contentType:"application/json",
                                dataType: "json",
                                success: function (result) {
                                    if (result.message == '成功') {
                                        var data=result.dataInfo;
                                        $.each(data,function(index,obj){
                                            var teacherusername=obj['teacherusername'];
                                            var notices="<tr><td>"+noticeid+"</td>"+
                                                "<td>"+noticetitle+"</td>"+
                                                "<td>"+teacherusername+"</td>"+
                                                "<td><a href='noticeQuery.jsp?noticeid="+noticeid+
                                                "&jurisdictionname=" +jurisdictionname+"&teacherusername=" +teacherusername+
                                                "' target='rightFrame' class=\"tablelink\">详情</a>     " +
                                                "<a href='noticeDelete.jsp?noticeid="+noticeid+
                                                "' target='rightFrame' class=\"tablelink\">删除</a></td>";
                                            $("#notices").append(notices);
                                        });
                                    } else {
                                        alert("失败")
                                    }
                                }
                            })
                        });
                    }else
                    {
                        alert("失败")
                    }

                }

            })
        }

        function add() {
            window.location = 'noticeAdd.jsp';
        }

    </script>
</head>
<body onload="showAllNotice()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">公告信息</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click" onclick="add()"><span><img src="images/t01.png" /></span>添加</li>
        </ul>

    </div>


    <table class="tablelist">
        <thead>
        <tr>
            <th>编号<i class="sort"></i></th>
            <th>标题</th>
            <th>作者</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="notices">

        </tbody>

    </table>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>
