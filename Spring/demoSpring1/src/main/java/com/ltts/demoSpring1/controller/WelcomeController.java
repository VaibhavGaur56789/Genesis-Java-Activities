package com.ltts.demoSpring1.controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.demoSpring1.Dao.MovieDao;
import com.ltts.demoSpring1.Dao.ProductionDao;
import com.ltts.demoSpring1.model.Movie;
import com.ltts.demoSpring1.model.Production;


@RestController
public class WelcomeController {
	
	@Autowired
	ProductionDao pd;
	
	@Autowired
	MovieDao md;
	
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/production")
	public ModelAndView secondMethod()
	{
		return new ModelAndView("addproduction");
	}
	
	@RequestMapping(value="/insertProduction", method=RequestMethod.POST)
	public ModelAndView thirdMethod(HttpServletRequest request)
	{
		ModelAndView mv = null;
		int no = Integer.parseInt(request.getParameter("pno"));
		System.out.println(no);
		String name = request.getParameter("pname");
		String address = request.getParameter("paddress");
		String date =  request.getParameter("pdate");
		String owner = request.getParameter("powner");
		
		Production p = new Production(no, name, address, date, owner);
		boolean b = pd.insertProduction(p);
		if(b==false) {
			return mv = new ModelAndView("success");
		} else {
		return mv = new ModelAndView("error");
	}
}
	
	@RequestMapping("/movie")
	public ModelAndView movieMethod()
	{
		return new ModelAndView("addmovie");
	}
	
	@RequestMapping(value="/insertMovie", method=RequestMethod.POST)
	public ModelAndView movieInsertMethod(HttpServletRequest request)
	{
		System.out.println("Inside insert method");
		String moviename=request.getParameter("mname");
		String cast1=request.getParameter("cast1");
		String cast2=request.getParameter("cast2");
		String movietype=request.getParameter("mtype");
		String mdate=request.getParameter("mdate");
		System.out.println(mdate);
		//LocalDate ld = LocalDate.parse(movietype);
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		//LocalDate ld = (LocalDate)dtf.parse(mdate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  //String date = "16/08/2016";

		  //convert String to LocalDate
		  LocalDate localDate = LocalDate.parse(mdate, formatter);
		System.out.println(localDate);
		Movie m =new Movie(1, moviename, cast1, cast2, localDate, movietype);
		md.save(m);
		return new ModelAndView("success");
	}
	
	@RequestMapping("/viewmovies")
	public ModelAndView viewMovies(Model model) {
		ModelAndView mv = new ModelAndView("viewmovies");
		List<Movie> ml = (List<Movie>) md.findAll(); 
		model.addAttribute("movies", ml);
		return mv;
		
	}
	
	@RequestMapping("/viewproduction")
	public ModelAndView viewProduction(Model model) {
		ModelAndView mv = new ModelAndView("viewproduction");
		List<Production> pl = pd.getAllProduction(); 
		model.addAttribute("production", pl);
		return mv;
		
	}
	
	@RequestMapping("/editproduction")
	public ModelAndView editProduction(@RequestParam int id, Model model) {
		ModelAndView mv = new ModelAndView("editproduction");
		Production p = pd.getProductionid(id);
		model.addAttribute("production", p);
		return mv;
	}
	
	@RequestMapping(value="/updateProduction", method=RequestMethod.POST)
	public ModelAndView updateProduction(HttpServletRequest request) {
		ModelAndView mv = null;
		int no = Integer.parseInt(request.getParameter("pno"));
		System.out.println(no);
		String name = request.getParameter("pname");
		String address = request.getParameter("paddress");
		String date =  request.getParameter("pdate");
		String owner = request.getParameter("powner");
		
		Production p = new Production(no, name, address, date, owner);
		boolean b = pd.updateProduction(p);
		if(b==false) {
			return mv = new ModelAndView("success");
		} else {
		return mv = new ModelAndView("error");
	}
		
	}
	
	@RequestMapping("/searchproduction")
	public ModelAndView searchproduction() {
		ModelAndView mv = new ModelAndView("searchproduction");
		return mv;
	}
	/*
	@RequestMapping("/search")
	public ModelAndView viewSearchedProduction(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("viewsearchproduction");
		int mid = Integer.parseInt(request.getParameter("pno"));
		String name = request.getParameter("pname");
		List<Production> li = pd.getAllProductionByOwnername(mid, name);
		model.addAttribute("production", li);
		return mv;
	}*/
	
}
