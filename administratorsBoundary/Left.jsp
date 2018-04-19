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
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link rel="stylesheet" type="text/css" href="./bootstrap/bootstrap.css">


</head>


<body>
	<div class="container">
		<li class="nav-header">学生管理</li> </br>
		<li><a href="administratorsBoundary/AddStudent.jsp" target="right">增加学生</a></li> <br>
		<li><a href="SelectStudent?pagenow=1" target="right" >查找学生</a></li> <br>
		<li><a href="administratorsBoundary/DeleteStu.jsp" target="right">删除学生</a></li> <br>
		<li><a href="administratorsBoundary/UpdataSelectStuId.jsp" target="right">修改学生信息</a></li><br>
		<li class="nav-header">老师管理</li> <br>
		<li><a href="administratorsBoundary/AddTeacher.jsp" target="right">增加老师</a></li> <br>
		<li><a href="SelectTeacher" target="right">查找老师</a></li> <br>
		<li><a href="administratorsBoundary/DeleteTea.jsp" target = "right">删除老师</a></li> <br>
		<li><a href="administratorsBoundary/UpdataSelectTeaId.jsp" target = "right">修改老师</a></li> <br>
		<li class="nav-header">班级管理</li> <br>
		<li><a href="test.jsp" target = "right">查看班级信息</a></li> <br>
		<li class="nav-header">课程管理</li> <br>
		<li><a href="test.jsp" target = "right">添加课程</a></li> <br>
	</div>
</body>
</html>
