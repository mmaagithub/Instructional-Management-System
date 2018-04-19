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

<link rel="stylesheet" type="text/css"
	href="../bootstrap/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="./bootstrap/bootstrap.min.css">


</head>

<style>
/* 下拉按钮样式 */
.dropbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
}

/* 容器 <div> - 需要定位下拉内容 */
.dropdown {
	position: relative;
	display: inline-block;
}
/* 下拉内容 (默认隐藏) */
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
}
 /* 下拉菜单的链接 */
.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
} 

/* 鼠标移上去后修改下拉菜单链接颜色 */
.dropdown-content a:hover {
	background-color: #f1f1f1
}
/* 在鼠标移上去后显示下拉菜单 */
.dropdown:hover .dropdown-content {
	display: block;
}
/* 当下拉内容显示后修改下拉按钮的背景颜色 */
.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}
</style>

<body>
	<h2>老师管理</h2>
	<li><div class="dropdown">
			<button class="dropbtn">个人信息管理</button>
			<div class="dropdown-content">
					<a href="teacherBoundary/teacherAttritube.jsp" target="right">查看个人信息</a>	
					<a href="teacherBoundary/teacherUpdate.jsp" target="right">修改个人信息</a>	
			</div>
		</div></li>
		</br></br></br></br></br>
	<li><div class="dropdown">
			<button class="dropbtn">成绩管理</button>
			<div class="dropdown-content">
				<a href="AllStudentOneScore" target = "right">所有学生成绩</a>				
			</div>
		</div></li>
</body>
</html>
