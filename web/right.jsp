<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Welcome to Tablecloth</title>

    <!-- paste this code into your webpage -->
    <link href="tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
    <script type="text/javascript" src="tablecloth/tablecloth.js"></script>
    <!-- end -->

    <style>

        body{
            margin:0;
            padding:0;
            background:#f1f1f1;
            font:70% Arial, Helvetica, sans-serif;
            color:#555;
            line-height:150%;
            text-align:left;
        }
        a{
            text-decoration:none;
            color:#057fac;
        }
        a:hover{
            text-decoration:none;
            color:#999;
        }
        h1{
            font-size:140%;
            margin:0 20px;
            line-height:80px;
        }
        h2{
            font-size:120%;
        }
        #container{
            margin:0 auto;
            width:680px;
            background:#fff;
            padding-bottom:20px;
        }
        #content{margin:0 20px;}
        p.sig{
            margin:0 auto;
            width:680px;
            padding:1em 0;
        }
        form{
            margin:1em 0;
            padding:.2em 20px;
            background:#eee;
        }
    </style>

</head>

<body>
<div style="width:80%">
    <div>
        <form action="sc" method="post">
            <input type="hidden" name="action" value="findbykeyword">
            <input type="text" placeholder="请输入姓名或学号" name="keyword">&nbsp;&nbsp;<input type="submit" value="查询">&nbsp;&nbsp;&nbsp;&nbsp;<a href="add.jsp" target="rightfrm"><input type="button" value="添加学生"></a>
        </form>
    </div>
    <table  border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
        <tr>
            <th>编号</th>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>院系</th>
            <th>操作</th>
        </tr>
        </tr>
        <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.sno}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.sex}</td>
            <td>${student.department}</td>
            <td><a href="sc?action=toupdate&id=${student.id}">修改</a>&nbsp;&nbsp;&nbsp;<a href="sc?action=delete&id=${student.id}">删除</a>&nbsp;</td>
        </tr>
        </c:forEach>
    </table>
</div>
<script>
    function showAddStudent(){
        l
    }
</script>
</body>
</html>

