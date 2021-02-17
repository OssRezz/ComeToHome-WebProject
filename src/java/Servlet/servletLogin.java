/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.daoLogin;
import DTO.dtoLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author james
 */
@WebServlet(name = "servletLogin", urlPatterns = {"/servletLogin"})
public class servletLogin extends HttpServlet {

    int r;

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
        dtoLogin dtoValidacion = new dtoLogin();
        daoLogin daoValidacion = new daoLogin();

        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            String accion = request.getParameter("accion");

            if (accion.equals("Ingresar")) {
                dtoValidacion.setUsuario(request.getParameter("usuario"));
                dtoValidacion.setPassword(request.getParameter("password"));
                r = daoValidacion.validarUsuario(dtoValidacion);

                if (r == 1) {
                    out.println("<script>");
                    out.println("location.href='grid.jsp'");
                    out.println("</script>");

                } else {
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
                    out.println("<h6 class='text-danger'>La informacion no es correcta, Por favor verificar.</h6>");
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
                    out.println("$('#cerrar').click(function(){location.href='login.jsp'})");
                    out.println("</script>");

                    out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q' crossorigin='anonymous'></script>");
                    out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl' crossorigin='anonymous'></script>");

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
