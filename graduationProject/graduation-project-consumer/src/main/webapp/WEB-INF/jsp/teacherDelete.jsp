<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/20
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacherDelete</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function deleted() {
            var teacheruserid='<%=request.getParameter("teacheruserid")%>';
            alert(teacheruserid);
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/delete",
                data: JSON.stringify({"teacheruserid":teacheruserid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
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
<body onload="deleted()">

</body>
</html>
