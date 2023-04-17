package org.btm.lifecycleApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FirstServlet extends GenericServlet
{

	public FirstServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("Servlet Object is Created");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet Object is Initialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		PrintWriter out = res.getWriter();
		out.println(name+" is from "+place);
		out.close();
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("all costly resources are closed");
	}
	

}
