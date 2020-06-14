<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv=content-type content="text/html; charset=utf-8" />
    <link href="./css/admin.css" type="text/css" rel="stylesheet" />
</head>
<body>
<table cellspacing=0 cellpadding=0 width="100%"
       background="./img/header_bg.jpg" border=0>
    <tr height=56>
        <td width=500 style="font-weight: bold; color: #fff; font-size:30px;padding-top: 5px"
            align=right>学生信息管理系统 </font> </td>
        <td style="font-weight: bold; color: #fff; padding-top: 20px;padding-right: 50px;"
            align=right>当前用户：<font color='red'>${admin.name}</font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a style="color: #fff" onclick="if (confirm('确定要退出吗？')) return true; else return false;"
               href="login.jsp" target=_top>退出系统</a>
        </td>
    </tr></table>
</body>
</html>
