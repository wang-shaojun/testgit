<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>queryTeacher</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">

        function teacherQuery() {
            var teamid='<%=request.getParameter("teamid")%>';
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/selectByTeamId",
                data: JSON.stringify({"teamid":teamid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){

                            var teacheruserid=obj['teacheruserid'];
                            var teacherusername=obj['teacherusername'];
                            var teacherusersex=obj['teacherusersex'];
                            var teacheruserage=obj['teacheruserage'];
                            var teacheruserphone=obj['teacheruserphone'];
                            var teacheruseradress=obj['teacheruseradress'];
                            var curriculumid=obj['teacherusercurriculumid']; //教授课程
                            var specidtyid=obj['teacheruserspecidtyid']; //所在专业
                            var academyid=obj['teacheruseracademyid'];   //所在学院
                            var teacherusergrade=obj['teacherusergrade'];       //年级

                            //查询课程名称
                            $.ajax({
                                type: 'POST',
                                url: "/graduation/curriculum/query",
                                data: JSON.stringify({"curriculumid":curriculumid}),
                                contentType:"application/json",
                                dataType: "json",
                                success: function (result) {
                                    if(result.message == '成功')
                                    {
                                        var data=result.dataInfo;
                                        $.each(data,function(index,obj){
                                            var curriculumname=obj['curriculumname'];


                                            //查询专业名称
                                            $.ajax({
                                                type: 'POST',
                                                url: "/graduation/specidty/query",
                                                data: JSON.stringify({"specidtyid":specidtyid}),
                                                contentType:"application/json",
                                                dataType: "json",
                                                success: function (result) {
                                                    if(result.message == '成功')
                                                    {
                                                        var data=result.dataInfo;
                                                        $.each(data,function(index,obj){
                                                            var specidtyname=obj['specidtyname'];


                                                            //查询学院名称
                                                            $.ajax({
                                                                type: 'POST',
                                                                url: "/graduation/academy/query",
                                                                data: JSON.stringify({"academyid":academyid}),
                                                                contentType:"application/json",
                                                                dataType: "json",
                                                                success: function (result) {
                                                                    if(result.message == '成功')
                                                                    {
                                                                        var data=result.dataInfo;
                                                                        $.each(data,function(index,obj){
                                                                            var academyname=obj['academyname'];

                                                                            var teacher= "<tr><td>" + teacheruserid + "</td>" +
                                                                                "<td>" + teacherusername + "</td>" +
                                                                                "<td>" + teacherusersex + "</td>" +
                                                                                "<td>" + teacheruserage + "</td>" +
                                                                                "<td>" + teacheruserphone + "</td>" +
                                                                                "<td>" + teacheruseradress + "</td>" +
                                                                                "<td>" + curriculumname + "</td>"+
                                                                                "<td>" + specidtyname + "</td>" +
                                                                                "<td>" + academyname + "</td>" +
                                                                                "<td>" + teacherusergrade + "</td>" ;
                                                                            $("#teacher").append(teacher);
                                                                        });
                                                                    }else
                                                                    {
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
                                        });
                                    }else
                                    {
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
    </script>
</head>
<body onload="teacherQuery()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">团队信息</a></li>
        <li><a href="#">团队成员信息</a></li>
    </ul>
</div>

<div class="rightinfo">

    <table class="tablelist">
        <thead>
        <tr>
            <th>编号<i class="sort"></i></th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>电话</th>
            <th>地址</th>
            <th>教授课程</th>
            <th>所在专业</th>
            <th>所在学院</th>
            <th>所在年级</th>
        </tr>
        </thead>
        <tbody id="teacher">

        </tbody>

    </table>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>

</body>
</html>
