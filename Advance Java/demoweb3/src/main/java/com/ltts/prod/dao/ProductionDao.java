package com.ltts.prod.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.prod.configure.MyConfig;
import com.ltts.prod.model.Production;

import java.io.IOException;
import java.sql.*;

public class ProductionDao {
	public boolean InsertProductionServlet(Production p) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = MyConfig.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into production values(?,?,?,?,?)");
		ps.setInt(1,p.getProductionid());
		ps.setString(2,p.getProductionname());
		ps.setString(3, p.getAddress());
		ps.setString(4, p.getDateofstart());
		ps.setString(5, p.getOwnername());
		
		boolean b = ps.execute();
		System.out.println("Value Inserted");
		return false; 
	}
	
	public List<Production> getProductionDetails() throws Exception {
		List<Production> prod = new ArrayList<Production>();
		Connection con = MyConfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from production");
		while(rs.next()) {
			prod.add(new Production(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));	
		}
		return prod;
	}
	
	public Production getProductionById(int id) throws Exception {
		Production p = null;
		Connection con = MyConfig.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from production where productionid="+id);
		while(rs.next()) {
			p=new Production(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			
		}
		return p;
	}
	public int update(int no, String name, String address, String date, String owner) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("zxvzxv");
		Connection con=MyConfig.getConnection();
		System.out.println("conn");
		PreparedStatement stmt=con.prepareStatement("update productions set productionid=?,productionname=?,address=?,dateofstart=?,ownername=? where productionid=?");
		stmt.setInt(1,no);  
		stmt.setString(2, name);
		stmt.setString(3, address); 
		stmt.setString(4, date);
		stmt.setString(5, owner);
		int i=stmt.executeUpdate();  
		System.out.println("Records updated");  
		return i;
	}


	
}