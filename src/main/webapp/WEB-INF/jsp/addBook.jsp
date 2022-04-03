<%--
  Created by IntelliJ IDEA.
  User: 13039
  Date: 2022/3/30
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>添加书籍</title>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
</div>

<form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/book/addBook">
    <div class="form-group">
        <label for="bkname" class="col-sm-2 control-label">书籍名称</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="bkname" name="bName" style="width: 333px" required>
        </div>
    </div>
    <div class="form-group">
        <label for="bkcount" class="col-sm-2 control-label">书籍数量</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="bkcount" name="bCounts" style="width: 333px" required>
        </div>
    </div>
    <div class="form-group">
        <label for="bkdis" class="col-sm-2 control-label">书籍描述</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="bkdis" name="bDetail" style="width: 333px" required>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">添加</button>
        </div>
    </div>
</form>
</body>
</html>
