<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Left.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="../bootstrap/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="./bootstrap/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">


</head>

<body>
<%Student stu= (Student)session.getAttribute("SessionStu");  
out.println(stu.getId());%>
	<div class="container-fluid">
		<li class="nav-header">学生管理</li> </br>
		<li><a href="studentBoundary/studentAttritube.jsp" target="right">查看信息</a></li> <br>
		<li><a href="studentBoundary/UpdateStudent.jsp" target="right">修改信息</a></li> <br>
		<li><a href="SelectOneStuAllScore?id=<%stu.getId();%>" target="right">查看成绩</a></li> <br>		
	</div>

</body>
</html>
