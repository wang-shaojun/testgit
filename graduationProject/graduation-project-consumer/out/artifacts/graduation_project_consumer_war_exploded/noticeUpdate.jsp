<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/21
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>noticeUpdate</title>
    <script language="JavaScript" src="js/jquery.js"></script>
    <style type="text/css">
        .textarer{
            height: 500px;
            width: 300px;
        }
    </style>
    <script type="text/javascript">
        $(function() {
            var noticeid='<%=request.getParameter("noticeid")%>';
            var teacherusername='<%=request.getParameter("teacherusername")%>';

            $.ajax({
                type: 'POST',
                url: "/graduation/notice/query",
                data: JSON.stringify({"noticeid":noticeid}),
                contentType:"application/json",
                dataType: "json",
                success: function (result) {
                    if(result.message == '成功')
                    {
                        var data=result.dataInfo;
                        $.each(data,function(index,obj){
                            var noticeupdatedTime=obj['noticeupdatedTime'];
                            var noticeupdatedBy=obj['noticeupdatedBy'];
                            var noticetitle=obj['noticetitle'];
                            var noticecontent=obj['noticecontent'];

                            var da="<tr><td>修改时间:</td><td><input type=\"text\" id=\"noticeupdatedTime\" name=\"noticeupdatedTime\" value='"+noticeupdatedTime+"'></td></tr>\n" +
                                "        <tr><td>修改人:</td><td><input type=\"text\" id=\"noticeupdatedBy\" name=\"noticeupdatedBy\" value='"+noticeupdatedBy+"'></td></tr>\n" +
                                "        <tr><td>标题:</td><td><input type=\"text\" id=\"noticetitle\" name=\"noticetitle\" value='"+noticetitle+"'></td></tr>\n" +
                                "        <tr><td>内容:</td><td><textarea class='textarer' id=\"noticecontent\" name=\"noticecontent\">"+noticecontent+"</textarea></td></tr>\n" +
                                "        <tr><td>作者:</td><td><input type=\"text\" id=\"teacherusername\" name=\"teacherusername\" value='"+teacherusername+"'></td></tr>\n";
                            $("#notice").append(da);
                        });
                    }else
                    {
                        alert("显示失败")
                    }

                }

            })
        });
    </script>


</head>
<body>
<form id="form" action="" method="">
    <table align="center">
        <div align="center" id="notice"></div>
        <tr><td><input type="submit" value="确定" onclick="update()"></td><td><input type="reset" value="重置"></td></tr>
    </table>
</form>
</body>
<script type="text/javascript">
    function update() {
        var noticeid='<%=request.getParameter("noticeid")%>';
        var noticeupdatedTime = $("#noticeupdatedTime").val();
        var noticeupdatedBy = $("#noticeupdatedBy").val();
        var noticetitle = $("#noticetitle").val();
        var noticecontent = $("#noticecontent").val();
        var teacherusername = $("#teacherusername").val();

        $.ajax({
            type: 'POST',
            url: "/graduation/teacheruser/queryId",
            data: JSON.stringify({"teacherusername":teacherusername}),
            contentType:"application/json",
            dataType: "json",
            success: function (result) {
                var me=result.message;
                alert("test:"+me);
                if(me == '成功')
                {
                    var data=result.dataInfo;
                    $.each(data,function(index,obj){
                        var teacheruserid=obj['teacheruserid'];
                        $.ajax({
                            type: 'POST',
                            url: "/graduation/notice/update",
                            data: JSON.stringify({
                                "noticeid":noticeid,
                                "noticeupdatedTime":noticeupdatedTime,
                                "noticeupdatedBy":noticeupdatedBy,
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
                                    alert("notice失败")
                                }

                            }

                        })
                    });
                }else
                {
                    alert("teacher失败")
                }

            }

        })
    }
</script>
</html>
