<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8"/>
    <title>Home</title>
    <style>
        th, td {
            padding: 5px;
        }
        table  {
            border-collapse: collapse;
        }

    </style>
</head>

<body>

<h3>Using Publisher-DB</h3>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${publishers}" var="publisher">
        <tr>
            <td th:utext="${publisher.id}"></td>
            <td th:utext="${publisher.name}"></td>
        </tr>
    </c:forEach>
</table>

<h3>Using Advertiser-DB</h3>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${advertisers}" var="advertiser">
        <tr>
            <td th:utext="${advertiser.id}"></td>
            <td th:utext="${advertiser.name}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
