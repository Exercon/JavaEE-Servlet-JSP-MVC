<%@ page import="studentpackage.StudentUtils" %>
<%@ page import="studentpackage.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <hr>
  <%
    out.println(StudentUtils.DisplayInfo((List<Student>) request.getAttribute("studentList")));
  %>
  <hr>
  </body>
</html>
