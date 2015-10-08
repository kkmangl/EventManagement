<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
   $("#join").click(function(){
       $(this).hide();
       
    });
});
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="./Style/simple-sidebar.css">
<style type="text/css">
.navbar {
	-webkit-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);
	-moz-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);
	box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.4);
	border: none;
}

img {
	width: 200px;
	height: 200px;
	margin-top: 30px;
}

body {
	background: url('Images/wood_back.jpg') no-repeat fixed;
}
</style>
</head>

<body>
	<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
				</button>
				<a class="navbar-brand" href="./home.jsp">Event Management</a>
			</div>

			<div class="collpase navbar-collapse" id="menue">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="./AddEvent.html">Add Event</a></li>
					<li><a href="./dash.html">Dashboard</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.html"><span
							class="glyphicon glyphicon-log-in"></span> Sign Out</a></li>
				</ul>
			</div>
		</div>
	</nav>

<c:forEach var="item" items="${Event}">
<form action="***------&&&" method="post" id="${item.eventId }">
	<div style="margin-top: 70px">
		<div class="container">
			<div class="jumbotron col-sm-12">
				<div class="col-lg-3">


					<img src="./Images/events.jpg" alt="Event Image">
				</div>
				<div class="col-lg-9">
					<div>
						<h2>
							<a href="#" style="text-decoration: none;">${item.name }</a>
						</h2>
					</div>
					<div>
						<h5>${item.date }</h5>
					</div>
					<div>
						<a href="#" style="text-decoration: none;">${item.venue }</a>
					</div>
					<div>
						<h4>${item.description }</h4>
					</div>
					<button class="btn btn-success col-lg-offset-11 btn-lg"><span class="glyphicon glyphicon-plus"></span> Join </button>
				</div>
			</div>
		</div>
	</div>
	</form>
	</c:forEach>	
		
		
	<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="./bootstrap/js/bootstrap.min.js"></script>
</body>
</html>