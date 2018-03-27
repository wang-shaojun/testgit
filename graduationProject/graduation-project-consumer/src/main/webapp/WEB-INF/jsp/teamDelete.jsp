<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/22
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teamDelete</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function deleted() {
            var teamid='<%=request.getParameter("teamid")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/team/delete",
                data: JSON.stringify({"teamid":teamid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        window.location.href = 'index.jsp';
                    }else
                    {
                        alert("失败")
                    }

                }

            })
        }
    </script>
</head>
<body onload="deleted()">

</body>
</html>
