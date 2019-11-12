<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!doctype html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View All</title>
</head>
<body>

<h2>Customers</h2>
<table>
    <tr>
        <th>id</th>
        <th>salutation</th>
        <th>firstname</th>
        <th>lastname</th>
        <th>email</th>
        <th>country</th>
        <th>city</th>
        <th>streetname</th>
        <th>streetnumber</th>
        <th>postalcode</th>
        <th>contact</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.salutation}</td>
            <td>${customer.firstname}</td>
            <td>${customer.lastname}</td>
            <td>${customer.email}</td>
            <td>${customer.country}</td>
            <td>${customer.city}</td>
            <td>${customer.streetname}</td>
            <td>${customer.streetnumber}</td>
            <td>${customer.postalcode}</td>
            <td>${customer.contact}</td>

            <td><a href="showUpdate?id=${customer.id}">update</a></td>
            <td><a href="deleteLocations?id=${customer.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="showCreate">Add Customer</a>
</body>
</html>