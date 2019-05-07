<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head></head>
<body>
	<form:form action="insertUser" method="post" modelAttribute="stu">
		<form:hidden path="id" />
		<form:input path="bookname" required="required"/>
		<form:input path="author" required="required"/>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>