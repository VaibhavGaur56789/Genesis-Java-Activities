import java.util.Scanner;
public class MatchMain {

	public static void main(String[] args) {
		
		ODIMatch odi = new ODIMatch();
		T20Match t = new T20Match();
		TestMatch test = new TestMatch();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the match format:");
		System.out.println("1. Odi");
		System.out.println("2. T20");
		System.out.println("3. Test");
		
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("Enter the current score");
			double score = sc.nextDouble();
			
			System.out.println("Enter the current over");
			int balls = sc.nextInt();
			
			System.out.println("Enter the target score");
			int target = sc.nextInt();
			
			System.out.println("Need"+" "+(target - score)+" "+"runs in"+" "+((50 - balls)*6)+" "+"balls");
		
			double reqRunrate = score/balls;
			odi.display(reqRunrate, balls);
		}
		
		else if(n == 2) {
			System.out.println("Enter the current score");
			double score = sc.nextDouble();
			
			System.out.println("Enter the current over");
			int balls = sc.nextInt();
			
			System.out.println("Enter the target score");
			int target = sc.nextInt();
			
			System.out.println("Need"+" "+(target - score)+" "+"runs in"+" "+((20 - balls)*6)+" "+"balls");
		
			double reqRunrate = score/balls;
			t.display(reqRunrate, balls);
		}
		
		else if(n == 3) {
			System.out.println("Enter the current score");
			double score = sc.nextDouble();
			
			System.out.println("Enter the current over");
			int balls = sc.nextInt();
			
			System.out.println("Enter the target score");
			int target = sc.nextInt();
			
			System.out.println("Need"+" "+(target - score)+" "+"runs in"+" "+((20 - balls)*6)+" "+"balls");
		
			double reqRunrate = score/balls;
			test.display(reqRunrate, balls);
		}
		
		
	}

}
