package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page_header")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<link rel='stylesheet' type='text/css' href='" +req.getContextPath() + "/style.css'>");

        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/Main'>Main</a></li>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/Catalog'>Catalog</a></li>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/Product'>Product</a></li>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/Cart'>Cart</a></li>");
        resp.getWriter().println("<li><a href='"+ req.getContextPath() + "/Order'>Order</a></li>");
        resp.getWriter().println("</ul>");
    }
}
