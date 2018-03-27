<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <script type="text/javascript">
        function deleted() {
            var noticeid='<%=request.getParameter("noticeid")%>';
            $.ajax({
                type: 'POST',
                url: "/graduation/notice/delete",
                data: JSON.stringify({"noticeid":noticeid}),
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
