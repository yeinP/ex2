<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2023-09-12
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <tr>
        <td>
           mno
        </td>
        <td>
            memo_text
        </td>
    </tr>
<c:forEach var="memo" items="${list}">
    <tr>
        <td>
            ${memo.mno}
        </td>
        <td>
            ${memo.memoText}
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
