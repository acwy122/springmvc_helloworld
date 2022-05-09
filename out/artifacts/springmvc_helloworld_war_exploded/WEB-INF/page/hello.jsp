<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
欢迎欢迎，热烈欢迎
<form action="${ctp}/hello/hello" method="post">
    <input type="text" name="username"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
