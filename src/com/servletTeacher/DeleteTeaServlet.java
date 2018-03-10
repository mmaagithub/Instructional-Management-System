package com.servletTeacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;

public class DeleteTeaServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		TeacherServiceImpl ss = new TeacherServiceImpl();
		int a = ss.Delete(id);
		if(a>0){
			request.getSession().setAttribute("deleteTeaFlow", a);
			request.getRequestDispatcher("/SelectTeacher").forward(request, response);
		}
		else{
			request.getRequestDispatcher("Loser.jsp").forward(request, response);
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

}
