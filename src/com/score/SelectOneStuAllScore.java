package com.score;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.role.Student;
import com.service.impl.ScoreServiceImpl;

public class SelectOneStuAllScore extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student stu = (Student) request.getSession().getAttribute("SessionStu");
		String id = stu.getId();
		ScoreServiceImpl ss = new ScoreServiceImpl();
		List<List> list = ss.SelectAll();		
		boolean flow = false;		
		List onestulist = new ArrayList();
		for(int i = 0;i<list.size();i++){	
			if( stu.getId().equals(String.valueOf(list.get(i).get(0)))){		
					flow = true;					
					onestulist.add(list.get(i));	
				}		
			}					
		if(flow=true){
			request.setAttribute("onelist",onestulist);		System.out.println(onestulist);
			request.getRequestDispatcher("studentBoundary/score.jsp").forward(request, response);
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
