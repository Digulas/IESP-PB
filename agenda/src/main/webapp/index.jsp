<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Projeto Agenda</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--TAGS CSS-->
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/util.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/main.css">
<!--===============================================================================================-->


</head>
<body>

	<!-- ALERTS ERROS -->
	<div class="alert alert-success " role="alert" align="center">
		<h4 class="alert-heading">${mensagem}</h4>
	</div>

	<div class="alert alert-success " role="alert" align="center">
		<h4 class="alert-heading">${erro}</h4>
	</div>
	<!-- ALERTS ERROS -->
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
				<form class="login100-form validate-form" action="loginController"
					method="POST">
					<span class="login100-form-title p-b-55"> Agenda </span>
					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Digite o seu login">
						<input class="input100" type="email" name="email" id="email"
							placeholder="login"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <span class="lnr lnr-user"></span>
						</span>
					</div>


					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Digite sua senha">
						<input class="input100" type="password" name="senha" id="senha"
							placeholder="Password"> <span class="focus-input100"></span>
						<span class="symbol-input100"> <span class="lnr lnr-lock"></span>
						</span>
					</div>

					<div class="container-login100-form-btn p-t-25">
						<button class="login100-form-btn">Entrar</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- TAGS JS -->
	<!--===============================================================================================-->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>