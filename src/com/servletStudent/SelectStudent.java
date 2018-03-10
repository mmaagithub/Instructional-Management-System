package com.servletStudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataBase;
import com.role.Student;
import com.service.impl.StudentServiceImpl;

public class SelectStudent extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			StudentServiceImpl ss = new StudentServiceImpl();
			List<Student> stuList=ss.SelectAll();
			request.setAttribute("stuSelectAll", stuList);			
			request.getRequestDispatcher("administratorsBoundary/StudentSelect.jsp").forward(request,response);				
			}			
	}

