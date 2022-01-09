/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themath;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.sqrt;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thanh Lan
 */
@WebServlet(name = "QuadraticEquation", urlPatterns = {"/quadraticequation"})
public class QuadraticEquation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String result = "", result2 = "";
        if (request.getParameter("a").equals("") || request.getParameter("b").equals("")) {
            result = "Nothing to do. Please enter the number";
            request.setAttribute("Result", "<p class=\"position-x\">Result: " + result + "</p>");
            request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
        } else {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));
            double delta = 0, x1, x2, x;
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        result = "The Equation has infinite solution";
                        request.setAttribute("Result", "<p class=\"position-x\">" + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    } else {
                        result = "The Equation has no solution";
                        request.setAttribute("Result", "<p class=\"position-x\">" + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    }
                } else {
                    x = (-c) / b;
                    if (x == 0) {
                        x = 0;
                        result = String.valueOf(x);
                        request.setAttribute("Result", "<p class=\"position-x\">The Equation has one solution <br>x: " + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    } else {
                        result = String.valueOf(x);
                        request.setAttribute("Result", "<p class=\"position-x\">The Equation has one solution <br>x: " + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    }
                }
            } else {
                delta = b * b - 4 * a * c;
                if (delta < 0) {
                    result = "The Equation has no solution";
                    request.setAttribute("Result", "<p class=\"position-x\">" + result + "</p>");
                    request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                } else if (delta == 0) {
                    x = -b / (2 * a);
                    if (x == 0) {
                        x = 0;
                        result = String.valueOf(x);
                        request.setAttribute("Result", "<p class=\"position-x\">The Equation has one solution <br>x: " + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    } else {
                        result = String.valueOf(x);
                        request.setAttribute("Result", "<p class=\"position-x\">The Equation has one solution <br>x: " + result + "</p>");
                        request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                    }
                } else if (delta > 0) {
                    x1 = ((-b + sqrt(delta)) / (2 * a));
                    x2 = ((-b - sqrt(delta)) / (2 * a));
                    result = String.valueOf(x1);
                    result2 = String.valueOf(x2);
                    request.setAttribute("Result", "<p class=\"position-x1\">The Equation has two solution <br>x1: " + result + "</p>"
                                        + "<p class=\"position-x2\">x2: " + result2 + "</p>");
                    request.getServletContext().getRequestDispatcher("/quadraticEquation.jsp").forward(request, response);
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
