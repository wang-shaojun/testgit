<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>noticeAdd</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <style type="text/css">
        .textarer{
            height: 350px;
            width: 300px;
        }
    </style>
    <script type="text/javascript">
        function add() {
            var noticeid=document.getElementsByName('noticeid')[0].value;
            var noticecreatedTime=document.getElementsByName('noticecreatedTime')[0].value;
            var noticecreatedBy=document.getElementsByName('noticecreatedBy')[0].value;
            var noticeupdatedTime=document.getElementsByName('noticeupdatedTime')[0].value;
            var noticeupdatedBy=document.getElementsByName('noticeupdatedBy')[0].value;
            var noticedeleted=document.getElementsByName('noticedeleted')[0].value;
            var noticetitle=document.getElementsByName('noticetitle')[0].value;
            var noticecontent=document.getElementsByName('noticecontent')[0].value;
            var teacherusername=document.getElementsByName('teacherusername')[0].value;

            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/queryId",
                data: JSON.stringify({"teacherusername":teacherusername}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var teacheruserid=obj['teacheruserid'];
                            $.ajax({
                                type: 'POST',
                                url: "/graduation/notice/add",
                                data: JSON.stringify({
                                    "noticeid":noticeid,
                                    "noticecreatedTime":noticecreatedTime,
                                    "noticecreatedBy":noticecreatedBy,
                                    "noticeupdatedTime":noticeupdatedTime,
                                    "noticeupdatedBy":noticeupdatedBy,
                                    "noticedeleted":noticedeleted,
                                    "noticetitle":noticetitle,
                                    "noticecontent":noticecontent,
                                    "teacheruserid":teacheruserid
                                }),
                                contentType:"application/json",
                                dataType: "json",
                                success: function (result) {
                                    if(result.message == '成功')
                                    {
                                        window.location.href='index.jsp';
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
<body>
<form id="form" action="" method="">
    <table align="center">
        <tr><td>编号:</td><td><input type="text" name="noticeid" value=""></td></tr>
        <tr><td>创建时间:</td><td><input type="text" name="noticecreatedTime" value=""></td></tr>
        <tr><td>创建人:</td><td><input type="text" name="noticecreatedBy" value=""></td></tr>
        <tr><td>修改时间:</td><td><input type="text" name="noticeupdatedTime" value=""></td></tr>
        <tr><td>修改人:</td><td><input type="text" name="noticeupdatedBy" value=""></td></tr>
        <tr><td>删除标识:</td><td><input type="text" name="noticedeleted" value=""></td></tr>
        <tr><td>标题:</td><td><input type="text" name="noticetitle" value=""></td></tr>
        <tr><td>内容:</td><td><textarea class='textarer' name="noticecontent"></textarea></td></tr>
        <tr><td>作者:</td><td><input type="text" name="teacherusername" value=""></td></tr>
        <tr><td><input type="submit" value="确定" onclick="add()"></td><td><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
</html>
