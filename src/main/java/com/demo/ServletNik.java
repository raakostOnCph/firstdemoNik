package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletNik", urlPatterns = {"/minservlet"})
public class ServletNik extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("postBesked", "det her er en post fra minServlet");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("besked", "Det her er en get fra minServlet");

//        String s = "hej med dig, du trykkede på " + request.getParameter("policy");
//        response.getWriter().print(s);


        String fname = request.getParameter("first_name");
        String lname = request.getParameter("last_name");

        response.getWriter().println("fornavnet var :" + fname);
        response.getWriter().println("efternavnet er :" + lname);





        // nedenstående går at vi vender tilbage til index
        // siden.
        // det går så hurtigt at vi ikke engang ser servletsiden.
        // derfor troede jeg ikke at de virkede.
//        request.getRequestDispatcher("index.jsp").forward(request,response);


    }
}
