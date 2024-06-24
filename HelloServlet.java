package iclo51_a.controller;

import java.io.*;
import java.util.List;

import catalogue.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String neptun = req.getParameter("neptun");
        List<Student> studs = (List<Student>) req.getServletContext().getAttribute("StudList");

        Student got = new Student(neptun, "ASD", false);
        boolean success = false;
        Student found = new Student();

        for (Student s: studs) {
            if (s.getNeptun().equals(got.getNeptun())) {
                success = true;
                found = s;
            }
        }
        req.getSession().setAttribute("stud", found);

        if (success == false) {
            req.getSession().setAttribute("success", false);
            //String format = String.format("%.2f", mit);
        }
        else if (success == true && found.isPresent() == false ) {
            req.getSession().setAttribute("success", true);
            req.getSession().setAttribute("presented", false);
        }
        else {
            req.getSession().setAttribute("success", true);
            req.getSession().setAttribute("presented", true);
        }

        resp.sendRedirect("result.jsp");
    }
}