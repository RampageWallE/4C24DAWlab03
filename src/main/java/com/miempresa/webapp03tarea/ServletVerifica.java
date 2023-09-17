/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.miempresa.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "ServletVerifica", urlPatterns = {"/ServletVerifica"})
public class ServletVerifica extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String xusu = request.getParameter("xusu");
            String xpas = request.getParameter("xpas");
            String usuario = "RampageWallE";
            String clave = "admin12";
            if (xusu.equals(usuario) && xpas.equals(clave)){
                response.sendRedirect("/WebApp03Tarea/servlets.html");
            }else if(xusu.equals(usuario) && xpas!=clave){
                out.print("<div class='container'>");
                out.print("<div class=\"card\" style=\"width: 18rem;\">\n"
                    + "  <div class=\"card-body\">\n"
                    + "    <h5 class=\"card-title\">La contraseña esta mal escrita</h5>\n"
                    + "    <p class=\"card-text\"></p>\n"
                    + "    <a href=\"login.jsp\" class=\"btn btn-primary\">Volver a intentar</a>\n"
                    + "  </div>\n"
                    + "</div>");
                out.print("</div>");                
            }else if(xusu!=usuario && xpas.equals(clave)) {
                out.print("<div class='container'>");
                out.print("<div class=\"card\" style=\"width: 18rem;\">\n"
                    + "  <div class=\"card-body\">\n"
                    + "    <h5 class=\"card-title\">El usuario esta mal escrito</h5>\n"
                    + "    <p class=\"card-text\"></p>\n"
                    + "    <a href=\"login.jsp\" class=\"btn btn-primary\">Volver a intentar</a>\n"
                    + "  </div>\n"
                    + "</div>");
                out.print("</div>");  
            }else{
                out.print("<div class='container'>");
                out.print("<div class=\"card\" style=\"width: 18rem;\">\n"
                    + "  <div class=\"card-body\">\n"
                    + "    <h5 class=\"card-title\">El usuario y la contraseña estan mal escritos</h5>\n"
                    + "    <p class=\"card-text\"></p>\n"
                    + "    <a href=\"login.jsp\" class=\"btn btn-primary\">Volver a intentar</a>\n"
                    + "  </div>\n"
                    + "</div>");
                out.print("</div>");
            }
        } finally { 
            out.close();
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
