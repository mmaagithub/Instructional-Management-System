<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UpdataTeacher.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
<!--   修改老师 -->
  <body>
     <%String id = request.getParameter("id"); %>
    <form action="UpdateTeaServlet" method="post">
    <input type="text" name = "id" readonly="readonly" value = "<%=id%> ">id<br>
    <input type="text" name = "password" >password<br>
    <input type="text" name = "name">name<br>
    <input type="text" name = "age">age<br>
    <input type="text" name = "sex">sex<br>
    <input type="text" name = "type">type<br>
    <input type="text" name = "tel">tel<br>    
    <input type="submit" >
    </form>
  </body>
</html>
