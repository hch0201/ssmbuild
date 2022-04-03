<%--
  Created by IntelliJ IDEA.
  User: 13039
  Date: 2022/3/29
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 查询所得书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">所有书籍</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <%--查询书籍--%>
            <form action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                <input type="text" name="queryBookName"  class="form-control" placeholder="请输入要查询的书籍名称">
                <input type="submit" value="查询" class="btn btn-success">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名字</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bId}</td>
                        <td>${book.bName}</td>
                        <td>${book.bCounts}</td>
                        <td>${book.bDetail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bId}">修改</a> |
                            <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
