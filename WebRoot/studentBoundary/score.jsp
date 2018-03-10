<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'score.jsp' starting page</title>

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
	<% List<List> list = (List) request.getAttribute("onelist");
   	 %>
	<table>
		<tr>
			<td>课程号</td>
			<td>课程名</td>
			<td>任课老师姓名</td>
			<td>分数</td>
		</tr>
		<%for(int i = 0;i<list.size();i++){  %>   
		<tr>
			<td><%=list.get(i).get(3) %></td>
			<td><%=list.get(i).get(4) %></td>
			<td><%=list.get(i).get(6) %></td>
			<td><%=list.get(i).get(7) %></td>
		</tr>
		<%}%>
	</table>

</body>
</html>
