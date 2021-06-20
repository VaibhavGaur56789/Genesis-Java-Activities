import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

class DisplayTeamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashSet<Player> h = new HashSet<>();
		
		for(int i=0; i<n; i++) {
		h.add(new Player(sc.next()));
	}
		HashSet<Team> hs = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			hs.add(new Team(sc.next()));
		}
		
		
	}
	
	
}
