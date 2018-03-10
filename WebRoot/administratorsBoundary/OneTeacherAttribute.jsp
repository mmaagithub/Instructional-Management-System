<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'oneTeacherAttribute.jsp' starting page</title>
    
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
  Teacher tea = (Teacher)request.getAttribute("tea");
  
   %>
  
  <body>   
  <input type="text" value = "<%=tea.getTea_id()%>">id
 <input type="text" value = "<%=tea.getTea_name()%>">name
 <input type="text" value = "<%=tea.getTea_age()%>">age
 <input type="text" value = "<%=tea.getTea_sex()%>">sex
 <input type="text" value = "<%=tea.getTea_tel()%>">tel
 <input type="text" value = "<%=tea.getTea_type()%>">type
 <a href="DeleteTeaServlet?id=<%=tea.getTea_id()%>"> 删除</a></td>
  </body>
</html>
