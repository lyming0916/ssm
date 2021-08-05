<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <link rel="stylesheet" type="text/css" href="css/index.css"/>
  </style>
</head>
<body>
  <form action="/login" method="post">
    <div class="t1">
      <input type="text" name="Id" id="t1" placeholder="请输入用户名" required>
      <input type="password" name="Password" id="t2" placeholder="请输入密码" required>
      <input type="submit" value="登录" id="t3">
    </div>
  </form>
</body>
</html>