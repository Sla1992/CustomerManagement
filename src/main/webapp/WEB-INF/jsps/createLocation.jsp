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
        Country: <input type="text" name="country"/>
        <input type="submit" value="save" />

    </pre>
</form>
${msg}

<a href="displayLocations">View All</a>

</body>
</html>