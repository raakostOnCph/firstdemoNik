package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletNye", urlPatterns = {"/ServletNye"})
public class ServletNye extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String s = "hej med dig";


        response.getWriter().print(s);

        request.getRequestDispatcher("index.jsp").forward(request,response);



        request.setAttribute("besked","det her er fra min nye servlet ");
        request.getRequestDispatcher("index.jsp").forward(request,response);



    }
}
