class DeluxeACRoom extends DeluxeRoom {
	protected int ratePerSqFeet;


	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		ratePerSqFeet = 12;
		
	}
	
}
