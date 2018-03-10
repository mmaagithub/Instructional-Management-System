<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="./bootstrap/bootstrap.min.css">
	
<script type="text/javascript" src = "./JQuery/jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#formregister").hide()
		$("#register").click(function(){
			$("#formregister").show()
			$("#formlogin").hide()
			$("#register").hide()
		});	
	});
	
</script>

  </head>
  
  <body>  
    
  	<div class="container" style="margin-top: 8%;margin-left: 60%">
	<div class="row">
        <div class="col-sm-4">
        
      <form class="form-signin"  action="ServletLogin" id = "formlogin" method = "post" >
         <h1 class="cover-heading">嗨，你好！</h1><br>
        <input type="text" class="form-control" placeholder="id"  name = "userid"required autofocus  > <br>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" name = "userpassword" required><br>   
        <div class="checkbox" id = "check">
          <label>
            <input type="radio" value="student" id = "student" name = "role"> 学生&nbsp;&nbsp;&nbsp;
             <input type="radio" value="teacher" id = "teacher" name = "role"> 教师&nbsp;&nbsp;&nbsp;
              <input type="radio" value="academic" id = "academic" name = "role"> 教务
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
      </form>
       <button class="btn btn-lg btn-primary btn-block" type="submit" id = "register">注册</button>


 	<form class="form-signin" action="ServletRegister" id = "formregister" method = "post">
        <h1 class="cover-heading">欢迎加入！</h1>
        <input type="test"  class="form-control" placeholder="id" name = "userid"required autofocus><br>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" name = "userpassword"required> <br>  
		 <div class="checkbox">
          <label>
           <input type="checkbox" value="student" id = "student" name = "role"> 学生&nbsp;&nbsp;&nbsp;
             <input type="checkbox" value="teacher" id = "teacher" name = "role"> 教师&nbsp;&nbsp;&nbsp;
              <input type="checkbox" value="academic" id = "academic" name = "role"> 教务
          </label>
        </div> 
        <button class="btn btn-lg btn-primary btn-block" type="submit">完成</button>
      </form>
    
     <div class="site-wrapper">
 		 <div class="mastfoot">
            <div class="inner"><br>
              <p>Visit the author's blog  <a href="http://blog.csdn.net/xiao_ma_CSDN">Author</a>, by <a href="">@ma</a>.</p>
            </div>
          </div>       
       </div>
    
    </div> <!-- /container -->
    </div>     
    </div>
    
    
  </body>
</html>
