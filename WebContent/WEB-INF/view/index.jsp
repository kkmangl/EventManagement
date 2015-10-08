<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css"
	media="screen">
<!-- Optional theme -->

<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.min.css">


</head>
<body class="jambotrom">
	<header>
		<div class="navbar navbar-default navbar-fixed-top navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<a href="index.html" class="navbar-brand">Event Management</a>
				</div>
				<div class="collpase navbar-collapse" id="example">
					<form action="SignUp.html" class="navbar-form navbar-right"
						role="signup">
						<button type="submit" class="btn btn-success btn-lg">Sign
							Up</button>
					</form>
				</div>

			</div>
		</div>
		<div class="jumbotron">
			<div class="container"></div>
		</div>
	</header>
	<div>
		<div class="container col-md-4 col-lg-4 col-xs-offset-4 well"
			style="margin-top: 8%">
			<form class="form-signin" action="login" method="post">
				<h2 class="form-signin-heading">Sign In</h2>
				<div class="form-group">
					<h4 class="form-signin-heading form-inline">User Name</h4>
					<input type="text" name="uname"  class="form-control"
						placeholder="User Name " required autofocus>
				</div>
				<div class="form-group">
					<h4 class="form-signin-heading">Password</h4>
					<input type="password" name="pass" class="form-control"
						placeholder="Password" required>
				</div>
				<div class="form-group">
					<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
						In</button>
				</div>
				<div class="form-group" style="text-align: center;"><a href="" >Forget password</a></div>
			</form>

		</div>
	</div>
	<footer></footer>

	<!-- Latest compiled and minified JavaScript -->
	<script src="./bootstrap/js/bootstrap.min.js"></script>
</body>
</html>