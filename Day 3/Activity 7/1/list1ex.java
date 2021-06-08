package listex;

import java.util.*;
class list1ex {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter player details");
		
		System.out.println("Enter player name");
		String name = sc.next();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter country");
		String country = sc.next();
		
		al.add(name);
		al.add(age);
		al.add(country);
		
		System.out.println(al);
		
		System.out.println("Enter skill");
		String skill = sc.next();
		
		System.out.println(skill);
		
		System.out.println("Enter position to add skill");
		int pos = sc.nextInt();
		
		al.set(pos, skill);
		
		System.out.println(al);
		
		System.out.println("Enter position of the detail to be removed");
		int pos2 = sc.nextInt();
		
		al.remove(pos2);
		
		System.out.println(al);
		
	}
}
