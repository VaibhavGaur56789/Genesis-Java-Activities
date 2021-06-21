package com.ltts.demo.main;

import java.util.List;
import java.util.Scanner;

import com.ltts.demo.dao.MovieDao;
import com.ltts.demo.model.Movie;

public class MovieMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Insert the details");
			System.out.println("2. View the details");
			System.out.println("3. Delete the detail");
			System.out.println("4. Update the details");
			System.out.println("5. View by ID");
			System.out.println("6. Exit");
			
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter movie ID");
					int id = sc.nextInt();
					System.out.println("Enter movie name");
					String name = sc.next();
					System.out.println("Enter actor name");
					String actor = sc.next();
					System.out.println("Enter actress name");
					String actress = sc.next();
					System.out.println("Enter movie release date");
					String rdate = sc.next();
					System.out.println("Enter movie language");
					String language = sc.next();
					System.out.println("Enter movie type");
					String type = sc.next();
					System.out.println("Enter production id");
					int pid = sc.nextInt();
					
					Movie m = new Movie(id, name, actor, actress, rdate, language, type, pid);
					MovieDao md = new MovieDao();
					md.InsertMovie(m);
					break;
					
					
			case 2: 
				MovieDao mdd = new MovieDao();
				List<Movie> li = mdd.getMovieDetails();
				for(Movie pi:li) {
					System.out.println(pi);
				}
				break;
				
			case 3:
				System.out.println("Enter movie id to delete");
				int del = sc.nextInt();
				MovieDao po = new MovieDao();
				po.delete(del);
				break;
				
			case 4:
				System.out.println("Enter details to be updated");
				System.out.println("1.Movieid,2.Moviename,3.Actor,4.Actress,5.Releasedate,6.Language,7.Movietype,8.Productionid");
				String up=sc.next();
				MovieDao po1 = new MovieDao();
				po1.update(up);
				break;
				
			case 5:
				System.out.println("Will perform join");
				MovieDao po2 = new MovieDao();
				po2.viewFull();
				break;
				
			case 6:
				break;
				
			}
			
		}

	}

}
