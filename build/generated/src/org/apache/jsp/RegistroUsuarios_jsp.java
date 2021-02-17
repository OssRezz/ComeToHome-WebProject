package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.List;
import DTO.dtoPerfil;

public final class RegistroUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("%<@page import=\"java.sql.ResultSet\"%>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("        <link href=\"https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Inicio ComeToHome</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"overflow: hidden; width: 100%; \">\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div id=\"sidebar-container\" class=\"bg-primary\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <h3 class=\"text-light font-weight-bold\">ComeToHome</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"menu\">\r\n");
      out.write("                    <a href=\"grid.jsp\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-apps lead\"></i> Inicio</a>\r\n");
      out.write("                    <a href=\"Sedes.jsp\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-home\"></i>Sedes</a>\r\n");
      out.write("                    <a href=\"servletPerfil\" class=\"d-block text-light p-3\" style=\"background-color: white;color: orange !important;border-right: 4px solid orange\" ><i class=\"icon ion-md-person\"></i>Usuarios</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-calendar lead\"></i> Eventos</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-clipboard lead\"></i> Evidencias</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-people lead\"></i> Profesores</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-search lead\"></i> Matriculas</a>\r\n");
      out.write("                    <a href=\"#\"class=\"d-block text-light p-3\"><i class=\"icon ion-md-settings lead\"></i> Configuracion</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"w-100\">\r\n");
      out.write("\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light shadownav\">\r\n");
      out.write("                    <a class=\"navbar-brand\"><Strong>Registro de Usuarios</Strong></a>\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle font-weight-bold\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
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
      out.write("                <div id=\"contentgrid\" class=\"container-fluid\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-4 col-xl-4 col-md-4 border shadow-sm\" style=\"margin-top: 5%; padding: 10px;\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <form >\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"nombre\">Usuario</label><br>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Usuario\" required>\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"usuario\">C&eacute;dula</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" name=\"id\" id=\"id\" placeholder=\"Cédula\">\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"ContraseÃ±a\">Contrase&ntilde;a</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"password\" id=\"password\" placeholder=\"Contrase&ntilde;a\">\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"Repetir-contraseÃ±a\">Repetir Contrase&ntilde;a</label><br>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"password\" name=\"password2\" id=\"password2\" placeholder=\"Repita su Contrase&ntilde;a\">\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"email\">Correo Electr&oacute;nico</label>\r\n");
      out.write("                                            <input class=\"form-control\" type=\"email\" name=\"email\" id=\"email\" placeholder=\"Correo Electronico\">\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"perfil\" >Perfil</label>\r\n");
      out.write("                                            <select id=\"perfil\" class=\"form-control\" name=\"perfil\">\r\n");
      out.write("\r\n");
      out.write("                                                ");
  List<dtoPerfil> listPerfil = (List<dtoPerfil>) request.getAttribute("perfil");
                                                    if (listPerfil != null)
                                                        for (dtoPerfil perfil : listPerfil) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print( perfil.getId_Perfil());
      out.write('"');
      out.write('>');
      out.print( perfil.getTipoPerfil());
      out.write("</option>\t\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                            <br>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"text-center\"> \r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-warning\" name=\"ingresar\" id=\"ingresar\"  style=\"width: 100px;\" value=\"Ingresar\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                ");

                                    //Conexion bd
                                    Connection con;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");

                                    //Declaraciï¿½n preparada
                                    PreparedStatement listarUsuarios;
                                    ResultSet resultadoUsuarios;

                                    listarUsuarios = con.prepareStatement("SELECT * FROM `tbl_usuario`");

                                    resultadoUsuarios = listarUsuarios.executeQuery();

                                
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-8 col-xl-8 col-md-8 border shadow-sm\" style=\"margin-top: 5%; padding: 10px;\">\r\n");
      out.write("                                    <div class=\"table-responsive text-center\">\r\n");
      out.write("                                        <table class=\"table table-hover table-bordered\">\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>ID</th>\r\n");
      out.write("                                                <th>Usuario</th>\r\n");
      out.write("                                                <th>Perfil</th>\t\t\r\n");
      out.write("                                                <th>Correo</th>\t\r\n");
      out.write("                                                <th>Acc&iacute;ón</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            ");
                                                while (resultadoUsuarios.next()) {
                                            
      out.write("                                \r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>");
      out.print( resultadoUsuarios.getString("DNI_usuario"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( resultadoUsuarios.getString("nombre_usuario"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( resultadoUsuarios.getInt("tbl_perfiles_id_perfil"));
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( resultadoUsuarios.getString("password"));
      out.write("</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-outline-warning btn-sm\"><i class=\"icon ion-md-checkbox-outline\" style=\"color: black;\"></i></a>\r\n");
      out.write("                                                    <a href=\"#\"class=\"btn btn-outline-danger btn-sm\"><i <i class=\"icon ion-ios-trash\" style=\"color: black;\"></i></a>\r\n");
      out.write("                                                </td>\r\n");
      out.write("\r\n");
      out.write("                                            </tr>\t\r\n");
      out.write("                                            ");
 }
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js\" integrity=\"sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js\" integrity=\"sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
