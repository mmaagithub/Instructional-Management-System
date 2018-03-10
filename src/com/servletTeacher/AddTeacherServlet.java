package com.servletTeacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.role.Teacher;
import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;

public class AddTeacherServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");		
		String type = request.getParameter("type");
		String tel = request.getParameter("tel");
		Teacher tea = new Teacher(Integer.parseInt(id),password,name,Integer.parseInt(age),sex,type,tel);
		TeacherServiceImpl ss = new TeacherServiceImpl();
		ss.Add(tea);
		request.getRequestDispatcher("administratorsBoundary/AddTeacher.jsp").forward(request, response);
		
	}

}
