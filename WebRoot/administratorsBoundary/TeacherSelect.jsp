<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'teacherSelect.jsp' starting page</title>
    
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

     <form action="SelectOneTeacher" method="post">
    	输入要查询的老师id<input type="text" name = "id" ><br>
    <input type="submit" >
    </form>
  <% List<Teacher> list = null;
 	list= (List)request.getAttribute("teaSelectAll");
 	%>
 	
 	<table>
 		<tr>
 			<td>工号</td>
 			<td>姓名</td>
 			<td>年龄</td>
 			<td>性别</td>
 			<td>类型</td>
 			<td>电话</td>
 			<td>删除</td>
 			<td>修改</td>		
 		</tr>		
 
	
	<%for(Teacher tea : list){%>
 		<tr>
 			<td><%=tea.getTea_id() %></td>
 			<td><%=tea.getTea_name()%></td>
 			<td><%=tea.getTea_age()%></td>
 			<td><%=tea.getTea_sex() %></td>
 			<td><%=tea.getTea_type() %></td>
 			<td><%=tea.getTea_tel() %></td> 	 
 			<td><a href="DeleteTeaServlet?id=<%=tea.getTea_id()%>">删除</a></td>	
 			<td><a href="administratorsBoundary/UpdateTeacher.jsp?id=<%=tea.getTea_id()%>">修改</a></td>	
 		</tr>	
 	<%} %>
 	</table>
  </body>
  </body>
</html>
