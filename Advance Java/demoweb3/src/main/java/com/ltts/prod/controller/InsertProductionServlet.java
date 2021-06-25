package com.ltts.prod.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.prod.dao.ProductionDao;
import com.ltts.prod.model.Production;

/**
 * Servlet implementation class InsertProductionServlet
 */
@WebServlet("/InsertProductionServlet")
public class InsertProductionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProductionServlet() {
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
		int no = Integer.parseInt(request.getParameter("pno"));
		String name = request.getParameter("pname");
		String address = request.getParameter("paddress");
		String date =  request.getParameter("pdate");
		String owner = request.getParameter("powner");
		
		Production p = new Production(no, name, address, date, owner);
		System.out.println(p);
		ProductionDao pd = new ProductionDao();
		boolean b = true;
		
		try {
		b = pd.InsertProductionServlet(p);
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

