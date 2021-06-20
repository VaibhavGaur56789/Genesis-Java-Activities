import java.util.Arrays;
import java.util.Scanner;

class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matchType, scores;
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		
		CalculateScore c = new CalculateScore(matchType, scores);
		c.setScore();
		Thread t1 = new Thread(c);
		//t1.start();
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		
		CalculateScore c1 = new CalculateScore(matchType, scores);
		c1.setScore();
		Thread t2 = new Thread(c1);
		//t2.start();
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		
		CalculateScore c2 = new CalculateScore(matchType, scores);
		c2.setScore();
		Thread t3 = new Thread(c2);
		//t3.start();
		
		System.out.println("Match:"+c.matchType);
		t1.start();
		System.out.println("Match:"+c1.matchType);
		t2.start();
		System.out.println("Match:"+c2.matchType);
		t3.start();
        
		
	}
}
