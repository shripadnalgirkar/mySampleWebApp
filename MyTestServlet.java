package com.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class MyTestServlet
 */

public class MyTestServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
	
	public static final Logger log = LoggerFactory.getLogger(MyTestServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println(" Received Paramas =" + request.getParameterMap());

		log.debug(" Received Paramas =" + request.getParameter("Name"));
		log.debug(" Received Paramas =" + request.getParameter("Age"));
		log.debug(" Received Paramas =" + request.getParameter("gender"));
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("./welcome.html").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
