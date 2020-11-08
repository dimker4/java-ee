package ru.geekbrains;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {

    private transient ServletConfig config;

    // Init вызывается при запуске сервлета
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    // Метод вызывается каждый раз, когда пиходит запрос на сервлет
    // Создается строго 1 экземпляр
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        getServletConfig().getServletContext().getRequestDispatcher("/page_header").include(req, res);
        res.getWriter().println("<h1> Hello from servlet!!!</h1>");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {

    }
}
