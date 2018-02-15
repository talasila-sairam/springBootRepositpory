<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display-address</title>
</head>
<body>
  <h2>Address Details</h2>
  <c:if test="${not empty errorValue}">
	<h4>${errorValue}</h4>
  </c:if>
  <form action="${pageContext.request.contextPath}/display-address.htm" method="post">
    ZipCode : <input type="text" name="zipcode" />
    <input type="submit" value="find">
  </form>
  </br>
  </br>
  <c:if test="${not empty listAddress}">
  <h3>Details are</h3>
   <table border="1" style="margin-left: 30px;background: red;">
    <tr>
       <th>NAME</th>
       <th>H.NO</th>
       <th>ADDRESS</th>
       <th>MOBILE NO</th>
    </tr>
     <c:forEach items="${listAddress}" var="address">
     <tr>
       <td>${address.name}</td>
       <td>${address.hNo}</td>
       <td>${address.address}</td>
       <td>${address.mobileNo}</td>
       </tr>
     </c:forEach>
  </table>
  </c:if>

</body>
</html>