<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/19
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="../js/jquery.js"></script>
    <script src="js/cloud.js" type="text/javascript"></script>

    <script language="javascript">
        $(function(){
            $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            $(window).resize(function(){
                $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            })
        });
    </script>

    <script type="text/javascript">
        function login() {
            var user = $(".loginuser").val();
            var password = $(".loginpwd").val();
            $.ajax({
                type: 'POST',
                url: "/graduation/teacheruser/login",
                data: JSON.stringify({"teacherusername":user, "teacheruserpwd":password}),
                contentType:"application/json",
                dataType: "json",
                success: function (data) {
                    //   var da = data.message;
                    if(data.message == '成功')
                    {
                        var da=data.dataInfo;
                        $.each(da,function(index,obj){
                            var jurisdictionname=obj['jurisdictionname'];
                            window.location = 'homepage.jsp?jurisdictionname='+jurisdictionname+'&loginname='+user;
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
<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">

<div id="mainBody">
    <div id="cloud1" class="cloud"></div>
    <div id="cloud2" class="cloud"></div>
</div>


<div class="logintop">
    <span>欢迎登录教师团队管理系统</span>
</div>

<div class="loginbody">

    <span class="systemlogo"></span>

    <div class="loginbox">

        <ul>
            <li><input name="loginuser" type="text" class="loginuser" value="admin" onclick="JavaScript:this.value=''"/></li>
            <li><input name="loginpwd" type="text" class="loginpwd" value="密码" onclick="JavaScript:this.value=''"/></li>
            <li><input name="" type="button" class="loginbtn" value="登录"  onclick="login()"  /></li>
        </ul>


    </div>

</div>

</body>
</html>
