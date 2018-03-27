<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showAllTeam</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function showAllTeam() {
            var jurisdictionname = '<%=request.getParameter("jurisdictionname")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/team/selectAll",
                data: JSON.stringify({}),
                contentType: "application/json",
                dataType: "json",
                success: function (result) {
                    if (result.message == '成功') {
                        var data = result.dataInfo;
                        $.each(data, function (index, obj) {
                            var teamid = obj['teamid'];
                            var teamcreatedTime = obj['teamcreatedTime'];
                            var teamcreatedBy = obj['teamcreatedBy'];
                            var teamupdatedTime = obj['teamupdatedTime'];
                            var teamupdatedBy = obj['teamupdatedBy'];
                            var teamdeleted = obj['teamdeleted'];
                            var teamname = obj['teamname'];

                            var teams = "<tr><td>" + teamid + "</td>" +
                                "<td>" + teamcreatedTime + "</td>" +
                                "<td>" + teamcreatedBy + "</td>" +
                                "<td>" + teamupdatedTime + "</td>" +
                                "<td>" + teamupdatedBy + "</td>" +
                                "<td>" + teamdeleted + "</td>" +
                                "<td>" + teamname + "</td>" +
                                "<td><a href='queryTeacher.jsp?teamid=" + teamid +
                                "&jurisdictionname=" + jurisdictionname +
                                "' target='rightFrame' class=\"tablelink\">团队成员</a>       " +
                                "<a href='teamDelete.jsp?teamid=" + teamid +
                                "' target='rightFrame' class=\"tablelink\">删除</a>      " +
                                "<a href='teamUpdate.jsp?teamid=" + teamid +
                                "' target='rightFrame' class=\"tablelink\">修改</a></td>";
                            $("#teams").append(teams);


                        });
                    }
                    else {
                        alert("失败")
                    }

                }
            })
        }


        function add() {
            window.location = 'teamAdd.jsp';
        }

    </script>
</head>
<body onload="showAllTeam()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">团队信息</a></li>
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
            <th>创建时间</th>
            <th>创建人</th>
            <th>修改时间</th>
            <th>修改人</th>
            <th>删除标识</th>
            <th>团队名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="teams">

        </tbody>

    </table>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>
