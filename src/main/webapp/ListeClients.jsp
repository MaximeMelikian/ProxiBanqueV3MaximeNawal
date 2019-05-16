<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Clients</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<img src="logoProxiBanque.png">
	<h1>Affichage de la liste des clients</h1>
	<table>
		<tr>
			<td>ID</td>
			<td>Prénom</td>
			<td>Nom</td>
			<td>Email</td>
			<td>Adresse</td>
			<td>Code Postal</td>
			<td>Ville</td>
			<td>Telephone</td>
			<td>Compte Courant</td>
			<td>Compte Epargne</td>
		</tr>
		<c:forEach items="${Clients}" var="cl">
			<tr>
				<td>${cl.idClient}</td>
				<td>${cl.prenom}</td>
				<td>${cl.nom}</td>
				<td>${cl.email}</td>
				<td>${cl.adresse}</td>
				<td>${cl.codePostal}</td>
				<td>${cl.ville}</td>
				<td>${cl.tel}</td>
				<td></td>
				<td></td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<!-- 	<form action="ServletNouveauClient" method="post">	</form> -->
	<input type="button" value="Nouveau Client"
		onclick="self.location.href='CreerClient.html'">
	<p />
	
	<form action="ServletAfficherClient" method="post">
		Id Client <input type="text" name="idClient"> <input
			type="submit" value="Afficher Client">
	</form>
	<br>
	<form action="ServletEditerClient">
		Id Client <input type="text" name="idClient"> <input
			type="submit" value="Editer Client">
	</form>
	<br>
	<form action="ServletSupprimerClient">
		Id Client <input type="text" name="idClient"> <input
			type="submit" value="Supprimer Client">

	</form>
</body>
</html>