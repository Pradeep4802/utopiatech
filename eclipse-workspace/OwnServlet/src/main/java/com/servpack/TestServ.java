package com.servpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServ")
public class TestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ServletConfig conf;
    public TestServ() {
        super();
        
    }

	
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
	}

	
//	public void destroy() {
//		System.out.println("Going to destroy servlet object.");
//	}

	
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	
	public String getServletInfo() {
		
		return "This servlet is created by pradeep"; 
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("<h1> This is my output too going </h1>");
			out.println("<br><h1>"+conf.getServletName() +"</h1>");
			out.println("<br><h1>"+request.getLocalAddr() +"</h1>");
			out.println("<br><h1>"+request.getLocalName() +"</h1>");
			out.println("<br><h1>"+request.getLocalPort() +"</h1>");
			out.println("<br><h1>"+request.getContentLength() +"</h1>");
		}
	}

}
