<!DOCTYPE html>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css" media="screen">


</head>
<body class="jambotrom">
	<header>
		<div class="navbar navbar-default navbar-fixed-top navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<a href="/EventManagement/home" class="navbar-brand">${logsesh}</a>
				</div>
			</div>
		</div>
		<div class="jumbotron">
			<div class="container"></div>
		</div>
	</header>
	<div >
		<div class="container col-md-4 col-lg-4 col-xs-offset-4 well" style="margin-top: 2%">
			<form:form class="form-signin" action="addingUser" method="post" commandName="adduser">
				<h2 class="form-signin-heading">Sign Up</h2>
				 
				 <div class="form-group">
					<h4 class="form-signin-heading">Name</h4>
				 	<form:input  path="name" class="form-control" placeholder="Enter User Name "  /> 
				 </div>
				 
				 <div class="form-group">
				 	<h4 class="form-signin-heading">E-mail</h4>
				 	<form:input  path="email" class="form-control" placeholder="Enter User E-mail "/> 
				 </div>
				
				<div class="form-group">
					<h4 class="form-signin-heading">User Name</h4>
				 	<form:input  path="userName" class="form-control" placeholder="Enter User Name " /> 
				 </div>
				 
				 <div class="form-group">
				 <h4 class="form-signin-heading">Password</h4>
				 	 <form:password  path="password" class="form-control"placeholder="Enter Password"/>
				 </div>
				 
				 <div class="form-group">
				<button class="btn btn-lg btn-success btn-block" type="submit">Create an Account</button>
				</div>
			</form:form>

		</div>
	</div>

	<footer></footer>
	<!-- Optional theme -->
<!-- Latest compiled and minified JavaScript -->
<script src="./bootstrap/js/bootstrap.min.js"></script>
</body>
</html>