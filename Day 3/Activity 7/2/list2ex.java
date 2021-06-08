package listex;

import java.util.*;
class list2ex {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		String team1 = sc.nextLine();
		String team2 = sc.nextLine();
		String team3 = sc.nextLine();
		String team4 = sc.nextLine();
		String team5 = sc.nextLine();
		
		al.add(team1);
		al.add(team2);
		al.add(team3);
		al.add(team4);
		al.add(team5);
		
		System.out.println(al);
		
		System.out.println("Enter the position to be swapped");
		int n = sc.nextInt();
		
		Collections.swap(al, 0, n);
		System.out.println(al);
		
	}
}
