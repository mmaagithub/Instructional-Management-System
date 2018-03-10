<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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


</head>


<body>
	<div class="container-fluid">
		<li class="nav-header">学生管理</li> </br>
		<li><a href="administratorsBoundary/AddStudent.jsp" target="right">增加学生</a></li> <br>
		<li><a href="SelectStudent" target="right" >查找学生</a></li> <br>
		<li><a href="administratorsBoundary/DeleteStu.jsp" target="right">删除学生</a></li> <br>
		<li><a href="administratorsBoundary/UpdataSelectStuId.jsp" target="right">修改学生信息</a></li><br>
		<li class="nav-header">老师管理</li> <br>
		<li><a href="administratorsBoundary/AddTeacher.jsp" target="right">增加老师</a></li> <br>
		<li><a href="SelectTeacher" target="right">查找老师</a></li> <br>
		<li><a href="administratorsBoundary/DeleteTea.jsp" target = "right">删除老师</a></li> <br>
		<li><a href="administratorsBoundary/UpdataSelectTeaId.jsp" target = "right">修改老师</a></li> <br>
		<li class="nav-header">班级管理</li> <br>
		<li><a href="#">查看班级信息</a></li> <br>
		<li class="nav-header">课程管理</li> <br>
		<li><a href="#">添加课程</a></li> <br>
	</div>

</body>
</html>
