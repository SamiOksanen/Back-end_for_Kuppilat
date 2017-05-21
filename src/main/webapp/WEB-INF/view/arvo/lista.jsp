<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Arvostelu lista</title>
</head>	
<body>
	<table>
	<caption>Arvostelut</caption>
	<thead>
		<tr>
			<td>ID</td>
			<td>Paikka</td>
			<td>Päivä</td>
			<td>Arvosana</td>
			<td>Kuvaus</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${arvostelut}" var="arvo">
		<tr>
			<td><c:out value="${arvo.id}"/></td>
			<td><c:out value="${arvo.paikka}"/></td>
			<td><c:out value="${arvo.paiva}"/></td>
			<td><c:out value="${arvo.arvosana}"/></td>
			<td><c:out value="${arvo.kuvaus}"/></td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	<p><a href="../">Etusivulle</a></p>
</body>
</html>