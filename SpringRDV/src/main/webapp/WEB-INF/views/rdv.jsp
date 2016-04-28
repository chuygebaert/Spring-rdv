<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

</head>
<body>
	<nav role="navigation" class="navbar navbar-default"> <!-- Brand and toggle get grouped for better mobile display -->

	<div class="navbar-header">

		<button type="button" data-target="#navbarCollapse"
			data-toggle="collapse" class="navbar-toggle">

			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>

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
	<h3 class="badge">Prise de rdv</h3>
	<f:form modelAttribute="rdv" action="saveRdv" method="post">
		<table>

			<tr>
				<td>Nom <f:input path="client.nomC" /></td>
				<td><f:errors path="client.nomC"></f:errors></td>
			</tr>
			<tr>
				<td>Prenom <f:input path="client.prenomC" /></td>
				<td><f:errors path="client.prenomC"></f:errors></td>
			</tr>
			<tr>
				<td>Praticien <f:input path="praticien.idP" /></td>
				<td><f:errors path="praticien.idP"></f:errors></td>
			</tr>
			<tr>
				<td>Date <f:input path="jour" /></td>
				<td><f:errors path="jour"></f:errors></td>
				<td><input type="submit" name="save"></td>
			</tr>
		</table>
	</f:form>
	<div class="bs-example">
		<ul class="nav nav-pills">
			<li class="badge">Agenda</li>
		</ul>
	</div>
	<div class="container spacer">
		<table class="table">
			<thead>
				<tr>
					<th>numero/rdv</th>
					<th>date</th>
					<th>ref/client</th>
					<th>client Mr/Me</th>
					<th>prenomC</th>
					<th>refP</th>
					<th>praticien</th>
					<th>prenomP</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rdvs}" var="r">
					<tr>
						<td>${r.idR}</td>
						<td>${r.jour}</td>
						<td>${r.client.idC}</td>
						<td>${r.client.nomC}</td>
						<td>${r.client.prenomC}</td>
						<td>${r.praticien.idP}</td>
						<td>${r.praticien.nomP}</td>
						<td>${r.praticien.prenomP}</td>
						<td><a href="deleteRdv?idR=${r.idR}">delete</a></td>
						<td><a href="editRdv?idR=${r.idR}">edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/resources/js/bootstrap.min.js"></script>

	<ul class="nav pull-right scroll-top">
		<li><a href="#" title="Scroll to top"><i
				class="glyphicon glyphicon-chevron-up"></i></a></li>
	</ul>
	<div class="footer-bottom">
		<div class="container">
			<div class="row">
				<p class="pull-left">Copyright © 2016 CHRIS/H Inc. All rights
					reserved.</p>

			</div>
		</div>
	</div>
</body>
</html>