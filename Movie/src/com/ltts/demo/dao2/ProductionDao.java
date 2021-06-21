package com.ltts.demo.dao2;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.ltts.demo.configure2.MyConfig2;
import com.ltts.demo.model2.Production;



public class ProductionDao {
	public boolean InsertProduction(Production p) throws Exception {
		Connection con = MyConfig2.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into production value(?,?,?,?,?)");
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
		List<Production> pro = new ArrayList<Production>();
		Connection con = MyConfig2.getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from production");
		while(rs.next()) {
			pro.add(new Production(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));	
		}
		return pro;
	}
	
	public void delete(int data) throws Exception {
		Connection con = MyConfig2.getConnection();
		PreparedStatement stmt = con.prepareStatement("delete from production where productionid = ?");
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
				put(1,"productionid");
				put(2,"productionname");
				put(3,"address");
				put(4,"dateofstart");
				put(5,"ownername");
			}
		};
		
		Connection con=MyConfig2.getConnection();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the ProductionID No");
		int val=ob.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			switch(arr[i])
			{
			case "productionid":
				PreparedStatement stmt8=con.prepareStatement("update production set productionid=? where productionid=?");
				System.out.println("Enter the New ProductionID");
				stmt8.setInt(1,ob.nextInt());
				stmt8.setInt(2,val);
				stmt8.executeUpdate();  
				break;
				
			case "productionname":
				PreparedStatement stmt1=con.prepareStatement("update production set productionname=? where productionid=?");
				System.out.println("Enter the New ProductionName");
				stmt1.setString(1,ob.next());
				stmt1.setInt(2,val);
				stmt1.executeUpdate();
				break;
				
			case "address":
				PreparedStatement stmt2=con.prepareStatement("update production set address=? where productionid=?");
				System.out.println("Enter the new address");
				stmt2.setString(1,ob.next());
				stmt2.setInt(2,val);
				stmt2.executeUpdate();
				break;
				
			case "dateofstart":
				PreparedStatement stmt3=con.prepareStatement("update production set dateofstart=? where productionid=?");
				System.out.println("Enter the new date of start");
				stmt3.setString(1,ob.next());
				stmt3.setInt(2,val);
				stmt3.executeUpdate();
				break;
				
			case "ownername":
				PreparedStatement stmt4=con.prepareStatement("update production set ownername=? where productionid=?");
				System.out.println("Enter the new ownername");
				stmt4.setString(1,ob.next());
				stmt4.setInt(2,val);
				stmt4.executeUpdate();
				break;
			
			default:
				break;
			}
		}
		System.out.println("Records updated"); 
	}

		
}