import java.util.*;

class Search {


	public static String findElementCount(int a[],int n, int k) {
		int count = 0;

		for(int i=0; i<n; i++) {
			if (a[i] == k) {
				count++;
			}
		}
			if (k < 0) {
				return "Invalid Input";
			}


		return String.valueOf(count);
		}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of elements to be entered");


		int n = sc.nextInt();


		System.out.println("Enter array elements");
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

			System.out.println("Element to be searched");
			int k = sc.nextInt();


			System.out.println(findElementCount(a,n, k));

	}
}
