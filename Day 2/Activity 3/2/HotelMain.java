import java.util.Scanner;

class HotelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Romm");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");
		
		int n = sc.nextInt();
		
		if(n==1) {
			System.out.println("Hotel Name");
			String hotelName = sc.next();
			
			System.out.println("Room Square Feet Area");
			int numberOfSqFeet = sc.nextInt();
			
			System.out.println("Room has TV: true/false");
			boolean hasTv = sc.next() != null;
			
			System.out.println("Room has Wifi: true/false");
			boolean hasWifi = sc.next() != null;
			
			DeluxeRoom d = new DeluxeRoom(hotelName, numberOfSqFeet, hasTv, hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.calculateTariff(rate);
			
			System.out.print("Room tariff per day is:"+" "+tariff);
		}
		
		else if(n == 2) {
			System.out.println("Hotel Name");
			String hotelName = sc.nextLine();
			
			System.out.println("Room Square Feet Area");
			int numberOfSqFeet = sc.nextInt();
			
			System.out.println("Room has TV: true/false");
			boolean hasTv = sc.next() != null;
			
			System.out.println("Room has Wifi: true/false");
			boolean hasWifi = sc.next() != null;
			
			DeluxeACRoom d = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTv, hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.calculateTariff(rate);
			
			System.out.print("Room tariff per day is:"+" "+tariff);
		}
		
		else {
			System.out.println("Hotel Name");
			String hotelName = sc.nextLine();
			
			System.out.println("Room Square Feet Area");
			int numberOfSqFeet = sc.nextInt();
			
			System.out.println("Room has TV: true/false");
			boolean hasTv = sc.next() != null;
			
			System.out.println("Room has Wifi: true/false");
			boolean hasWifi = sc.next() != null;
			
			SuiteACRoom d = new SuiteACRoom(hotelName, numberOfSqFeet, hasTv, hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.calculateTariff(rate);
			
			System.out.print("Room tariff per day is:"+" "+tariff);
		}
		sc.close();
	}

}
