<%@page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户登录</title>

    <link href="css/login.css" type="text/css" rel="stylesheet" />

</head>
<body id="userlogin_body">
<form action="ac" method="post">
    <div id="user_login">
        <dl>
            <dd id="user_top">
                <ul>
                    <li class="user_top_l"></li>
                    <li class="user_top_c"></li>
                    <li class="user_top_r"></li>
                </ul>
            </dd>
            <dd id="user_main">
                <ul>
                    <li class="user_main_l"></li>
                    <li class="user_main_c">
                        <div class="user_main_box">
                            <ul>
                                <li class="user_main_text">用户名： </li>
                                <li class="user_main_input"><input name="username" maxlength="20" id="TxtUserName" class="txtusernamecssclass"> </li>
                            </ul>
                            <ul>
                                <li class="user_main_text">密 码： </li>
                                <li class="user_main_input"><input type="password" name="password" id="TxtPassword" class="txtpasswordcssclass"> </li>
                            </ul>
                            <div>
                                <ul>
                                    <li>
                                        ${errormsg}
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li class="user_main_r"><input type="image" name="IbtnEnter" src="img/user_botton.gif" class="ibtnentercssclass"></li>
                </ul>
            </dd>
            <dd id="user_bottom">
                <ul>
                    <li class="user_bottom_l"></li>
                    <li class="user_bottom_c"></li>
                    <li class="user_bottom_r"></li>
                </ul>
            </dd>
        </dl>
    </div>
</form>
</body>
</html>