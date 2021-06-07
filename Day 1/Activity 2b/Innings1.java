import java.util.Scanner;

class Innings {
    private String teamname;
    private String inningsname;
    private int runs;

    public String getName() {
        return teamname;
    }

    public String getInningsname() {
        return inningsname;
    }

    public int getRuns() {
        return runs;
    }

    public void setTeamName(String newTeamName) {
        this.teamname = newTeamName;
    }

    public void setInningsname(String newInningsname) {
        this.inningsname = newInningsname;
    }

    public void setRuns(int newRuns) {
        this.runs = newRuns;
    }

    public void displayInningsDetail(String innings) {

        if (innings.equals("First")) {
            System.out.println("Name:" + "" + teamname);
            System.out.println("Scored:" + "" + runs);
            System.out.println("Need"+" "+(runs+1)+" "+"to win");
        }
        else if(innings.equals("Second")) {
            System.out.println("Name:"+""+teamname);
            System.out.println("Score"+""+runs);
            System.out.println("Match ended");
        }
    }
}


class InningsMain {
    public static void main(String[] args) {
        Innings in = new Innings();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter team name:");
        String teamname = sc.next();

        System.out.println("Enter session");
        String innings = sc.next();

        System.out.println("Enter runs");
        int runs = sc.nextInt();

        in.setTeamName(teamname);
        in.setInningsname(innings);
        in.setRuns(runs);

        in.displayInningsDetail(innings);
        
    }
}
