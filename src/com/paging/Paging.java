package com.paging;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Page;
import com.role.Student;
import com.service.impl.FyServiceImpl;

public class Paging extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String  s =request.getParameter("pagenow");
		System.out.println(s);
			int pagenow = Integer.parseInt(request.getParameter("pagenow"));
			FyServiceImpl fy = new FyServiceImpl();
			Page page = fy.page();
			page.setOffsetone((pagenow-1)*page.getSlide());//得到每页的第一条
			List<Student> list = fy.selectAll(page.getOffsetone(),page.getSlide());
			request.getSession().setAttribute("list",list);
			request.getSession().setAttribute("page1",page);
			request.getRequestDispatcher("Pag.jsp").forward(request, response);
			
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
	}

}
