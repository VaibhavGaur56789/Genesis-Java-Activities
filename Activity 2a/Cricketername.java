import java.util.Scanner;

class Cricketername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        String firstLetter = firstName.substring(0,1);
        String remainingLetter = firstName.substring(1);

        firstLetter = firstLetter.toUpperCase();
        lastName = lastName.toUpperCase();

        System.out.println(firstLetter+remainingLetter+" "+lastName);
    }
}
