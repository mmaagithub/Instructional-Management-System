<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'StudentSelect.jsp' starting page</title>
    
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
     <form action="SelectOneStudent" method="post">
    	输入要查询的学生id<input type="text" name = "id" ><br>
    <input type="submit" >
    </form>
  <% List<Student> list = null;
 	list= (List)request.getAttribute("stuSelectAll");%>
 	<table>
 		<tr>
 			<td>学号</td>
 			<td>姓名</td>
 			<td>性别</td>
 			<td>年龄</td>
 			<td>删除</td>
 			<td>修改</td>		
 		</tr>		
 
<%for(Student stu:list){%>
 		<tr>
 			<td><%=stu.getId() %></td>
 			<td><%=stu.getName()%></td>
 			<td><%=stu.getSex()%></td>
 			<td><%=stu.getAge() %></td>
 			<td><a href="DeleteStuServlet?id=<%=stu.getId()%>">删除</a></td>	
 			<td><a href="administratorsBoundary/UpdateStudent.jsp?id=<%=stu.getId()%>">修改</a></td>	
 		</tr>	
 	<%} %>
 	</table>
  </body>
</html>
