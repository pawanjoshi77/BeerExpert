package com.pawanjoshi;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pawanjoshi.model.BeerExpert;

public class BeerSelect extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);

	    request.setAttribute("pawan", result);
		
		RequestDispatcher view = request.getRequestDispatcher("beerselect.jsp");
		view.forward(request, response);
		
		/*
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("Beer Selection Advice<br>");
			String c = request.getParameter("color");
			out.println("<br>Got beer color " + c);
			
			*/
	}

}
