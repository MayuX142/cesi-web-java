package fr.cesi.ihm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet(name = "HomeServlet", urlPatterns = {"/maservlet"})
@WebServlet("/maServlet")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        System.out.println(nom);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bryan = "Bryan <3";
        request.setAttribute("machainedecaractere", bryan);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/home.jsp");
        rd.forward(request, response);
    }
}
