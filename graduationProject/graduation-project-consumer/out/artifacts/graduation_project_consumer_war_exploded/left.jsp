<%--
  Created by IntelliJ IDEA.
  User: wangshaojun
  Date: 2018/3/19
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>left</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>

    <script type="text/javascript">
        $(function(){
        //    var jurisdictionname='<%=request.getParameter("jurisdictionname")%>';
            //导航切换
            $(".menuson .header").click(function(){
                var $parent = $(this).parent();
                $(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();

                $parent.addClass("active");
                if(!!$(this).next('.sub-menus').size()){
                    if($parent.hasClass("open")){
                        $parent.removeClass("open").find('.sub-menus').hide();
                    }else{
                        $parent.addClass("open").find('.sub-menus').show();
                    }


                }
            });

            // 三级菜单点击
            $('.sub-menus li').click(function(e) {
                $(".sub-menus li.active").removeClass("active")
                $(this).addClass("active");
            });

            $('.title').click(function(){
                var $ul = $(this).next('ul');
                $('dd').find('.menuson').slideUp();
                if($ul.is(':visible')){
                    $(this).next('.menuson').slideUp();
                }else{
                    $(this).next('.menuson').slideDown();
                }
            });
        })
    </script>

</head>
<body style="background:#f0f9fd;">

<dl class="leftmenu">

    <dd>
        <div class="title">
            <span><img src="images/leftico01.png" /></span>管理信息
        </div>
        <ul class="menuson">

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="showAllTeacher.jsp" target="rightFrame">教师管理</a>
                    <i></i>
                </div>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="showAllNotice.jsp" target="rightFrame">公告信息</a>
                    <i></i>
                </div>
            </li>

            <li>
                <div class="header">
                    <cite></cite>
                    <a href="showAllTeam.jsp" target="rightFrame">团队信息</a>
                    <i></i>
                </div>
            </li>

        </ul>
    </dd>

</dl>
</body>
</html>
