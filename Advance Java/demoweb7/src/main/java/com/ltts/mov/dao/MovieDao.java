package com.ltts.mov.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.mov.configure.MyConfig;
import com.ltts.mov.model.Movie;



public class MovieDao {
	public boolean InsertMovie(Movie m) throws Exception {
		Connection con = MyConfig.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into movie values(?,?,?,?,?,?,?,?)");
		ps.setInt(1,m.getMovieid());
		ps.setString(2,m.getMoviename());
		ps.setString(3, m.getActor());
		ps.setString(4, m.getActress());
		ps.setString(5, m.getReleasedate());
		ps.setString(6, m.getLanguage());
		ps.setString(7, m.getMovietype());
		ps.setInt(8, m.getProductionid());
		
		boolean b = ps.execute();
		System.out.println("Value Inserted");
		return false;
	}
	
	public List<Movie> getMovieDetails() throws Exception {
		List<Movie> movie = new ArrayList<Movie>();
		Connection con = MyConfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from movie");
		while(rs.next()) {
			movie.add(new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));	
		}
		return movie;
	}
	public Movie getMovieById(int id) throws Exception {
		Movie m = null;
		Connection con = MyConfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from movie where movieid="+id);
		while(rs.next()) {
			m=new Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
			
		}
		return m;
	}
	public int update(int id, String name, String actor, String actress, String rdate, String lang, String type, int pid) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("zxvzxv");
		Connection con=MyConfig.getConnection();
		System.out.println("conn");
		PreparedStatement stmt=con.prepareStatement("update productions set productionid=?,productionname=?,address=?,dateofstart=?,ownername=? where productionid=?");
		stmt.setInt(1,id);  
		stmt.setString(2, name);
		stmt.setString(3, actor); 
		stmt.setString(4, actress);
		stmt.setString(5, rdate);
		stmt.setString(6, lang);
		stmt.setString(7, type);
		stmt.setInt(8, pid);
		int i=stmt.executeUpdate();  
		System.out.println("Records updated");  
		return i;
	}


	
}
