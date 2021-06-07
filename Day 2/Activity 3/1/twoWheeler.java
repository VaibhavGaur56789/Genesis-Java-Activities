class twoWheeler extends Vehicle {
    private Boolean kickStartAvailabe;

    public void setKickStartAvailabe(boolean newKickStartAvailabe) {
        this.kickStartAvailabe = newKickStartAvailabe;
    }

    twoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.kickStartAvailabe = kickStartAvailable;
    }

    public void displayDetailInfo() {
      /*  System.out.println("Vehicle Number" + " " + vehicleNumber);
        System.out.println("Fuel Type" + " " + fuelType);
        System.out.println("Fuel Capacity" + " " + fuelCapacity);
        System.out.println("cc" + " " + cc);*/
        System.out.println("Kick Start" + " " + kickStartAvailabe);
    }
}



