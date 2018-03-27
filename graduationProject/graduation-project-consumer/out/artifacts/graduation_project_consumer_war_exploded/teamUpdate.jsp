<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/22
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teamUpdate</title>
    <script language="JavaScript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(function() {
            var teamid='<%=request.getParameter("teamid")%>';
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
                            var teamid=obj['teamid'];
                            var teamupdatedTime=obj['teamupdatedTime'];
                            var teamupdatedBy=obj['teamupdatedBy'];
                            var teamname=obj['teamname'];

                            var da="<tr><td>修改时间:</td><td><input type=\"text\" id=\"teamupdatedTime\" name=\"teamupdatedTime\" value='"+teamupdatedTime+"'></td></tr>\n" +
                                "        <tr><td>修改人:</td><td><input type=\"text\" id=\"teamupdatedBy\" name=\"teamupdatedBy\" value='"+teamupdatedBy+"'></td></tr>\n" +
                                "        <tr><td>团队名称:</td><td><input type=\"text\" id=\"teamname\" name=\"teamname\" value='"+teamname+"'></td></tr>\n";
                            $("#team").append(da);
                        });
                    }else
                    {
                        alert("显示失败")
                    }

                }

            })
        });
    </script>
    <script type="text/javascript">
        function update() {
            var teamid='<%=request.getParameter("teamid")%>';
            var teamupdatedTime = $("#teamupdatedTime").val();
            var teamupdatedBy = $("#teamupdatedBy").val();
            var teamname = $("#teamname").val();

            $.ajax({
                type: 'POST',
                url: "/graduation/team/update",
                data: JSON.stringify({
                    "teamid": teamid,
                    "teamupdatedTime": teamupdatedTime,
                    "teamupdatedBy": teamupdatedBy,
                    "teamname": teamname
                }),
                contentType: "application/json",
                dataType: "json",
                success: function (result) {
                    if (result.message == '成功') {
                        window.location.href = 'index.jsp';
                    } else {
                        alert("notice失败")
                    }

                }

            })

        }
    </script>

</head>
<body>
<form id="form" action="" method="">
    <table align="center">
        <div align="center" id="team"></div>
        <tr><td><input type="submit" value="确定" onclick="update()"></td><td><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
</html>
