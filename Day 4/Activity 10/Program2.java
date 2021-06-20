import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Program2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);  
	     ArrayList<team> s=new ArrayList<team>();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Number of teams:");
	     int n=sc.nextInt();
	     String[] name=new String[n];
	     long[] no=new long[n];
	     
         for(int i=0,j=1;i<n;i++,j++)
         {
        	 System.out.println("Enter team "+j+" Detail:");
        	 System.out.println("Enter Name:");
        	 name[i]=br.readLine();
        	 System.out.println("Enter Number of matches played:");
        	 no[i]=sc.nextLong();
        	 s.add(new team(name[i], no[i]));
        	
         }
         System.out.println("Team List after sorting by number of matches played:");
  
       
        Collections.sort(s, new TeamComparator());
        for (team t : s) {
            System.out.println(t.name + " -- " + t.numberofmatches
                               );
        }
        sc.close();
    }
}