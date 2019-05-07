<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.*,BookModel.Bookmodel"%>
<html>

<body>
	<%
		List<Bookmodel> students = (List<Bookmodel>) request.getAttribute("students");
	%>
	<h1>Here is a list</h1>
	<table border="1">
		<thead>
			<th>FirstName</th>
			<th>Age</th>
			<th colspan="2">Action</th>
		</thead>
		<%
			for (Bookmodel temp : students) {
		%>
		<tr>
			<td><%=temp.getBookname() %></td>
			<td><%=temp.getAuthor() %></td>
			<td><a href="http://localhost:8080/Demo/editStudent?id=<%=temp.getId() %>"><button>Edit</button></a></td>
			<td><a href="http://localhost:8080/Demo/deleteStudent?id=<%=temp.getId() %>"><button>Delete</button></a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>