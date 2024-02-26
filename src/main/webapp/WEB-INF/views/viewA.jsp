<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
            margin-bottom: 20px; /* Add some space at the bottom */
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 5px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<div class="button-container">
    <div class="button-container">
        <form action="/">
            <input type="submit" value="Add">
        </form>
    </div>
</div>
<table>
    <thead>
        <tr>
            <th>State</th>
            <th>District</th>
            <th>Student Id</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="s" items="${sl}">
            <tr>
                <td><c:out value="${s.state}"/></td>
                <td><c:out value="${s.dist}"/></td>
                <td><c:out value="${sl.get(sl.indexOf(s)).getStudent().getId()}"/></td>
                 <td><a href="/laupd?v1=${s.state}&v2=${s.dist}">update</a></td>
                 <td><a href="/ladel?v1=${s.state}">delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<br><br>
<center><a href="/views">View Students</a>
<br><br>
<center><a href="/sa/${0}">Add Addresses</a>
</body>
</html>
