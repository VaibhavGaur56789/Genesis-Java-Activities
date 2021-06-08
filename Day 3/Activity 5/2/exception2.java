package exceptionex;

import java.util.Scanner;
class exception2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter the number of overs");
		int over = sc.nextInt();
		
		System.out.println("Enter number of run for each over");
		int[] run = new int[over];
		
		
		for(int overNumber=0; overNumber<over; overNumber++) {
			run[overNumber] = sc.nextInt();
			
		}
		
		System.out.println("Enter the over number");
		int overnum = sc.nextInt();
		
		System.out.println(run[overnum-1]);
		
		}
		
		catch (NegativeArraySizeException e) {
			System.out.print("java.lang.NegativeArraySizeException");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
		sc.close();
	}
}
