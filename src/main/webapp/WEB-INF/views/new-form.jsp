
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- 상대 경로 사용, [현재 URL이 속한 계층 경로 + /save -->
<%-- /를 붙이면 절대경로가 되고 /를 사용하지않으면 상대경로가된다(현재 디렉토리 위치뒤에 매핑주소가 붙게 된다.) --%>
<form action="save" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>
