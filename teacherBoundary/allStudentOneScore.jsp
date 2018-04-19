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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>

	<table>
		<tr>
			<td>学生学号</td>
			<td>学生姓名</td>
			<td>学生班级</td>
			<td>课程号</td>
			<td>课程名</td>
			<td>分数</td>
			<td>修改成绩</td>
		</tr>
		<c:forEach items="${requestScope.OneScoreList}" var="row" varStatus = "f1">
			<tr>
				<c:forEach items="${row}" var="item" varStatus="f2" begin="0">				
					<c:if test="${f2.index==0 }">
						<td><c:out value="${item}" /></td>
						<c:set var="stuid" value="${item}" />
					</c:if>
					<c:if test="${f2.index==1 }">
						<td><c:out value="${item}" /></td>
					</c:if>
					<c:if test="${f2.index==2 }">
						<td><c:out value="${item}" /></td>
					</c:if>
					<c:if test="${f2.index==3 }">
						<td><c:out value="${item}" /></td>
						<c:set var="scoreid" value = "${item }"/>
					</c:if>
					<c:if test="${f2.index==4 }">
						<td><c:out value="${item}" /></td>
					</c:if>
					<c:if test="${f2.index==7 }">
						<td><c:out value="${item}" /></td>
					</c:if>
				</c:forEach>	
				
				<td><a href="teacherBoundary/updateScore.jsp?stuid=${stuid }&scoreid=${scoreid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>

<!-- 弹出一个子窗口
	<script> window.open ('Success.jsp','newwindow','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no');</script> 
 -->