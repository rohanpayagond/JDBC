package com.xworkz.game;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/form")
public class GameServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<html> <body>");
		writer.print("<form action='form' method='post'>");
		writer.print("Name : <input type='text' name='name'>");
		writer.print("Email : <input type='email' name='email'>");
		writer.print("<button type='submit' name='name'>Submit</button></form>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<h2>Submitted Details</h2>");
		writer.print("Name : " + name);
		writer.print("Email : " + email);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);

	}

}
