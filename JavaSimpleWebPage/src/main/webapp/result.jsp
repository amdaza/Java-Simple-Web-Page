<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available options</title>
</head>
<body>
	<h1>
	    Available Brands
	</h1>
	<%
	List result= (List) request.getAttribute("brands");
	Iterator it = result.iterator();
	out.println("<br>We have <br><br>");
	while(it.hasNext()){
	out.println(it.next()+"<br>");
	}
	%>
</body>
</html>