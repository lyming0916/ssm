<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <div style="text-align: center;">
                    <small>书籍列表 ———————— 显示所有书籍</small>
                    </div>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="/toAddBook">新增书籍</a>
                <a class="btn btn-primary" href="/allBook">显示全部书籍</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                 <form action="/queryBookByName" method="post" style="float: right" class="form-inline">
                     <span style="color: red;font-weight: bold">${error}</span>
                     <input type="text" name="bookName" class="form-control" placeholder="请输入要查询的书籍名称">
                     <input type="submit" value="查询" class="btn btn-primary">
                 </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <td>书籍编号</td>
                    <td>书籍名称</td>
                    <td>书籍数量</td>
                    <td>书籍详情</td>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookId}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="/toUpdateBook?id=${book.bookId}">修改</a>
                                &nbsp;|&nbsp;
                                <a href="/deleteBook/${book.bookId}">删除</a>
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