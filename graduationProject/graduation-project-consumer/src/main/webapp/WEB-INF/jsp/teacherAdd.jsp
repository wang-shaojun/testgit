<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/20
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {

            //教授课程
            //清空原有select内的数据
            $("#curriculum").empty();
            $.ajax({
                type: 'POST',
                url: "/graduation/curriculum/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success:function(result){
                    if(result.message == '成功')
                    {
                        $("#curriculum").append("<option value='-1'>--请选择--</option>");
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var curriculumid=obj['curriculumid'];
                            var curriculumname=obj['curriculumname'];
                            $("#curriculum").append("<option value='"+curriculumid+"'>"+curriculumname+"</option>");

                        });
                    }else
                    {
                        alert("失败")
                    }
                }
            });

            //所在专业
            //清空原有select内的数据
            $("#specidty").empty();
            $.ajax({
                type: 'POST',
                url: "/graduation/specidty/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success:function(result){
                    if(result.message == '成功')
                    {
                        $("#specidty").append("<option value='-1'>--请选择--</option>");
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var specidtyid=obj['specidtyid'];
                            var specidtyname=obj['specidtyname'];
                            $("#specidty").append("<option value='"+specidtyid+"'>"+specidtyname+"</option>");

                        });
                    }else
                    {
                        alert("失败")
                    }
                }
            });

            //所在学院
            //清空原有select内的数据
            $("#academy").empty();
            $.ajax({
                type: 'POST',
                url: "/graduation/academy/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success:function(result){
                    if(result.message == '成功')
                    {
                        $("#academy").append("<option value='-1'>--请选择--</option>");
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var academyid=obj['academyid'];
                            var academyname=obj['academyname'];
                            $("#academy").append("<option value='"+academyid+"'>"+academyname+"</option>");

                        });
                    }else
                    {
                        alert("失败")
                    }
                }
            });

            //身份
            //清空原有select内的数据
            $("#jurisdiction").empty();
            $.ajax({
                type: 'POST',
                url: "/graduation/jurisdiction/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success:function(result){
                    if(result.message == '成功')
                    {
                        $("#jurisdiction").append("<option value='-1'>--请选择--</option>");
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var jurisdictionid=obj['jurisdictionid'];
                            var jurisdictionname=obj['jurisdictionname'];
                            $("#jurisdiction").append("<option value='"+jurisdictionid+"'>"+jurisdictionname+"</option>");

                        });
                    }else
                    {
                        alert("失败")
                    }
                }
            });

            //所属团队
            //清空原有select内的数据
            $("#team").empty();
            $.ajax({
                type: 'POST',
                url: "/graduation/team/selectAll",
                data: JSON.stringify({}),
                contentType:"application/json",
                dataType: "json",
                success:function(result){
                    if(result.message == '成功')
                    {
                        $("#team").append("<option value='-1'>--请选择--</option>");
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var teamid=obj['teamid'];
                            var teamname=obj['teamname'];
                            $("#team").append("<option value='"+teamid+"'>"+teamname+"</option>");

                        });
                    }else
                    {
                        alert("失败")
                    }
                }
            });
        });
    </script>
    <script type="text/javascript">
        function add() {
            var teacheruserid=document.getElementsByName('teacheruserid')[0].value;
            var teacherusercreatedTime=document.getElementsByName('teacherusercreatedTime')[0].value;
            var teacherusercreatedBy=document.getElementsByName('teacherusercreatedBy')[0].value;
            var teacheruserupdatedTime=document.getElementsByName('teacheruserupdatedTime')[0].value;
            var teacheruserupdatedBy=document.getElementsByName('teacheruserupdatedBy')[0].value;
            var teacheruserdeleted=document.getElementsByName('teacheruserdeleted')[0].value;
            var teacherusername=document.getElementsByName('teacherusername')[0].value;
            var teacheruserpwd=document.getElementsByName('teacheruserpwd')[0].value;
            var teacherusersex=document.getElementsByName('teacherusersex')[0].value;
            var teacheruserage=document.getElementsByName('teacheruserage')[0].value;
            var teacheruserphone=document.getElementsByName('teacheruserphone')[0].value;
            var teacheruseradress=document.getElementsByName('teacheruseradress')[0].value;
            var curriculumid=document.getElementsByName('curriculumid')[0].value;
            var specidtyid=document.getElementsByName('specidtyid')[0].value;
            var academyid=document.getElementsByName('academyid')[0].value;
            var teacherusergrade=document.getElementsByName('teacherusergrade')[0].value;
            var jurisdictionid=document.getElementsByName('jurisdictionid')[0].value;
            var teamid=document.getElementsByName('teamid')[0].value;
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/add",
                data: JSON.stringify({
                    "teacheruserid":teacheruserid,
                    "teacherusercreatedTime":teacherusercreatedTime,
                    "teacherusercreatedBy":teacherusercreatedBy,
                    "teacheruserupdatedTime":teacheruserupdatedTime,
                    "teacheruserupdatedBy":teacheruserupdatedBy,
                    "teacheruserdeleted":teacheruserdeleted,
                    "teacherusername":teacherusername,
                    "teacheruserpwd":teacheruserpwd,
                    "teacherusersex":teacherusersex,
                    "teacheruserage":teacheruserage,
                    "teacheruserphone":teacheruserphone,
                    "teacheruseradress":teacheruseradress,
                    "teacherusercurriculumid":curriculumid,
                    "teacheruserspecidtyid":specidtyid,
                    "teacheruseracademyid":academyid,
                    "teacherusergrade":teacherusergrade,
                    "jurisdictionid":jurisdictionid,
                    "teamid":teamid
                }),
                contentType:"application/json",
                dataType: "json",
                success: function (data) {
                    if(data.message == '成功')
                    {
                        window.location.href = 'homepage.jsp';
                    }else
                    {
                        alert("失败")
                    }
                }

            })
        }
    </script>
