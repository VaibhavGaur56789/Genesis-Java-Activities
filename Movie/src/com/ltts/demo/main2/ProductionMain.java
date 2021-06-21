package com.ltts.demo.main2;

import java.util.List;
import java.util.Scanner;

import com.ltts.demo.dao2.ProductionDao;
import com.ltts.demo.model2.Production;


public class ProductionMain {

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
			case 1: System.out.println("Enter production ID");
					int id = sc.nextInt();
					System.out.println("Enter production name");
					String name = sc.next();
					System.out.println("Enter address");
					String address = sc.next();
					System.out.println("Enter date of start");
					String dateofstart = sc.next();
					System.out.println("Enter owner name");
					String owner = sc.next();
					
					Production p = new Production(id, name, address, dateofstart, owner);
					ProductionDao pd = new ProductionDao();
					pd.InsertProduction(p);
					break;
					
					
			case 2: 
				ProductionDao pdd = new ProductionDao();
				List<Production> li = pdd.getProductionDetails();
				for(Production pi:li) {
					System.out.println(pi);
				}
				break;
				
			case 3:
				System.out.println("Enter production id to delete");
				int del = sc.nextInt();
				ProductionDao po = new ProductionDao();
				po.delete(del);
				break;
				
			case 4:
				System.out.println("Enter details to be updated");
				System.out.println("1.Productionid,2.Productionname,3.Address,4.DateofStart,5.Ownername");
				String up=sc.next();
				ProductionDao po1 = new ProductionDao();
				po1.update(up);
				break;
				
			}
			
		}

	}

}
