package exceptionex;

import java.util.Scanner;

class exceptionAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player name");
		String name = sc.next();
		
		System.out.println("Enter player age");
		int age = sc.nextInt();
		
		try {
			if(age > 19) {
				System.out.println("Player name:"+" "+name);
				System.out.println("Player age"+" "+age);
			}
			else if(age < 19) {
				throw new customException();
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
