package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRegister extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String id = request.getParameter("userid");
			String pass = request.getParameter("userpassword");
			String role = request.getParameter("role");
			if(role.equals("student")){
				
			} else if(role.equals("teacher")){
				
			} else{												
			request.getRequestDispatcher("/studentBoundary/Windows.jsp").forward(request, response);					
					
			request.getRequestDispatcher("/Loser.jsp").forward(request, response);									}			
	}

}
