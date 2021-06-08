package listex;

import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
class list3ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the top 5 scorer of ipl season 13");
		
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
		String name4 = sc.nextLine();
		String name5 = sc.nextLine();
		
		System.out.println("Enter the top scorer of ipl season 12");
		
		String namee1 = sc.nextLine();
		String namee2 = sc.nextLine();
		String namee3 = sc.nextLine();
		String namee4 = sc.nextLine();
		String namee5 = sc.nextLine();
		
		ArrayList listOne = new ArrayList(Arrays.asList(name1, name2, name3, name4, name5));
		ArrayList listTwo = new ArrayList(Arrays.asList(namee1, namee2, namee3, namee4, namee5));
		
		System.out.println(listOne);
		System.out.println(listTwo);
		
		listOne.retainAll(listTwo);
		System.out.println();
		System.out.println();
		System.out.println("Consistent run scorers are:");
		System.out.println(listOne);
	}

}
