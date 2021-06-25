package com.ltts.mov.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.mov.dao.MovieDao;
import com.ltts.mov.model.Movie;


/**
 * Servlet implementation class InsertMovieServlet
 */
@WebServlet("/InsertMovieServlet")
public class InsertMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("mid"));
		String name = request.getParameter("mname");
		String actor = request.getParameter("mactor");
		String actress =  request.getParameter("mactress");
		String rdate = request.getParameter("mrdate");
		String lang = request.getParameter("mlang");
		String type = request.getParameter("mtype");
		int pid = Integer.parseInt(request.getParameter("mpid"));
		
		Movie m = new Movie(id, name, actor, actress, rdate, lang, type, pid);
		System.out.println(m);
		MovieDao md = new MovieDao();
		boolean b = true;
		
		try {
		b = md.InsertMovie(m);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(b==false) {
			System.out.println("Inserted Successfully");
		}
		else {
			System.out.println("Error");
		}
	}

	}
