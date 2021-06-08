package listex;

import java.util.ArrayList;
import java.util.Scanner;
class list4ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>(n);
		
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
			
		}
		System.out.println(al);
		
		int countFifty = 0;
		int countHundred = 0;
		for(int j=0; j<al.size(); j++) {
			if(al.get(j) >= 50 && al.get(j) < 100) {
				countFifty++;
				//System.out.println(countFifty);
			}
			//System.out.println(countFifty);
			
			if(al.get(j) >= 100) {
				countHundred++;
			}
			//System.out.println(countFifty);
			//System.out.println(countHundred);
		}
		System.out.println(countFifty);
		System.out.println(countHundred);
		
			
		}
	}

