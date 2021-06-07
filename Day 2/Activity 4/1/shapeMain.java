import java.util.Scanner;

public class shapeMain {

	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the shape:");
		String sh = sc.nextLine();
		
		if(sh.equals("Circle")) {
			System.out.println("Enter the radius");
			int cvalue = sc.nextInt();
			
			c.calculateArea(cvalue);
		}
		else if(sh.equals("Square")) {
			System.out.println("Enter the side");
			int svalue = sc.nextInt();
			s.calculateArea(svalue);
			
		}
		

	}

}
