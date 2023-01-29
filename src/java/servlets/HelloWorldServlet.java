/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaz Baliola
 */
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        
        if(firstName == null || firstName.equals("") || lastName == null || lastName.equals("")) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/HelloWorldForm.jsp")
                .forward(request, response);
            return;
            
        } else {
            
            getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp")
                .forward(request, response);
            
        }
    }

}
