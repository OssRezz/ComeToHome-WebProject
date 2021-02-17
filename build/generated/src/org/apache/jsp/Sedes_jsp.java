package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Sedes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n");
      out.write("                integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"\r\n");
      out.write("                integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("        <link href=\"https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Inicio ComeHome</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"overflow: hidden; width: 100%; \">\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div id=\"sidebar-container\" class=\"bg-primary\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <h3 class=\"text-light font-weight-bold\">ComeHome</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"menu\">\r\n");
      out.write("                    <a href=\"grid.jsp\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-apps lead\"></i> Inicio</a>\r\n");
      out.write("                    <a href=\"Sedes.jsp\"class=\"d-block text-light p-3\" style=\"background-color: white;color: orange !important;border-right: 4px solid orange\"><i class=\"icon ion-md-home\"></i>Sedes</a>\r\n");
      out.write("                    <a href=\"RegistroUsuarios.jsp\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-person\"></i>Usuarios</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-calendar lead\"></i> Eventos</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-clipboard lead\"></i> Evidencias</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-people lead\"></i> Profesores</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-search lead\"></i> Matriculas</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-settings lead\"></i> Configuracion</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"w-100\">\r\n");
      out.write("\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light shadownav\" >\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\"\r\n");
      out.write("                            aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle font-weight-bold\" href=\"#\" id=\"navbarDropdownMenuLink\"\r\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <img src=\"images/rostro-de-un-criminal.jpg\" class=\"img-fluid rounded-circle mr-1\" alt=\"\" style=\"max-width: 35px\">\r\n");
      out.write("                                    Roberto Quiroza\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Editar Perfil</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Ayuda</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Cerrar Sesion</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"content-sedes\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-6 col-xl-6 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <form action=\"servletSede\" method=\"POST\">\r\n");
      out.write("                                            <label for=\"name\"> Nombre de la Sede</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\"\r\n");
      out.write("                                                   placeholder=\"Escribe el Nombre de la Sede aqui\">\r\n");
      out.write("                                            <label for=\"direccion\"> Direcci&oacute;n</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"direccion\" name=\"direccion\"\r\n");
      out.write("                                                   placeholder=\"Escribe la Direccion de la sede aqui\">\r\n");
      out.write("                                            <label for=\"Telefono\"> Telefono</label>\r\n");
      out.write("                                            <input type=\"number\" min=\"1\" class=\"form-control\" id=\"telefono\" name=\"telefono\"\r\n");
      out.write("                                                   placeholder=\"Escribe el Telefono de la Sede aqui\">\r\n");
      out.write("                                            <input class=\"btn btn-warning\" type=\"submit\" style=\"margin-top: 20px;\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                ");

                                    Connection con;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/cometohome", "root", "");
                                    PreparedStatement listarSedes;
                                    ResultSet resultadoSedes;
                                    listarSedes = con.prepareStatement("SELECT * FROM `tbl_sedes`");
                                    resultadoSedes = listarSedes.executeQuery();
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-6 col-xl-6 col-md-10 tablesedes\">\r\n");
      out.write("                                    <table class=\"table table-hover\">\r\n");
      out.write("\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Codigo</th>\r\n");
      out.write("                                            <th>Nombre</th>\r\n");
      out.write("                                            <th>Direccion</th>\r\n");
      out.write("                                            <th>Telefono</th>\r\n");
      out.write("                                            <th>Accion</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        ");

                                            while (resultadoSedes.next()) {
                                        
      out.write("\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>");
      out.print( resultadoSedes.getInt("id_sede"));
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( resultadoSedes.getString("Nombre"));
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( resultadoSedes.getString("Direccion"));
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( resultadoSedes.getString("Telefono"));
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        ");
 }
      out.write("\r\n");
      out.write("                                    </table> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
