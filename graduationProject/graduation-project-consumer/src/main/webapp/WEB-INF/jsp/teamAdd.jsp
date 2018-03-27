<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/22
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teamAdd</title>
    <script language="JavaScript" src="js/jquery.js"></script>

    <script type="text/javascript">
        function add() {
            var teamid=document.getElementsByName('teamid')[0].value;
            var teamcreatedTime=document.getElementsByName('teamcreatedTime')[0].value;
            var teamcreatedBy=document.getElementsByName('teamcreatedBy')[0].value;
            var teamupdatedTime=document.getElementsByName('teamupdatedTime')[0].value;
            var teamupdatedBy=document.getElementsByName('teamupdatedBy')[0].value;
            var teamdeleted=document.getElementsByName('teamdeleted')[0].value;
            var teamname = document.getElementsByName('teamname')[0].value;


            $.ajax({
                type: 'POST',
                url: "/graduation/team/add",
                data: JSON.stringify({
                    "teamid": teamid,
                    "teamcreatedTime": teamcreatedTime,
                    "teamcreatedBy": teamcreatedBy,
                    "teamupdatedTime": teamupdatedTime,
                    "teamupdatedBy": teamupdatedBy,
                    "teamdeleted": teamdeleted,
                    "teamname": teamname
                }),
                contentType: "application/json",
                dataType: "json",
                success: function (result) {
                    if (result.message == '成功') {
                        window.location.href = 'index.jsp';
                    } else {
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
        <tr><td>编号:</td><td><input type="text" name="teamid" value=""></td></tr>
        <tr><td>创建时间:</td><td><input type="text" name="teamcreatedTime" value=""></td></tr>
        <tr><td>创建人:</td><td><input type="text" name="teamcreatedBy" value=""></td></tr>
        <tr><td>修改时间:</td><td><input type="text" name="teamupdatedTime" value=""></td></tr>
        <tr><td>修改人:</td><td><input type="text" name="teamupdatedBy" value=""></td></tr>
        <tr><td>删除标识:</td><td><input type="text" name="teamdeleted" value=""></td></tr>
        <tr><td>团队名称:</td><td><input type="text" name="teamname" value=""></td></tr>
        <tr><td><input type="submit" value="确定" onclick="add()"></td><td><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
</html>
