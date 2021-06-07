import java.util.Scanner;

class Cricketer {
    public static void findCricketerId(int[] array, int size, int score) {
        if (score < 0)
            System.out.println("Invalid Score");

        for (int i = 0; i < size; i++) {
            if (array[i] > score) {
                System.out.println(array[i-1]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of elements to be inserted");

        int size = sc.nextInt();

            if (size < 0) {
                System.out.println("Invalid array size");
            }

            System.out.println("Input Cricketer id and score");
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter Score");
            int score = sc.nextInt();


        findCricketerId(array, size, score);

    }

}
