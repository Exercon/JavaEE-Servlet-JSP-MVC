package studenservletpackage;

import studentpackage.Student;
import studentpackage.StudentUtils;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;


public class StudentServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        List<Student> studentList = StudentUtils.CreateList();

        request.setAttribute("studentList", studentList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");

        dispatcher.forward(request,response);

    }
}
