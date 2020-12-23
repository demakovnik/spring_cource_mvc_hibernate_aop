<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>

<h2>Employee Info</h2>
<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id" />
    Name <form:input path="name"/><br>
    Surname <form:input path="surname"/><br>
    Department <form:input path="department"/><br>
    Salary <form:input path="salary"/><br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
