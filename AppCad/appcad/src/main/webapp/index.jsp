<!DOCTYPE html>
<html lang="pt-br">

<head>

    <meta charset="UTF-8">

    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Login</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/styler.css" media="screen" />
    <script src="https://kit.fontawesome.com/3edf037119.js" crossorigin="anonymous"></script>
    <script src='main.js'></script>
</head>

<body>
    <!-- Conteiner Principal Login -->
    <div class="container">
          
            <div class="row login-form justify-content-center align-items-center">

                <div  id="teste" class="cicle"><i class="icon fas fa-user-friends " ></i></div>
                <div class="col-8">
                <form class="text-black" action="" method="post">

                                <div class="row  mt-3 ">
                                    <div class="col-12  form-group">
                                        <label for="email">Email:</label>
                                        <input type="email" class="form-control" name="email" id="email">
                                    </div>
                                </div>
                                <div class="row ">
                                    <div class="col-12 form-group ">
                                        <label for="pwd">Password</label>
                                        <input type="password" class="form-control" name="pwd" id="pwd">
                                    </div>
                                </div>
                                <div class="row text-center mt-2">
                                    <div class="col-12 form-group ">
                                        <button id="buttonSign" class="btn btn-primary">Sign in</button>
                                    </div>
                                </div>
                                <div class="row text-center">
                                    <div class="col-12 ">
                                       <a id="forgot" href="http://" >Forgot password?</a>
                                    </div>
                                </div>
                </form>
            </div>
            </div>
            
         
    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>

</html>