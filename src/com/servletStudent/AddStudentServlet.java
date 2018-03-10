package com.servletStudent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.service.impl.StudentServiceImpl;

public class AddStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String sex = request.getParameter("sex");
			String tel = request.getParameter("tel");
			String stu_class = request.getParameter("stu_class");
			Student stu = new Student(id,password,name,age,sex,tel,stu_class);
			StudentServiceImpl ss = new StudentServiceImpl();
			ss.Add(stu);
			ss.StudentAddUser(stu);
			request.getRequestDispatcher("administratorsBoundary/AddStudent.jsp").forward(request, response);
		
	}

}
