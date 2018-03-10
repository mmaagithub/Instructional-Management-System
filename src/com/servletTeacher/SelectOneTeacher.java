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

public class SelectOneTeacher extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id =  request.getParameter("id");
		TeacherServiceImpl ss = new TeacherServiceImpl();
		List<Teacher> teaList=ss.SelectAll();
		boolean flow = false;
		for(Teacher tea:teaList){
			if(String.valueOf(tea.getTea_id()).equals(id)){
				flow = true;
				request.setAttribute("tea",tea);
				request.getRequestDispatcher("administratorsBoundary/OneTeacherAttribute.jsp").forward(request, response);
			}
		}
		if(flow==false) {
			request.getRequestDispatcher("Loser.jsp").forward(request, response);
		}				
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
