package org.ignacio.rios.webapp.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/holamundo")
public class HolaMundoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setContentType("text/html");
       PrintWriter out = resp.getWriter();
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("    <meta charset=\"UTF-8\">");
       out.println("    <title></title>");
       out.println("    <link rel=\"stylesheet\" href=\"styles.css\">");
       out.println("</head>");
       out.println("<body>");
       out.println("<h2></h2>");
       out.println("</body>");
       out.println("</html>");


    }


}
