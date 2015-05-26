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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rubenp
 */
@WebServlet(name = "ActionServletDescripcion", urlPatterns = {"/ActionServletDescripcion"})
public class ActionServletDescripcion extends HttpServlet {

    Conexion c=new Conexion();


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String IdTema=request.getParameter("id");
            
            try {
                ResultSet rs=c.llenarDescripcion(IdTema);
                
                
                while (rs.next()) {
                    
                    out.println("<div class='col-md-6'>");
                    out.println("<div class='TitleDetalle'>");
                    out.println("<h4>Descripcion Curso</h4>");
                    out.println("</div>");
                    out.println("<div class='DetalleTema'>");
                    out.println("<p>"+rs.getString("Descripcion")+"</p>");
                    out.println("</div>");
                    out.println("</div>");
                    
                    out.println("<div class='col-md-6'>");
                    out.println("<div class='imgCurso'>");
//                    out.println(rs.getInt("IdTemas"));
                    out.println("<img src='VerImagenTema?idtema="+rs.getInt("IdTemas")+"' alt=''/>");
//                    out.println("<img src='VerImagenTema' alt=''/>");
                    out.println("</div>");
                    out.println("</div>");
                    
                }
                
            } catch (Exception e) {
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
        
        
        	
		PrintWriter out = response.getWriter();

		// Obtengo los datos de la peticion

		// Compruebo que los campos del formulario tienen datos para añadir a la tabla
          
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
