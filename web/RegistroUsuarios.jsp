<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="DTO.dtoPerfil"%>
<!doctype html>
<html lang="es">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

        <link rel="stylesheet" href="css/estilo.css">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>Inicio ComeToHome</title>
    </head>
    <body style="overflow: hidden; width: 100%; ">
        <div class="d-flex">
            <div id="sidebar-container" class="bg-primary">
                <div class="logo">
                    <h3 class="text-light font-weight-bold">ComeToHome</h3>
                </div>
                <div class="menu">
                    <a href="grid.jsp"class="d-block text-light p-3"><i class="icon ion-md-apps lead"></i> Inicio</a>
                    <a href="Sedes.jsp"class="d-block text-light p-3"><i class="icon ion-md-home"></i>Sedes</a>
                    <a href="servletPerfil" class="d-block text-light p-3" style="background-color: white;color: orange !important;border-right: 4px solid orange" ><i class="icon ion-md-person"></i>Usuarios</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-calendar lead"></i> Eventos</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-clipboard lead"></i> Evidencias</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-people lead"></i> Profesores</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-search lead"></i> Matriculas</a>
                    <a href="#"class="d-block text-light p-3"><i class="icon ion-md-settings lead"></i> Configuracion</a>
                </div>
            </div>
            <div class="w-100">

                <nav class="navbar navbar-expand-lg navbar-light bg-light shadownav">
                    <a class="navbar-brand"><Strong>Registro de Usuarios</Strong></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNavDropdown">
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle font-weight-bold" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
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
                <div id="contentgrid" class="container-fluid">
                    <section>
                        <div class="container">
                            <div class="row">

                                <div class="col-lg-4 col-xl-4 col-md-4 border shadow-sm" style="margin-top: 5%; padding: 10px;">
                                    <div class="form-group">
                                        <form >

                                            <label for="nombre">Usuario</label><br>
                                            <input class="form-control" type="text" name="nombre" id="nombre" placeholder="Usuario" required>
                                            <br>

                                            <label for="usuario">C&eacute;dula</label>
                                            <input class="form-control" type="text" name="id" id="id" placeholder="Cédula">
                                            <br>

                                            <label for="ContraseÃ±a">Contrase&ntilde;a</label>
                                            <input class="form-control" type="password" name="password" id="password" placeholder="Contrase&ntilde;a">
                                            <br>

                                            <label for="Repetir-contraseÃ±a">Repetir Contrase&ntilde;a</label><br>
                                            <input class="form-control" type="password" name="password2" id="password2" placeholder="Repita su Contrase&ntilde;a">
                                            <br>

                                            <label for="email">Correo Electr&oacute;nico</label>
                                            <input class="form-control" type="email" name="email" id="email" placeholder="Correo Electronico">
                                            <br>

                                            <label for="perfil" >Perfil</label>
                                            <select id="perfil" class="form-control" name="perfil">

                                                <%  List<dtoPerfil> listPerfil = (List<dtoPerfil>) request.getAttribute("perfil");
                                                    if (listPerfil != null)
                                                        for (dtoPerfil perfil : listPerfil) {%>

                                                <option value="<%= perfil.getId_Perfil()%>"><%= perfil.getTipoPerfil()%></option>	
                                                <% } %>
                                            </select>
                                            <br>

                                            <div class="text-center"> 
                                                <input type="submit" class="btn btn-warning" name="ingresar" id="ingresar"  style="width: 100px;" value="Ingresar">
                                            </div>
                                        </form>
                                    </div>
                                </div>

                                <%
                                    //Conexion bd
                                    Connection con;
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");

                                    //Declaraciï¿½n preparada
                                    PreparedStatement listarUsuarios;
                                    ResultSet resultadoUsuarios;

                                    listarUsuarios = con.prepareStatement("SELECT * FROM `tbl_usuario`");

                                    resultadoUsuarios = listarUsuarios.executeQuery();

                                %>   




                                <div class="col-lg-8 col-xl-8 col-md-8 border shadow-sm" style="margin-top: 5%; padding: 10px;">
                                    <div class="table-responsive text-center">
                                        <table class="table table-hover table-bordered">
                                            <tr>
                                                <th>ID</th>
                                                <th>Usuario</th>
                                                <th>Perfil</th>		
                                                <th>Password</th>	
                                                <th>Acc&iacute;ón</th>
                                            </tr>
                                            <%                                                while (resultadoUsuarios.next()) {
                                            %>                                
                                            <tr>
                                                <td><%= resultadoUsuarios.getString("DNI_usuario")%></td>
                                                <td><%= resultadoUsuarios.getString("nombre_usuario")%></td>
                                                <td><%= resultadoUsuarios.getInt("tbl_perfiles_id_perfil")%></td>
                                                <td><%= resultadoUsuarios.getString("password")%></td>
                                                <td>
                                                    <a href="#" class="btn btn-outline-warning btn-sm"><i class="icon ion-md-checkbox-outline" style="color: black;"></i></a>
                                                    <a href="#"class="btn btn-outline-danger btn-sm"><i <i class="icon ion-ios-trash" style="color: black;"></i></a>
                                                </td>

                                            </tr>	
                                            <% }%>
                                        </table>
                                    </div>
                                </div>


                            </div>
                        </div>
                </div>
                </section>
            </div>

        </div>
    </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
    -->

</body>
</html>