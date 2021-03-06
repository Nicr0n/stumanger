<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Welcome to Tablecloth</title>

    <!-- paste this code into your webpage -->
    <link href="tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
    <script type="text/javascript" src="tablecloth/tablecloth.js"></script>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: #f1f1f1;
            font: 70% Arial, Helvetica, sans-serif;
            color: #555;
            line-height: 150%;
            text-align: left;
        }

        a {
            text-decoration: none;
            color: #057fac;
        }

        a:hover {
            text-decoration: none;
            color: #999;
        }

        h1 {
            font-size: 140%;
            margin: 0 20px;
            line-height: 80px;
        }

        h2 {
            font-size: 120%;
        }

        #container {
            margin: 0 auto;
            width: 480px;
            background: #fff;
            padding-bottom: 20px;
        }

        #content {
            margin: 0 20px;
        }

        p.sig {
            margin: 0 auto;
            width: 680px;
            padding: 1em 0;
        }

        form {
            margin: 1em 0;
            padding: .2em 20px;
            background: #eee;
        }

        #keywords {
            margin-left: 1em;
            margin-top: 1em;
        }
    </style>

</head>
<body>
<div style="margin:0 auto;width:50%">
    <form action="sc" method="post">
        <input type="hidden" name="action" value="add">
        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <th style="font-size:40px;text-align:center;" colspan="2">添加学生</th>
            </tr>
            <tr>
                <th>学号</th>
                <td><input type="text" name="sno" placeholder="请输入学号" />
                </td>
            </tr>
            <tr>
                <th>姓名</th>
                <td><input type="text" name="name" placeholder="请输入姓名" />
                </td>
            </tr>
            <tr>
                <th>年龄</th>
                <td><input type="number" name="age" placeholder="请输入年龄" />
                </td>
            </tr>
            <tr>
                <th>性别</th>
                <td><input type="radio" name="sex" value="男" checked />男<input type="radio" name="sex" value="女" />女</td>
            </tr>
            <tr>
                <th>院系</th>
                <td>
                    <select name="department">
                        <option value="信息学院">信息学院</option>
                        <option value="光电学院">光电学院</option>
                        <option value="化工学院">化工学院</option>
                        <option value="社会学院">社会学院</option>
                        <option value="人文学院">人文学院</option>
                        <option value="物理学院">物理学院</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="添加">
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>

