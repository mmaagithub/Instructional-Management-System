package com.servletStudent;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.service.impl.StudentServiceImpl;

public class SelectOneStudent extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id =  request.getParameter("id");
		StudentServiceImpl ss = new StudentServiceImpl();
		List<Student> stuList=ss.SelectAll();
		boolean flow = false;
		for(Student stu:stuList){
			if(stu.getId().equals(id)){
				flow = true;
				request.setAttribute("stu",stu);
				request.getRequestDispatcher("administratorsBoundary/OneStudentAttribute.jsp").forward(request, response);
			}
		}
		if(flow==false) {
			request.getRequestDispatcher("Loser.jsp").forward(request, response);
		}		
	}
}
