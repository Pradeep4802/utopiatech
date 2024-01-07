package com.crud.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/saveservlet")
public class SaveServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
//			out.println("Hello World!!");
			
			String name = request.getParameter("user_name");
			String password = request.getParameter("user_password");
			String email = request.getParameter("user_email");
			String country = request.getParameter("user_country");
//			out.println(country);
			Employee e = new Employee();
			e.setName(name);
			e.setPassword(password);
			e.setEmail(email);
			e.setCountry(country);
			
			int status = EmployeeDAO.save(e);
			out.println(status+"JIo  ");
			if(status > 0) {
				out.print("<p> Record saved Successfully!!!</p>");
				request.getRequestDispatcher("index.html").include(request, response);
			}
			else {
				out.println("Sorry!! unable to save record");
			}
		}
	}

}
