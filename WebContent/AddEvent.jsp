<!DOCTYPE html>
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
					<a href="index.html" class="navbar-brand">Event Management</a>
				</div>
				<div class="collpase navbar-collapse" id="example">
					<ul class="nav navbar-nav">
						<li><a href="upcoming">Home</a></li>
						<li class="active"><a href="#">Add Event</a></li>
						<li><a href="dashboard.htm">Dashboard</a></li>
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
			<form class="form-signin" action="AddEvent.htm" method="post">
				<h2 class="form-signin-heading">New Event</h2>
				 
				 <div class="form-group">
					<h4 class="form-signin-heading">Event Name</h4>
				 	<input type="text" name="name" class="form-control" placeholder="Enter Event Name " name="name" required autofocus> 
				 </div>
				 
				 <div class="form-group">
				 	<h4 class="form-signin-heading">Event Date</h4>
				 	<input type="text" name="eventdate" class="form-control" placeholder="Enter Event Date(DD-MON-YY) " name="eventdate" autofocus> 
				 </div>
				
				<div class="form-group">
					<h4 class="form-signin-heading">Venue</h4>
				 	<input type="text" name="venue" class="form-control" placeholder="Enter the Place you want the event " name="venue" required autofocus> 
				 </div>
				 
				 <div class="form-group">
				 <h4 class="form-signin-heading">Description</h4>
		
				 	 <textarea name="description" class="form-control"placeholder="Give Some Details" style="height: 100px;" required></textarea>
				 </div>
				 
				 <div class="form-group">
				<button class="btn btn-lg btn-success btn-block" type="submit">Create Event</button>
				</div>
			</form>

		</div>
	</div>
</body>
</html>