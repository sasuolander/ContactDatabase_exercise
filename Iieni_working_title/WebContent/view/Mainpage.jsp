<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="lieni.model.Contact" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <jsp:useBean id="contactList" scope="request" type="java.util.ArrayList"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h1>List of Contact</h1>
<a id="link" href="AddContact">Add contact</a>
	<table>
	 <c:forEach begin="1" step="1" varStatus="loopCounter" items="${contactList}" var="list">
		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Title</th>
				<th>Organization</th>
				<th>Address</th>
				<th>ZIP code</th>
				<th>City</th>
				<th>Country</th>
				<th>Remove</th>
			</tr>
		</thead>
		<tr>
			<td> <c:out value = "${ list.FirstName}" />		</td>
			<td> <c:out value = "${list.LastName }" />			</td>
			<td> <c:out value = "${ list.Title}" />			</td>
			<td> <c:out value = "${list.Organization }" />		</td>
			<td> <c:out value = "${list.Address }" />			</td>
			<td> <c:out value = "${list.ZIPCode }" />			</td>
			<td> <c:out value = "${ list.City"} />			</td>
			<td> <c:out value = "${list.Country }" />			</td>
            <td><a id="link" name="remove" href="RemoveContact?contactid=<c:out value = "${list.ID}" />">Remove</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>