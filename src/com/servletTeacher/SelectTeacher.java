package com.servletTeacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.role.Teacher;
import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;

public class SelectTeacher extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TeacherServiceImpl ss = new TeacherServiceImpl();
		List<Teacher> teaList=ss.SelectAll();
		request.setAttribute("teaSelectAll", teaList);			
		request.getRequestDispatcher("administratorsBoundary/TeacherSelect.jsp").forward(request,response);			
		
	}

}
