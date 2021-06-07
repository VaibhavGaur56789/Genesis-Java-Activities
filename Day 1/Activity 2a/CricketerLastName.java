import java.util.*;

class CricketerLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstPlayerName = sc.nextLine();
        String secondPlayerName = sc.nextLine();

        int space1 = firstPlayerName.indexOf(' ');
        int space2 = secondPlayerName.indexOf(' ');

        String lastName1 = firstPlayerName.substring(space1+1);
        String lastName2 = secondPlayerName.substring(space2+1);

        if(lastName1.equals(lastName2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
