<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Location</title>
</head>
<body>

<form action="saveLoc" method="POST">
    <pre>
        Id: <input type="text" name="id"/>
        Salutation: <input type="text" name="salutation"/>
        Firstname: <input type="text" name="firstname"/>
        Lastname: <input type="text" name="lastname"/>
        Email: <input type="text" name="email"/>
        Country: <input type="text" name="country"/>
        City: <input type="text" name="city"/>
        Streetname: <input type="text" name="streetname"/>
        Streetnumber: <input type="text" name="streetnumber"/>
        Postalcode: <input type="text" name="postalcode"/>
        Contact: <input type="text" name="contact"/>
        <input type="submit" value="save" />
        <input type="submit" value="clear" />
    </pre>
</form>
${msg}

<a href="displayLocations">View All</a>

</body>
</html>