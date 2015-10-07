<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="./bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="./Style/simple-sidebar.css">

</head>
<body>
	<header>
		<div class="navbar navbar-default navbar-fixed-top navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<a href="" class="navbar-brand">Event Management</a>
				</div>
				<div class="collpase navbar-collapse" id="example">
					<ul class="nav navbar-nav">
						<li ><a href="upcoming">Home</a></li>
						<li><a href="AddEvent.jsp">Add Event</a></li>
						<li class="active"><a href="dashboard.htm">Dashboard</a></li>
					</ul>
					<div>
						<form action="" class="navbar-form navbar-right" role="search">
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="search Person">
							</div>
							<button type="submit" class="btn btn-primary" name="Search">Search</button>
						</form>
						<form action="index.html" class="navbar-form navbar-right"
							method="post">
							<a href="index.html"><button type="submit"
									class="btn btn-success" name="logout">Logout</button></a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</header>
	<div style="margin-top: 65px" class="col-lg-3 ">
		<h2 class="bg-info" style="padding: 7px; border-radius: 10px;">Upcoming
			Events</h2>
	</div>
<jsp:useBean id="userbean" class="com.sapient.model.Dashboard" scope="request"></jsp:useBean>
	<form action="" method="post">
	<div class="jumbotron col-lg-8 col-lg-offset-2 form-group"
		style="border-radius: 15px; padding: 2px">
		<div class="col-xs-4">
			<h2 style="text-align: center;">Events</h2>
		</div>
		<div class="col-xs-4">
			<h2 style="text-align: center;">Date</h2>
		</div>
		<div class="col-xs-4">
			<h2 style="text-align: center;">Venue</h2>
		</div>
	</div>
	
	<c:forEach var="item" items="${requestScope.userbean.eventlist}">
	<div class="jumbotron col-lg-8 col-lg-offset-2 form-group"
		style="border-radius: 15px; padding: 3px">
		<div class="col-xs-4">
		
				<h5 style="text-align: center;">${item.name} </h5>
				
			
	</div>	
	<div class="col-xs-4">
		
				<h5 style="text-align: center;">${item.date} </h5>
				
			
	</div>
	<div class="col-xs-4">
		
				<h5 style="text-align: center;">${item.venue} </h5>
				
			
	</div>	
	</div>
	</c:forEach>
	
	
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</form>
		
	
	
	
	<script src="./bootstrap/js/bootstrap.min.js"></script>
</body>
</html>