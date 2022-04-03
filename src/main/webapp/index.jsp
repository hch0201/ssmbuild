<%--
  Created by IntelliJ IDEA.
  User: 13039
  Date: 2022/3/29
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        a{
            text-decoration: none;
            color: black;
            font-size: 28px;
        }
        h1{
            width: 220px;
            height: 55px;
            margin: 100px auto;
            text-align: center;
            line-height: 55px;
            background: deepskyblue;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<h1>
    <a href="${pageContext.request.contextPath}/book/allBook">获取所有书籍</a>
</h1>
</body>
</html>
