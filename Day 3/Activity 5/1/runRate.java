package exceptionex;
import java.io.*;

class runRate {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int curRunRate;
		
		System.out.println("Enter the total Runs Scored");
		int score = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the total over faced");
		int over = Integer.parseInt(br.readLine());
		
		try {
			curRunRate = score / over;
			System.out.print("Current RunRate is:"+" "+curRunRate);
		}
		
		catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException");
		}
		
		catch (NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		
		
	}

}
