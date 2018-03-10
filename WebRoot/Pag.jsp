<%@ page language="java" import="java.util.*,com.role.*" pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Pag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="bootstrap/bootstrap.min.css" type="text/javascript"></script>
	<!-- <script src="JQuery/jquery-3.3.1.min.js" type="text/javascript"></script> -->

  </head>
  
  <body>
   	<% List list = (List) session.getAttribute("list");
   		int size=list.size();
   	 %>
   	 ${list==null }
   	 <c:choose>
   	 	<c:when test="${list==null }">
   	 		没有查到任何数据
   	 	</c:when>
   	 	<c:otherwise>
   	 		<table>
   	 			<tr>
   	 				<td>学号</td>
   	 				<td>姓名</td>
   	 				<td>年龄</td>
   	 				<td>性别</td>
   	 				<td>电话</td>
   	 				<td>地址</td>
				</tr>
				<c:forEach items = "${list }" var = "list1">
					<tr>
						<td>${list1.id }</td>
						<td>${list1.name }</td>
						<td>${list1.age }</td>
						<td>${list1.sex }</td>
						<td>${list1.tel }</td>
						<td>${list1.stu_class }</td>						
					</tr>			
				</c:forEach>  	 		
   	 		</table>   	 		  	 		   	 				  	 		
   	 	</c:otherwise>
   	 </c:choose>
   	 <ul class="pagination pagination-lg">
   	 <%
   	 	int offset = new Integer(request.getParameter("pagenow"));
   	 	Page pb = (Page)session.getAttribute("page1");
   	 	out.println("<li><a href = Paging?pagenow=1" + ">首页</a></li>"); 	 
   	  %>
   	  <%
			if (offset > 1) {
				out.println("<li ><a href=Paging?pagenow=" + (offset - 1)
						+ ">&laquo;</a></li>");
			} else {
				out.println("<li class='disabled'><a>&laquo;</a></li>");
			}
		%>
		<%
			for (int i = 1; i <= pb.getPageCount(); i++) {
				out.print("<li><a href=Paging?pagenow=" + i + ">-" + i
						+ "-</a></li>");

			}
		%>
		<%
			if (offset < pb.getPageCount()) {
				out.println("<li><a href=Paging?pagenow=" + (offset + 1)
						+ ">&raquo</a></li>");
			} else {
				out.println("<li class='disabled'><a>&raquo</a></li>");
			}
		%>
		<%
			out.println("<li><a href=Paging?pagenow="+pb.getPageCount()
					+ ">尾页</a></li>");
		%>
   	 </ul>
   	 
  </body>
</html>
