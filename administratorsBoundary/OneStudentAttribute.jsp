<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'OneStudentAttribute.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%
  Student stu = (Student)request.getAttribute("stu");
  
   %>
  
  <body>   
  <input type="text" value = "<%=stu.getId()%>">id
 <input type="text" value = "<%=stu.getName()%>">name
 <input type="text" value = "<%=stu.getAge()%>">age
 <input type="text" value = "<%=stu.getSex()%>">sex
 <input type="text" value = "<%=stu.getTel()%>">tel
 <input type="text" value = "<%=stu.getStu_class()%>">class
 <a href="DeleteStuServlet?id=<%=stu.getId()%>"> 删除</a></td>
  </body>
</html>
