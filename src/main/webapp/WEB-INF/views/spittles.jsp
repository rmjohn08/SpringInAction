<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spittles</title>
</head>

	<c:forEach items="${spittleList}" var="spittle">
		<c:when test="${not empty spittleList}">
		<li id="spittle_<c:out value="spittle.id" />
		<div class="spittleM 	essage">
			<c:out value="${spittle.message}" />
			</div>
			<div>
			<span class="spittleTime"><c:out value="${spittle.time}" /></span>
			<span class="spittleLocation">
			(<c:out value="${spittle.latitude}" />,
			<c:out value="${spittle.longitude}" />)</span>
		</div>
		</li>
		</c:when>
	</c:forEach>

<body>

</body>
</html>