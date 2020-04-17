package servlets;

import database.MyUserDatabase;
import entity.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisteredServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));
        //Date dataCreated = request.getParameter("dataCreated");
        //Date dataManipulated = request.getParameter("dataManipulated");
        String currentStatus = request.getParameter("currentStatus");
        String registeredStatus = request.getParameter("registeredStatus");



        if (!"".equalsIgnoreCase(username) &&
                !"".equalsIgnoreCase(email)) {

            User newUser = new User(username, email, password, gender, gender, age,
                    currentStatus, registeredStatus);
            MyUserDatabase.getInstance().addUser(newUser);
        }

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("doGet");
        }
    }
}
