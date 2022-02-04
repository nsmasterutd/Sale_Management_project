<%@page import="lovely.Account"%>
<%@page import="lovely.Sales"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  9.	In deptid.jsp we have two textboxes , one for deptid and other for deptname and submit button.-->
<% 
Object xyz=(Object)request.getAttribute("key");
		String type1="";
		List l1=null;
		if(xyz!=null){
			if(xyz instanceof Sales){  //to know whether it is a sales or account
				Sales s1=(Sales) xyz;// convert xyz to sales
			type1=s1.getType();
				l1= s1.getL();
		}
			else
			{
				Account s1=(Account) xyz;// convert xyz to Account
				type1=s1.getType();
					l1= s1.getL();
			}
				}
		
		
%>
 <form action="fca" method="post">
<input type='number' placeholder="enter dept id" name="deptid" />
<input type='text' name="deptname" value="<%=type1 %>"/>
 <input type="hidden" name="why" value="checkDeptName"/>
 <input type='submit'  />
 </br><span>
 <%
 if(l1!=null){
	 for(Object empno:l1){ //to print line by line array list
 %><br/>
 <%=  empno %>
 <%} }%>
 </span>
</form>
</body>
</html>