<%@ page language="java" import="java.util.*,com.role.*"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>My JSP 'StudentSelect.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="bootstrap/bootstrap.min.css"> 

</head>

<body>
	<form action="SelectOneStudent" method="post">
		输入要查询的学生id<input type="text" name="id"><br>
		 <input type="submit" name="update" value="查询">
	</form>
	<%
		List<Student> list = null;
		list = (List) session.getAttribute("list");
	%>
	<c:choose>
		<c:when test="${list==null }">
   	 		没有查到任何数据
   	 	</c:when>
		<c:otherwise>
			<table>
				<tr>
					<td>学号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>年龄</td>
					<td>电话</td>
					<td>班级</td>
					<td>删除</td>
					<td>修改</td>
				</tr>
				<c:forEach items="${list }" var="list1">
					<tr>
						<td>${list1.id }</td>
						<td>${list1.name }</td>						
						<td>${list1.sex }</td>
						<td>${list1.age }</td>
						<td>${list1.tel }</td>
						<td>${list1.stu_class }</td>
						<td><a href="DeleteStuServlet?id=${list1.id }">删除</a></td>
						<td><a href="administratorsBoundary/UpdateStudent.jsp?id=${list1.id }">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>

		<%
			int offset = new Integer(request.getParameter("pagenow"));
			Page pb = (Page) session.getAttribute("page1");
			out.println("<a href = SelectStudent?pagenow=1" + ">首页  </a>");
		%>
		&nbsp;
		<%
			if (offset > 1) {
				out.println("<a href=SelectStudent?pagenow=" + (offset - 1)
						+ ">&laquo;</a>");
			} else {
				out.println("<a>  &laquo;  </a>");
			}
		%>
		&nbsp;
		<%
			for (int i = 1; i <= pb.getPageCount(); i++) {
				out.print("<a href=SelectStudent?pagenow=" + i + ">-" + i
						+ "-</a>");

			}
		%>
		&nbsp;
		<%
			if (offset < pb.getPageCount()) {
				out.println("<a href=SelectStudent?pagenow=" + (offset + 1)
						+ ">&raquo</a>");
			} else {
				out.println("<a>  &raquo  </a></li>");
			}
		%>
		&nbsp;
		<%
			out.println("<a href=SelectStudent?pagenow=" + pb.getPageCount()
					+ ">  尾页</a>");
		%>
</body>
</html>