</head>
<body>
<form id="form" action="" method="">
    <table align="center">
        <tr><td>编号:</td><td><input type="text" name="teacheruserid" value=""></td></tr>
        <tr><td>创建时间:</td><td><input type="text" name="teacherusercreatedTime" value=""></td></tr>
        <tr><td>创建人:</td><td><input type="text" name="teacherusercreatedBy" value=""></td></tr>
        <tr><td>修改时间:</td><td><input type="text" name="teacheruserupdatedTime" value=""></td></tr>
        <tr><td>修改人:</td><td><input type="text" name="teacheruserupdatedBy" value=""></td></tr>
        <tr><td>删除标识:</td><td><input type="text" name="teacheruserdeleted" value=""></td></tr>
        <tr><td>姓名:</td><td><input type="text" name="teacherusername" value=""></td></tr>
        <tr><td>密码:</td><td><input type="text" name="teacheruserpwd" value=""></td></tr>
        <tr><td>性别:</td><td><input type="radio" name="teacherusersex" value="男">男<input type="radio" name="teacherusersex" value="女">女</td></tr>
        <tr><td>年龄:</td><td><input type="text" name="teacheruserage" value=""></td></tr>
        <tr><td>电话:</td><td><input type="text" name="teacheruserphone" value=""></td></tr>
        <tr><td>地址:</td><td><input type="text" name="teacheruseradress" value=""></td></tr>
        <tr><td>教授课程:</td><td>
            <select id="curriculum" name='curriculumid'>

            </select>
        </td></tr>
        <tr><td>所在专业:</td><td>
            <select id="specidty" name='specidtyid'>

            </select></td></tr>
        <tr><td>所在学院:</td><td>
            <select id="academy" name='academyid'>

            </select></td></tr>
        <tr><td>所在年级:</td><td><input type="text" name="teacherusergrade" value=""></td></tr>
        <tr><td>身份:</td><td>
            <select id="jurisdiction" name='jurisdictionid'>

            </select></td></tr></td></tr>
        <tr><td>所属团队:</td><td>
            <select id="team" name='teamid'>

            </select></td></tr>
        <tr><td><input type="submit" value="确定" onclick="add()"></td><td><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
</html>
