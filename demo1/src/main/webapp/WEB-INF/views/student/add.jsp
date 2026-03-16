<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 3/9/2026
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/student/add" modelAttribute="student">
    Id:
    <form:input path="id"/>
    Name:
    <form:input path="name"/>
    Gender:
    <form:radiobutton path="gender" value="true"/> Male
    <form:radiobutton path="gender" value="false"/> Female
    Subjects:
    <form:checkboxes path="languages" items="${subjects}"/>
    Class ID:
    <form:select path="classId">
        <form:option value="0">Select class Id</form:option>
        <form:option value="1">C0725L1</form:option>
        <form:option value="2">C0826L2</form:option>
    </form:select>
    <form:button>Save</form:button>
</form:form>
</body>
</html>
