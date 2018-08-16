   package com.cg.resumeservlet;
import com.cg.collectorresume.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resume1
 */
@WebServlet("/Resume")
public class Resume1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resume1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Resume1 resume = new Resume1();
		resume.setFirstName(request.getParameter("firstname"));
		resume.setLastName(request.getParameter("lastname"));
		resume.setEmail(request.getParameter("email"));
		resume.setHobbies(request.getParameter("hobbies"));
		request.setAttribute("Resume", resume);
		RequestDispatcher requestdispatcher=request.getRequestDispatcher("index.jsp");
		requestdispatcher.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void setHobbies(String parameter) {
		// TODO Auto-generated method stub
		
	}

	private void setEmail(String parameter) {
		// TODO Auto-generated method stub
		
	}

	private void setLastName(String parameter) {
		// TODO Auto-generated method stub
		
	}

	private void setFirstName(String parameter) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
