<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/20
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacherQuery</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">

        function teacherQuery() {
            var teacheruserid='<%=request.getParameter("teacheruserid")%>';
            var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/query",
                data: JSON.stringify({"teacheruserid":teacheruserid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){

                            var teacheruserid=obj['teacheruserid'];
                            var teacherusercreatedTime=obj['teacherusercreatedTime'];
                            var teacherusercreatedBy=obj['teacherusercreatedBy'];
                            var teacheruserupdatedTime=obj['teacheruserupdatedTime'];
                            var teacheruserupdatedBy=obj['teacheruserupdatedBy'];
                            var teacheruserdeleted=obj['teacheruserdeleted'];
                            var teacherusername=obj['teacherusername'];
                            var teacheruserpwd=obj['teacheruserpwd'];
                            var teacherusersex=obj['teacherusersex'];
                            var teacheruserage=obj['teacheruserage'];
                            var teacheruserphone=obj['teacheruserphone'];
                            var teacheruseradress=obj['teacheruseradress'];
                            var curriculumid=obj['teacherusercurriculumid']; //教授课程
                            var specidtyid=obj['teacheruserspecidtyid']; //所在专业
                            var academyid=obj['teacheruseracademyid'];   //所在学院
                            var teacherusergrade=obj['teacherusergrade'];       //年级
                            var jurisdictionid=obj['jurisdictionid'];       //身份
                            var teamid=obj['teamid'];       //所属团队

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

                                                                            //查询身份
                                                                            $.ajax({
                                                                                type: 'POST',
                                                                                url: "/graduation/jurisdiction/query",
                                                                                data: JSON.stringify({"jurisdictionid":jurisdictionid}),
                                                                                contentType:"application/json",
                                                                                dataType: "json",
                                                                                success: function (result) {
                                                                                    if(result.message == '成功')
                                                                                    {
                                                                                        var data=result.dataInfo;
                                                                                        $.each(data,function(index,obj){
                                                                                            var jurisdictionname=obj['jurisdictionname'];

                                                                                            //查询团队名称
                                                                                            $.ajax({
                                                                                                type: 'POST',
                                                                                                url: "/graduation/team/query",
                                                                                                data: JSON.stringify({"teamid":teamid}),
                                                                                                contentType:"application/json",
                                                                                                dataType: "json",
                                                                                                success: function (result) {
                                                                                                    if(result.message == '成功')
                                                                                                    {
                                                                                                        var data=result.dataInfo;
                                                                                                        $.each(data,function(index,obj){
                                                                                                            var teamname=obj['teamname'];

                                                                                                            var teacher="<tr><th>编号</th><td>"+teacheruserid+"</td></tr>" +
                                                                                                                "<tr><th>创建时间</th><td>"+teacherusercreatedTime+"</td></tr>" +
                                                                                                                "<tr><th>创建人</th><td>"+teacherusercreatedBy+"</td></tr>" +
                                                                                                                "<tr><th>修改时间</th><td>"+teacheruserupdatedTime+"</td></tr>" +
                                                                                                                "<tr><th>修改人</th><td>"+teacheruserupdatedBy+"</td></tr>" +
                                                                                                                "<tr><th>删除标识</th><td>"+teacheruserdeleted+"</td></tr>" +
                                                                                                                "<tr><th>姓名</th><td>"+teacherusername+"</td></tr>" +
                                                                                                                "<tr><th>密码</th><td>"+teacheruserpwd+"</td></tr>" +
                                                                                                                "<tr><th>性别</th><td>"+teacherusersex+"</td></tr>" +
                                                                                                                "<tr><th>年龄</th><td>"+teacheruserage+"</td></tr>" +
                                                                                                                "<tr><th>电话</th><td>"+teacheruserphone+"</td></tr>" +
                                                                                                                "<tr><th>地址</th><td>"+teacheruseradress+"</td></tr>" +
                                                                                                                "<tr><th>教授课程</th><td>"+curriculumname+"</td></tr>" +
                                                                                                                "<tr><th>所在专业</th><td>"+specidtyname+"</td></tr>" +
                                                                                                                "<tr><th>所在学院</th><td>"+academyname+"</td></tr>" +
                                                                                                                "<tr><th>所在年级</th><td>"+teacherusergrade+"</td></tr>" +
                                                                                                                "<tr><th>身份</th><td>"+jurisdictionname+"</td></tr>" +
                                                                                                                "<tr><th>所属团队</th><td>"+teamname+"</td></tr>";

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
        
        function update() {
            var teacheruserid='<%=request.getParameter("teacheruserid")%>';
            window.location = 'teacherUpdate.jsp?teacheruserid='+teacheruserid;
        }

    </script>
</head>
<body onload="teacherQuery()">
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">教师信息</a></li>
        <li><a href="#">详情</a></li>
    </ul>
</div>
<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click" onclick="update()"><span><img src="images/t02.png" /></span>修改</li>
        </ul>

    </div>

    <table  width="60%" border="1" align="center" id="teacher">

    </table>
</div>

</body>
</html>
