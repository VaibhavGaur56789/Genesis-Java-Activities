import java.util.Scanner;
import java.util.TreeSet;

class activity2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		TreeSet<String> t = new TreeSet<>();
		
		sc.nextLine();
		for(int i=0; i<n; i++) {
			
			t.add(sc.nextLine());
		}
		
		System.out.println(t);
	}
}
