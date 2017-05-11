<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="lieni.model.Contact" %>
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
		
		<!-- convert this to EL -->
		<%
          Contact contact = null; 
		for(int i = 0; i < contactList.size(); i++) { 
			contact = (Contact)contactList.get(i);
     %>
     
     
		<tr>
			<td> <%=contact.getFirstName() %> </td>
			<td> <%=contact.getLastName() %> </td>
			<td> <%=contact.getTitle() %> </td>
			<td> <%=contact.getOrganization() %> </td>
			<td> <%=contact.getAddress() %> </td>
			<td> <%=contact.getZIPCode() %> </td>
			<td> <%=contact.getCity() %> </td>
			<td> <%=contact.getCountry() %> </td>
            <td><a id="link" name="remove" href="RemoveContact?contactid=<%=contact.getID()%>" >Remove</a></td>
		</tr>
	<%
               }
          %>
	</table>
</body>
</html>