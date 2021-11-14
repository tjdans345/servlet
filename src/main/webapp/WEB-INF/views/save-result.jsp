<%@ page import="hello.servlet.domain.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
<%--    <li>id=<%=((Member)request.getAttribute("member"))%>></li>--%>
<%--    <li>id=<%=((Member)request.getAttribute("username"))%>></li>--%>
<%--    <li>id=<%=((Member)request.getAttribute("age"))%>></li>--%>

<%--    프로퍼티 접근법--%>
    <li>id=${member.id}</li>
    <li>name=${member.username}</li>
    <li>age=${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>