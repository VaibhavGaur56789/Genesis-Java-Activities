import java.util.HashSet;
import java.util.Scanner;
class activity1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashSet<String> h = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			h.add(sc.next());
		}
		
		System.out.println(h);
		
		int count=0;
		for(int j=0; j<h.size(); j++) {
			count++;
		}
		System.out.println(count);
	}
}
