<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
 <!-- 学生修改 -->
  <body>
    <form action="UpdateStuServlet" method="post">
    <input type="text" name = "id" readonly="readonly" value = "<%=((Student)session.getAttribute("SessionStu")).getId()%>">id<br>
    <input type="text" name = "password" value = <%=((Student)session.getAttribute("SessionStu")).getPassword()%>>password<br>
    <input type="text" name = "name">name<br>
    <input type="text" name = "age">age<br>
    <input type="text" name = "sex">sex<br>
    <input type="text" name = "tel">tel<br>
    <input type="text" name = "stu_class">stu_class<br>
    <input type="submit" >
    </form>
  </body>
</html>
