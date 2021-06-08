package exceptionex;

import java.util.Scanner;
class teamException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter expexted winner team of ipl season 13");
		String team = sc.nextLine();
		
		System.out.println("Enter expected runner up team of ipl season 13");
		String runnerTeam = sc.nextLine();
		
		try {
			if(team.equalsIgnoreCase("Chennai Super Kings") || team.equalsIgnoreCase("Sun Risers Hyderabad") || team.equalsIgnoreCase("Delhi Capitals") || team.equalsIgnoreCase("Kings XI Punjab") || team.equalsIgnoreCase("Kolkata Knight Riders") || team.equalsIgnoreCase("Mumbai Indians") || team.equalsIgnoreCase("Rajasthan Royals")) {
				System.out.println("Expected ipl 13 winner:"+" "+team);
			} 
			else {
				throw new teamCustomException();
			}
			if(runnerTeam.equalsIgnoreCase("Chennai Super Kings") || runnerTeam.equalsIgnoreCase("Sun Risers Hyderabad") || runnerTeam.equalsIgnoreCase("Delhi Capitals") || runnerTeam.equalsIgnoreCase("Kings XI Punjab") || runnerTeam.equalsIgnoreCase("Kolkata Knight Riders") || runnerTeam.equalsIgnoreCase("Mumbai Indians") || runnerTeam.equalsIgnoreCase("Rajasthan Royals")) {
				System.out.println("Expected ipl 13 runner up:"+" "+runnerTeam);
			}
			else {
				throw new teamCustomException();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

}

}