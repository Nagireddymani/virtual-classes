<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
     <tr>
     <th>StudentId</th>
     <th>StudentName</th>
     <th>Student DOB</th>
     </tr>
     <tr>
     <td>${student.studentId }</td>
     <td>${student.studentName }</td>
     <td>${student.dob }</td>
     </tr>
</table>
</body>
</html>