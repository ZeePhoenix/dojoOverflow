<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>Questions Dashboard</title>
</head>
<body>
    <div class="header">
        <h1>Questions Dashboard</h1>
    </div>
    <div class="content">
        <table>
            <tr>
                <th>Questions</th>
                <th>Tags</th>
            </tr>
            <c:forEach var="question" items="${questions}">
                <tr>
                    <td><a href="shows/${question.id}"><c:out value="${question.name}"></c:out></a></td>
                    <td>tags</td>
                </tr>
            </c:forEach>
        </table>
        <a href=""></a>
    </div>
</body>
</html>
