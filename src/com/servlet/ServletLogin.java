package com.servlet;
//管理员账号密码是111
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.role.Teacher;
import com.service.impl.StudentServiceImpl;
import com.service.impl.TeacherServiceImpl;

public class ServletLogin extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = null;
		id = request.getParameter("userid");
		String password = request.getParameter("userpassword");
		String role = request.getParameter("role");
		if(role.equals("student")){
			StudentServiceImpl ss = new StudentServiceImpl();
			List<Student> list = ss.SelectAll();
			boolean flow = true;
			for(int i = 0;i<list.size();i++){
				if((list.get(i).getId().equals(id))&&(list.get(i).getPassword().equals(password))){
					flow = false;
					request.getSession().setAttribute("SessionStu", list.get(i));
					request.getRequestDispatcher("studentBoundary/Windows.jsp").forward(request, response);
				}
			}
			if(true){
				request.getRequestDispatcher("Loser.jsp").forward(request, response);
			}
		} else if(role.equals("teacher")){
			TeacherServiceImpl ss = new TeacherServiceImpl();
			List<Teacher> list = ss.SelectAll();
			boolean flow = true;
			for(int i = 0;i<list.size();i++){
				if(String.valueOf(list.get(i).getTea_id()).equals(id)&&(list.get(i).getTea_password().equals(password))){
					flow = false;
					request.getSession().setAttribute("SessionTea", list.get(i));
					request.getRequestDispatcher("teacherBoundary/Windows.jsp").forward(request, response);
				}
			}
			if(true){
				request.getRequestDispatcher("Loser.jsp").forward(request, response);
			}
			
		} else {
			if(id.equals("111")&&password.equals("111")){
				request.getRequestDispatcher("administratorsBoundary/Windows.jsp").forward(request, response);
			}			
		}		
	}
}

