package iclo51_a.controller;

import catalogue.Student;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionListener;

import java.util.ArrayList;
import java.util.List;

@WebListener
public class Listener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<Student> studs = new ArrayList<>();
        Student s1 = new Student("ABCD12", "Stud1", false);
        Student s2 = new Student("ABCO34", "Stud2", false);
        Student s3 = new Student("ABCX56", "Stud3", false);

        studs.add(s1);
        studs.add(s2);
        studs.add(s3);

        sce.getServletContext().setAttribute("StudList", studs);
    }
}
