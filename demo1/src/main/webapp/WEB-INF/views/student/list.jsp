
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Đây là trang home</h1>
<a href="student/add">Thêm mới</a>
<h2>${mess}</h2>
<table>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Subjects</th>
        <th>Class ID</th>
        <th>Detail-RQ</th>
        <th>Detail-PathVariable</th>
    </tr>
    <c:forEach var="s" items="${studentList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.gender}</td>
            <td>
                <c:forEach var="lag" items="${s.languages}">
                    <span>${lag}</span>
                </c:forEach>
            </td>
            <td>${s.classId}</td>
            <td>
                <a href="/student/detail?id=${s.id}">Detail1</a>
            </td>
            <td>
                <a href="/student/detail/${s.id}">Detail2</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
