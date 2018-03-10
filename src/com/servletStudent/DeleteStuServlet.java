package com.servletStudent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataBase;
import com.service.impl.StudentServiceImpl;

public class DeleteStuServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {			
			int id = Integer.parseInt(request.getParameter("id"));
			StudentServiceImpl ss = new StudentServiceImpl();
			int a = ss.Delete(id);
			if(a>0){
				request.getSession().setAttribute("deleteStuFlow", a);
				request.getRequestDispatcher("/SelectStudent").forward(request, response);
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
