package servlets;

import database.MyUserDatabase;
import entity.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User loginUser = MyUserDatabase.getInstance().getUser(email);

        if (loginUser != null && password.equals(loginUser.getPassword())) {
            session.setAttribute(User.USER_KEY, loginUser);
            response.sendRedirect("index.jsp");
        } else {
            try (PrintWriter out = response.getWriter()){
                out.println("Username or password does not match!");
            }
        }

    }
}
