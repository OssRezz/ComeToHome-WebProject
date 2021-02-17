/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.daoSede;
import DTO.dtoSede;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author james
 */
@WebServlet(name = "servletSede", urlPatterns = {"/servletSede"})
public class servletSede extends HttpServlet {

    dtoSede sedeIn = new dtoSede();
    daoSede sedeOut = new daoSede();

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

            sedeIn.setNombre(request.getParameter("nombre"));
            sedeIn.setDireccion(request.getParameter("direccion"));
            sedeIn.setTelefono(request.getParameter("telefono"));

            if (sedeIn.getNombre().isEmpty()) {
                //out.println("<script>");
                // out.println("alert('Error')");
                //out.println("</script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
                out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
                out.println("<div class='modal fade' id='modal-login' tabindex='-1' style='display: block;' data-keyboard='false' data-backdrop='static'>");
                out.println("<div class='modal-dialog modal-dialog-centered'>");
                out.println("<div class='modal-content'>");
                out.println("<div class='modal-header'>");
                out.println("<h5 class='modal-title text-danger' id='exampleModalLabel'>¡Alerta!</h5>");
                out.println("<button type='button' class='close' id='cerrar' data-dismiss='modal' aria-label='Close'>");
                out.println("<span aria-hidden='true'>&times;</span>");
                out.println("</button>");
                out.println("</div>");
                out.println("<div class='modal-body'>");
                out.println("<h6 class='text-danger'>Los campos están vacíos.</h6>");
                out.println("</div>");

                out.println("<div class='modal-footer'>");
                out.println("<button type='button' class='btn btn-outline-success'  id='cerrar2' data-dismiss='modal' aria-label='Close'>Regresar</button>");
                out.println("</div>");

                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                
                out.println("<script>");
                out.println("$('#modal-login').modal({backdrop: 'static', keyboard: false});");
                out.println("</script>");
                
                out.println("<script>");
                out.println("$(function(){ $('.modal').modal('show'); });");
                out.println("</script>");

                out.println("<script>");
                out.println("$('#cerrar').click(function(){location.href='Sedes.jsp'})");
                out.println("</script>");
                
                 out.println("<script>");
                out.println("$('#cerrar2').click(function(){location.href='Sedes.jsp'})");
                out.println("</script>");


                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q' crossorigin='anonymous'></script>");
                out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl' crossorigin='anonymous'></script>");
            } else {
                sedeOut.insertSede(sedeIn);
                out.println("<script>");
                out.println("alert('Sede registrada')");
                out.println("</script>");
                RequestDispatcher requestIn = request.getRequestDispatcher("Sedes.jsp");
                requestIn.forward(request, response);
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
