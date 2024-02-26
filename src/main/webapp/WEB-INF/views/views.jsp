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

    </div>
</div>
<table>
    <thead>
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>View Addresses</th>
            <th>Add Addresses</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="s" items="${sl}">
            <tr>
                <td><c:out value="${s.id}"/></td>
                <td><c:out value="${s.name}"/></td>
                <td><a href="/spadd/${s.id}">view</a></td>
                <td><a href="/sa/${s.id}">add</a></td>
                 <td><a href="/ldel/${s.id}">delete</a></td>
                  <td><a href="/luform?v1=${s.id}&v2=${s.name}">update</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<br><br>
<center><a href="/viewa">View Addresses</a>
<br><br>
<center><a href="/">Add Students</a>
</body>
</html>
