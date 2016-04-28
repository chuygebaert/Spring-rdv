<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

</head>
<body>
	<nav role="navigation" class="navbar navbar-default">

		<!-- Brand and toggle get grouped for better mobile display -->

		<div class="navbar-header">

			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">

				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>

			</button>

			<a href="#" class="navbar-brand">Brand</a>

		</div>

		<!-- Collection of nav links, forms, and other content for toggling -->

		<div id="navbarCollapse" class="collapse navbar-collapse">

			<ul class="nav navbar-nav">

				<li class="active"><a href="#">Home</a></li>

				<li><a href="#">Profile</a></li>

				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#">Messages <b class="caret"></b></a>

					<ul role="menu" class="dropdown-menu">

						<li><a href="#">Inbox</a></li>

						<li><a href="#">Drafts</a></li>

						<li><a href="#">Sent Items</a></li>

						<li class="divider"></li>

						<li><a href="#">Trash</a></li>

					</ul></li>

			</ul>
		</div>
	</nav>
	<h1>
		<em> RDV </em>
	</h1>

	<P class="text-warning">
		<ins> The time on the server is ${serverTime}.</ins>
	</P>
	
</body>
</html>
