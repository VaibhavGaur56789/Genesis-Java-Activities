class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;

	
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 15;
		
	}
	
	public int getRatePerSqFeet() {
		if(hasWifi) 
		return ratePerSqFeet + 2;
		else
			return ratePerSqFeet;
	}
	
}
