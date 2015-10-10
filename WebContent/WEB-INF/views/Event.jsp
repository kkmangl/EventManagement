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
	background: url("./bootstrap/Images/wood_back.jpg");
}
</style>
</head>
<body>
<header>
		<div
			class="navbar navbar-default navbar-fixed-top navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<a href="index.html" class="navbar-brand">${logsesh}</a>
				</div>
				<div class="collpase navbar-collapse" id="example">
					<ul class="nav navbar-nav">
						<li><a href="/EventManagement/redirect">Home</a></li>
						<li class="active"><a href="/EventManagement/addEvent">Add Event</a></li>
						<li><a href="/EventManagement/dashBoard">Dashboard</a></li>
					</ul>

					<form action="/EventManagement/invalidate" class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="search Person">
						</div>
						<button type="submit" class="btn btn-primary">Search</button>
						<button type="submit" class="btn btn-success" name="logout" >Logout</button>
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
	<p>
	Event Added SuccessFully.............
	</p>
</body>
</html>