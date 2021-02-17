<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="es">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
                integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
              integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

        <link rel="stylesheet" href="css/estilo.css">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>Inicio ComeHome</title>
    </head>

    <body style="overflow: hidden; width: 100%; ">
        <div class="d-flex">
            <div id="sidebar-container" class="bg-primary">
                <div class="logo">
                    <h3 class="text-light font-weight-bold">ComeToHome</h3>
                </div>
                <div class="menu">
                    <a href="grid.jsp"class="d-block text-light p-3"><i class="icon ion-md-apps lead"></i> Inicio</a>
                    <a href="Sedes.jsp"class="d-block text-light p-3" style="background-color: white;color: orange !important;border-right: 4px solid orange"><i class="icon ion-md-home"></i>Sedes</a>
                    <a href="servletPerfil"class="d-block text-light p-3"><i class="icon ion-md-person"></i>Usuarios</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-calendar lead"></i> Eventos</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-clipboard lead"></i> Evidencias</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-people lead"></i> Profesores</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-search lead"></i> Matriculas</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-settings lead"></i> Configuracion</a>
                </div>
            </div>
            <div class="w-100">

                <nav class="navbar navbar-expand-lg navbar-light bg-light shadownav" >
                    <a class="navbar-brand"><Strong>Registro de Sedes</Strong></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavDropdown">
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle font-weight-bold" href="#" id="navbarDropdownMenuLink"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src="images/rostro-de-un-criminal.jpg" class="img-fluid rounded-circle mr-1" alt="" style="max-width: 35px">
                                    Roberto Quiroza
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Editar Perfil</a>
                                    <a class="dropdown-item" href="#">Ayuda</a>
                                    <a class="dropdown-item" href="#">Cerrar Sesion</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>


                <div id="content-sedes">
                    <section>
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-4 col-xl-4 col-md-4 border shadow-sm" style="margin-top: 5%; padding: 10px;">

                                    <div class="form-group">
                                        <form action="servletSede" method="POST">
                                            <label for="name"> Nombre de la Sede</label>
                                            <input type="text" class="form-control" id="nombre" name="nombre" 
                                                   placeholder="Nombre completo">
                                            <br>
                                            <label for="direccion"> Direcci&oacute;n</label>
                                            <textarea type="text" class="form-control" id="direccion" name="direccion"
                                                   placeholder="Direccion" rows="3"></textarea>
                                            <br>
                                            <label for="Telefono"> Telefono</label>
                                            <input type="number" min="1" class="form-control" id="telefono" name="telefono" 
                                                   placeholder="Telefono">
                                            <br>
                                            <div class="text-center"> 
                                                <input type="submit" class="btn btn-warning" name="ingresar" id="ingresar"  style="width: 100px;" value="Ingresar">
                                            </div>

                                        </form>
                                    </div>
                                </div>

                                <%
                                    Connection con;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/cometohome", "root", "");
                                    PreparedStatement listarSedes;
                                    ResultSet resultadoSedes;
                                    listarSedes = con.prepareStatement("SELECT * FROM `tbl_sedes`");
                                    resultadoSedes = listarSedes.executeQuery();
                                %>


                                <div class="col-lg-8 col-xl-8 col-md-8 border shadow-sm" style="margin-top: 5%; padding: 10px;">
                                    <div class="table-responsive text-center">
                                        <table class="table table-hover table-bordered">

                                            <tr>
                                                <th>Codigo</th>
                                                <th>Nombre</th>
                                                <th>Direccion</th>
                                                <th>Telefono</th>
                                                <th>Acc&iacute;ón</th>
                                            </tr>
                                            <%
                                                while (resultadoSedes.next()) {
                                            %>
                                            <tr>
                                                <td><%= resultadoSedes.getInt("id_sede")%></td>
                                                <td><%= resultadoSedes.getString("Nombre")%></td>
                                                <td><%= resultadoSedes.getString("Direccion")%></td>
                                                <td><%= resultadoSedes.getString("Telefono")%></td>
                                                <td>
                                                    <a href="servletSede?accion=editar&id_sede=<%= resultadoSedes.getInt("id_sede")%>" class="btn btn-outline-warning btn-sm"><i class="icon ion-md-checkbox-outline" style="color: black;"></i></a>
                                                    <a href="#"class="btn btn-outline-danger btn-sm"><i <i class="icon ion-ios-trash" style="color: black;"></i></a>
                                                </td>
                                            </tr>
                                            <% }%>
                                        </table> 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>

            </div>
        </div>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>

</html>