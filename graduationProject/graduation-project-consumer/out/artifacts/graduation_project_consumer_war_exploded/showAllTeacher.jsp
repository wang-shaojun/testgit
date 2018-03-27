<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/20
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showAllTeacher</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function showAllTeacher() {
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var teachers="<tr><td>"+obj['teacheruserid']+"</td>"+
                                "<td>"+obj['teacherusername']+"</td>"+
                                "<td>"+obj['teacheruserupdatedTime']+"</td>"+
                                "<td>"+obj['teacheruserupdatedBy']+"</td>"+
                                "<td><a href='teacherQuery.jsp?teacheruserid="+obj['teacheruserid']+
                                "&jurisdictionname=" +jurisdictionname+"' target='rightFrame' class=\"tablelink\">详情</a>     " +
                                "<a href='teacherDelete.jsp?teacheruserid="+obj['teacheruserid']+
                                "' target='rightFrame' class=\"tablelink\">删除</a></td>";
                            $("#teachers").append(teachers);

                        });
                    }else
                    {
                        alert("失败")
                    }

                }

            })
        }

        function add() {
            window.location = 'teacherAdd.jsp';
        }

    </script>
</head>
<body onload="showAllTeacher()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">教师信息</a></li>
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
            <th>姓名</th>
            <th>修改时间</th>
            <th>修改人</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="teachers">

        </tbody>

    </table>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>
