package com.servpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/myservlet")
public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public myservlet() {
		super();

	}


	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String paramValue = config.getInitParameter("myParam");
	}

	public String getServletInfo() {
		return "This servlet is created by pradeep";
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			Student stu[] = new Student[5];
			int count = 0;
			String name,email,password,contact,dob,address;
			for(int i = 0;i < stu.length ; i++ ) {
				name = request.getParameter("user_name");
				email = request.getParameter("user_email");
				password = request.getParameter("user_pass");
				contact = request.getParameter("user_contact");
				dob = request.getParameter("user_dob");
				address = request.getParameter("user_address");
				stu[count++] = new Student(name,email,password,contact,dob,address);
			}


			out.println("<table border='1' style='border-collapse: collapse; '");
			out.println("<thead>");
			out.println("<tr>");
			out.println("<td>Name</td>");
			out.println("<td>Email</td>");
			out.println("<td>Password</td>");
			out.println("<td>Contact</td>");
			out.println("<td>DOB</td>");
			out.println("<td>Address</td>");
			out.println("</tr>");
			out.println("</thead>");
			out.println("<tbody>");
			for(Student stud : stu) {
				out.println("<tr>");
				out.println("<td>"+stud.getName()+"</td>");
				out.println("<td>"+stud.getEmail()+"</td>");
				out.println("<td>"+stud.getPassword()+"</td>");
				out.println("<td>"+stud.getContact()+"</td>");
				out.println("<td>"+stud.getDob()+"</td>");
				out.println("<td>"+stud.getAddress()+"</td>");
				out.println("</tr>");
			}
			out.println("</tbody>");
			out.println("</table>");


			//			out.println("<h2>Name : "+name+"</h2><br>");
			//			out.println("<h2>Email : "+email+"</h2><br>");
			//			out.println("<h2>Password : "+password+"</h2><br>");
			//			out.println("<h2>Contact : "+contact+"</h2><br>");
			//			out.println("<h2>DOB : "+dob+"</h2><br>");
			//			out.println("<h2>Address : "+address+"</h2>");




			//			String servletname = request.getServerName();
			//			out.println(servletname);
			//			ServletConfig value = getServletConfig();
			//			out.println("<br>"+value);
			//			out.println("<br>"+getServletInfo());
			//			out.println("<br>"+value.getServletName());
			//			out.println("<br>"+value.getInitParameter("password"));
			//			
			//			ServletContext sc = value.getServletContext();
			//			out.println("<br>"+sc.getContextPath());
			//			out.println("<br>"+sc.getRealPath("index.jsp"));
			//			String mime = sc.getMimeType("index.jsp");
			//			URL url = sc.getResource("index.jsp");
			//			out.println("<br>"+url);
			//			out.println("<br>"+mime);

		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
