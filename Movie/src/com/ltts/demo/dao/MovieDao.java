package com.ltts.demo.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.ltts.demo.configure.MyConfig;
import com.ltts.demo.model.Movie;

public class MovieDao {
	public boolean InsertMovie(Movie m) throws Exception {
		Connection con = MyConfig.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into movie(?,?,?,?,?,?,?,?)");
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
	
	public void delete(int data) throws Exception {
		Connection con = MyConfig.getConnection();
		PreparedStatement stmt = con.prepareStatement("delete from movie where movieid = ?");
		stmt.setInt(1, data);
		int i = stmt.executeUpdate();
		if(i!=0) {
			System.out.println("Record deleted");
		}
		else {
			System.out.println("Enter valid record");
		}
	}
	
	public void update(String data) throws Exception {
		String arr[] = data.split(",");
		HashMap<Integer, String> hm = new HashMap<Integer, String>() {
			{
				put(1,"movieid");
				put(2,"moviename");
				put(3,"actor");
				put(4,"actress");
				put(5,"releasedate");
				put(6,"language");
				put(7,"movietype");
				put(8,"productionid");
			}
		};
		
		Connection con=MyConfig.getConnection();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the MovieID No");
		int val=ob.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			switch(arr[i])
			{
			case "movieid":
				PreparedStatement stmt8=con.prepareStatement("update movie set movieid=? where movieid=?");
				System.out.println("Enter the New MovieID");
				stmt8.setInt(1,ob.nextInt());
				//System.out.println("Enter the MovieID No");
				stmt8.setInt(2,val);
				stmt8.executeUpdate();  
				break;
				
			case "moviename":
				PreparedStatement stmt1=con.prepareStatement("update movie set moviename=? where movieid=?");
				System.out.println("Enter the New MovieName");
				stmt1.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt1.setInt(2,val);
				stmt1.executeUpdate();
				break;
				
			case "actor":
				PreparedStatement stmt2=con.prepareStatement("update movie set actor=? where movieid=?");
				System.out.println("Enter the new actor name");
				stmt2.setString(1,ob.next());
				stmt2.setInt(2,val);
				stmt2.executeUpdate();
				break;
				
			case "actress":
				PreparedStatement stmt3=con.prepareStatement("update movie set actress=? where movieid=?");
				System.out.println("Enter the new actress name");
				stmt3.setString(1,ob.next());
				stmt3.setInt(2,val);
				stmt3.executeUpdate();
				break;
				
			case "releasedate":
				PreparedStatement stmt4=con.prepareStatement("update movie set releasedate=? where movieid=?");
				System.out.println("Enter the new releasedate");
				stmt4.setString(1,ob.next());
				stmt4.setInt(2,val);
				stmt4.executeUpdate();
				break;
				
			case "language":
				PreparedStatement stmt5=con.prepareStatement("update movie set language=? where movieid=?");
				System.out.println("Enter the new language");
				stmt5.setString(1,ob.next());
				stmt5.setInt(2,val);
				stmt5.executeUpdate();
				break;
				
			case "movietype":
				PreparedStatement stmt6=con.prepareStatement("update movie set movietype=? where movieid=?");
				System.out.println("Enter the New Movietype");
				stmt6.setString(1,ob.next());
				stmt6.setInt(2,val);
				stmt6.executeUpdate();
				break;
				
			case "productionid":
				PreparedStatement stmt7=con.prepareStatement("update movie set productionid=? where movieid=?");
				System.out.println("Enter the new productionid");
				stmt7.setString(1,ob.next());
				stmt7.setInt(2,val);
				stmt7.executeUpdate();
				break;
			default:
				break;
			}
		}
		System.out.println("Records updated"); 
	}
	
	/*public void viewFull()throws Exception, Exception{
		
		Connection con=MyConfig.getConnection();
		 PreparedStatement stmt10=con.prepareStatement("select Productionname,Ownername,Movieid, Moviename,Heroname,Releasedate,Heroine,Language,Movietype,Lenght from movie inner join productions on movie.Productionid=productions.Productionid");
		 ResultSet rs=stmt10.executeQuery();
		 ResultSetMetaData rsmd=rs.getMetaData();  

		 while(rs.next())
		 {
			 System.out.println(rsmd.getColumnName(1)+"="+rs.getString(1)+" "+
					 rsmd.getColumnName(2)+"="+rs.getString(2)+" "+
					 rsmd.getColumnName(3)+"="+rs.getInt(3)+" "+
					 rsmd.getColumnName(4)+"="+rs.getString(4)+" "+
					 rsmd.getColumnName(5)+"="+rs.getString(5)+" "+
					 rsmd.getColumnName(6)+"="+rs.getDate(6)+" "+
					 rsmd.getColumnName(7)+"="+rs.getString(7)+" "+
					 rsmd.getColumnName(8)+"="+rs.getString(8)+" "+
					 rsmd.getColumnName(9)+"="+rs.getString(9)+" "+
					 rsmd.getColumnName(10)+"="+rs.getInt(10));
		 }
		 
	}*/

		
}

