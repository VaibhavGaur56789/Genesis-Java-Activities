class DeluxeRoom extends HotelRoom {
	
	private int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		ratePerSqFeet = 10;
	}

	public int getRatePerSqFeet() {
		if(hasWifi)
		return ratePerSqFeet+2;
		else
			return ratePerSqFeet;
	}

}
