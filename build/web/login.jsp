<%@page session="true"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="shortcut icon" href="#">
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-center-pt-5 mt-5 m-1">

                <div class="col-md-4 formulario">
                    <form action="servletLogin" method="POST">
                        <div class="form-group text-center">
                            <h1 class="text-light">Iniciar Sesi&oacute;n</h1><br>
                        </div>
                        <div class="form-group mx-sm-4">
                            <input type="text" class="form-control" name="usuario" id="usuario" placeholder="Ingrese su Usuario"><br>

                        </div>
                        <div class="form-group mx-sm-4">
                            <input class="form-control" type="password" name="password" id="password" placeholder="Ingrese su password"><br><br>

                        </div>
                        <div class="form-group text-center mx-sm-4 pb-3">
                            <input type="submit" class="btn btn-block ingresar" name="accion" value="Ingresar"><br>
                        </div>
                    </form>
                </div>
            </div>
        </div>  

    </body>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>