//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

class Main1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String matchType, scores;
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		
		System.out.println("Enter the score");
		scores = sc.nextLine();
		
		SortScore s = new SortScore(matchType, scores);
		s.setScore();
		
		 s.start();

	     try {  
	    	 s.join();  
	     }
	     catch(Exception e)
	     {   
	    	 System.out.println(e);
	     }
	     
	     System.out.println("Enter the match");
	     matchType = sc.nextLine();
			
	     System.out.println("Enter the score");
	     scores = sc.nextLine();
			
	     SortScore s1 = new SortScore(matchType, scores);
	     s1.setScore();
			
	     s1.start();

		 try {  
		 s1.join();  
		 }
		 catch(Exception e)
		 {   
			 System.out.println(e);
		 } 
		
		 System.out.println("Enter the match");
		 matchType = sc.nextLine();
			
		 System.out.println("Enter the score");
		 scores = sc.nextLine();
			
		 SortScore s2 = new SortScore(matchType, scores);
		 s2.setScore();
			
		 s2.start();

		 try {  
			 s2.join();  
		  }
		 catch(Exception e)
		 {   
			 System.out.println(e);
		 }
		 
		 System.out.println("Match:"+s.matchType);
	        System.out.println(Arrays.toString(s.getScore()));

	        System.out.println("Match:"+s1.matchType);
	        System.out.println(Arrays.toString(s1.getScore()));

	        System.out.println("Match:"+s2.matchType);
	        System.out.println(Arrays.toString(s2.getScore()));

	    }
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	