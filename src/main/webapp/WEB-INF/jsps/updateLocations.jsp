<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!doctype html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Customer</title>
</head>
<body>

<form action="updateLoc" method="POST">
    <pre>
        Id: <input type="text" name="id" value="${customer.id}" readonly="true"/>
        Salutation: <input type="text" name="salutation" value="${customer.salutation}"/>
        Firstname: <input type="text" name="firstname" value="${customer.firstname}"/>
        Lastname: <input type="text" name="lastname" value="${customer.lastname}"/>
        Country: <input type="text" name="Country" value="${customer.country}"/>
        City: <input type="text" name="City" value="${customer.city}"/>
        Streetname: <input type="text" name="streetname" value="${customer.streetname}"/>
        Streetnumber: <input type="text" name="streetnumber" value="${customer.streetnumber}"/>
        Postalcode: <input type="text" name="postalcode" value="${customer.postalcode}"/>
        Contact: <input type="text" name="contact" value="${customer.contact}"/>




        <input type="submit" value="save" />
    </pre>
</form>

<a href="displayLocations">View All</a>

</body>
</html>