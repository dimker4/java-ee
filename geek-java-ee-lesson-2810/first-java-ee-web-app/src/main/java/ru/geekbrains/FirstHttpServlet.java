package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/first_http_servlet/*")
public class FirstHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Переадресовываем запрос на другой сервлет
        // делаем include, который вставляет результат серверлета, не полностью переадресует
        getServletContext().getRequestDispatcher("/page_header").include(req, resp);

        resp.getWriter().println("<h1>hello from HttpServlet!</h1> <br> Привет от сервлета");
        resp.getWriter().println("<p>contextPath: " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>servletPath: " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>pathInfo: " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>queryString: " + req.getQueryString() + "</p>");
        resp.getWriter().println("<p>param1: " + req.getParameter("param1") + "</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
