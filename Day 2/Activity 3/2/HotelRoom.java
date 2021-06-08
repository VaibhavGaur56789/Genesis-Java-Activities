class HotelRoom {
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTv;
	public boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int ratePerSqFeet) {
		return numberOfSqFeet * ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		
		return 0;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTv() {
		return hasTv;
	}

	public void setHasTv(boolean hasTv) {
		this.hasTv = hasTv;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	
	
	
}
