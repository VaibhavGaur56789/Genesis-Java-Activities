package com.ltts.mov.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.mov.dao.MovieDao;


/**
 * Servlet implementation class updateMovieServlet
 */
@WebServlet("/updateMovieServlet")
public class updateMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int id = Integer.parseInt(request.getParameter("mid"));
		String name = request.getParameter("mname");
		String actor = request.getParameter("mactor");
		String actress =  request.getParameter("mactress");
		String rdate = request.getParameter("mrdate");
		String lang = request.getParameter("mlang");
		String type = request.getParameter("mtype");
		int pid = Integer.parseInt(request.getParameter("mpid"));
		
		MovieDao md=new MovieDao();
		int check = 0;
		try {
			check = md.update(id, name, actor, actress, rdate, lang, type, pid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=null;
		if(check!=0)
		{
			rd=request.getRequestDispatcher("sucess.html");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("editplayer.jsp");
			rd.forward(request, response);
			System.out.println("Not updated");
		}
		
		
	}

}
