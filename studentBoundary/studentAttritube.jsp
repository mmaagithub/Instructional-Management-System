<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%@taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Right.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<% Student stu = (Student)session.getAttribute("SessionStu"); %>
 <h1 >我的信息</h1>

 <input type="text" value = "<%=stu.getId()%>">id
 <input type="text" value = "<%=stu.getName()%>">name
 <input type="text" value = "<%=stu.getAge()%>">age
 <input type="text" value = "<%=stu.getSex()%>">sex
 <input type="text" value = "<%=stu.getTel()%>">tel
 <input type="text" value = "<%=stu.getStu_class()%>">class
 
  </body>
</html>
