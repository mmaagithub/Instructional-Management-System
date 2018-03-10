package com.servletStudent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.impl.StudentServiceImpl;

public class UpdateStuServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id =  request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String tel = request.getParameter("tel");
		String stu_class = request.getParameter("stu_class");
		StudentServiceImpl ss = new StudentServiceImpl();
		ss.Update(id,password,name,age,sex,tel,stu_class);
		request.getRequestDispatcher("Success.jsp").forward(request, response);		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
		
	}

}
