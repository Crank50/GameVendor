<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Vendor</title>
</head>
<body>
<h1>View Vendor</h1>
<br><br>
<table>
    <tr>
        <td>Vendor Id:</td>
        <td><c:out value="${vendor.vendorID}" /></td>
    </tr>
    <tr>
        <td>Vendor Title:</td>
        <td><c:out value="${vendor.vendorTitle}" /></td>
    </tr>
    <tr>
        <td>Vendor Description:</td>
        <td><c:out value="${vendor.vendorDescription}" /></td>
    </tr>
</table>
<br><br>
<a href="/">HOME</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/categories/viewAllCategories">All Categories</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/categories/addCategory">Add New Category</a>
</body>
</html>