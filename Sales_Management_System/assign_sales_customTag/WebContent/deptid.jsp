<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> <c:out value="${key.type}"/></h1>


 <form action="fca" method="post">
<input type='number' placeholder="enter dept id" name="deptid" />
<input type='text' name="deptname" value="<c:out value="${key.type}"/>"/>
 <input type="hidden" name="why" value="checkDeptName"/>
 <input type='submit'  />              
 </br><span>

<c:forEach var ="x" items ="${key.l}">
<Br/> <c:out value="${x}"/>
</c:forEach>
 </span>
</form>
</body>
</html>