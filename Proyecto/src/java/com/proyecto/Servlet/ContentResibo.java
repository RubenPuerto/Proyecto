/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.Servlet;

import com.proyecto.conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rubenp
 */
public class ContentResibo extends HttpServlet {
Conexion c=new Conexion();
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String IdTemas=request.getParameter("id");
            //out.println(IdTemas);
            try {
                try {ResultSet rs2=c.llenarDescripcion(IdTemas);
                    while (rs2.next()) {
                        out.println("<div class='TitleRecibo'>");
                        out.println("<h4>"+ rs2.getString("Titulo")+"</h4>");
                        out.println("<h4 id='precio'> $ "+ rs2.getString("Costo")+"</h4>");
                        out.println("</div");
                    }
                    
                } catch (Exception e) {
                }
                ResultSet rs=c.ContadorInscritos(IdTemas);
                while (rs.next()) {
                    out.println("<div></div>");
                    out.println("<div class='contador'>");
                    out.println("<h4 id='contador'>Este Curso le ha Interesa a "+ rs.getString("personas")+" Personas</h4><br>");
                    out.println("<h4 id='conta'>APUNTATE TU TAMBIEN</>");
                    out.println("</div");
                    
                     
                    
                }
                
            } catch (Exception e) {
                out.println("error");
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
