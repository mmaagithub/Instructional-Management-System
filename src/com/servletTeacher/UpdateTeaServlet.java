package com.servletTeacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;

public class UpdateTeaServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id =  request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String type = request.getParameter("type");
		String tel = request.getParameter("tel");
		TeacherServiceImpl ss = new TeacherServiceImpl();
		ss.Update(id,password,name,age,sex,type,tel);
		request.getRequestDispatcher("Success.jsp").forward(request, response);			
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
		
	}

}
