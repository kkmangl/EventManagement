<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Event</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="./Style/simple-sidebar.css">

</head>
<body>

	<header>
		<div
			class="navbar navbar-default navbar-fixed-top navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<a href="/EventManagement/redirect" class="navbar-brand">Event Management</a>
				</div>
				<div class="collpase navbar-collapse" id="example">
					<ul class="nav navbar-nav">
						<li><a href="/EventManagement/redirect">Home</a></li>
						<li class="active"><a href="#">Add Event</a></li>
						<li><a href="/EventManagement/dashBoard">Dashboard</a></li>
					</ul>

					<form action="index.html" class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="search Person">
						</div>
						<button type="submit" class="btn btn-primary">Search</button>
						<button type="submit" class="btn btn-success" name="logout">Logout</button>
					</form>
				</div>

			</div>
		</div>
	</header>
	<script src="./bootstrap/js/bootstrap.min.js"></script>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<div >
		<div class="container col-md-4 col-lg-4 col-xs-offset-4 well" style="margin-top: 2%">
			<form:form  class="form-signin" action="addingEvent" method="post" commandName="addevent">
				<h2 class="form-signin-heading">New Event</h2>
				 
				 <div class="form-group">
					<h4 class="form-signin-heading">Event Name</h4>
				 	<form:input path="name" class="form-control" placeholder="Enter Event Name " name="name" /> 
				 </div>
				 
				 <div class="form-group">
				 	<h4 class="form-signin-heading">Event Date</h4>
				 	<form:input  path="eventdate" class="form-control" placeholder="Enter Event Date(DD-MON-YY) " name="eventdate" /> 
				 </div>
				
				<div class="form-group">
					<h4 class="form-signin-heading">Venue</h4>
				 	<form:input  path="venue" class="form-control" placeholder="Enter the Place you want the event " name="venue" /> 
				 </div>
				 
				 <div class="form-group">
				 <h4 class="form-signin-heading">Description</h4>
		
				 	 <form:textarea path="description" class="form-control"placeholder="Give Some Details" style="height: 100px;" />
				 </div>
				 
				 <div class="form-group">
				<button class="btn btn-lg btn-success btn-block" type="submit">Create Event</button>
				</div>
			</form:form>

		</div>
	</div>
</body>
</html>