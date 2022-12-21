package com.cdac.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.User;
import com.cdac.UserValidation;

/**
 * Servlet implementation class ServletDemo2
 */
@WebServlet(name = "ServletDemo", urlPatterns = { "/validatingServlet" })
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cusid = request.getParameter("uid");
		System.out.println("getting uid"+cusid);
		String cupwd = request.getParameter("pwd");
		System.out.println("getting pwd"+cupwd);
		User u1=new User(cusid,cupwd);
		
		boolean valid=UserValidation.isValid(u1);
		if(valid==true) {
		 out.println("<h1> wlecome to cdac </h1>");
		}
		else {
		out.println("<h1> does not come to cdac </h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
