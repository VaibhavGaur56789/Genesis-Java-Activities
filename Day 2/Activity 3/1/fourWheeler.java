class fourWheeler extends Vehicle {
    private String audioSystem;
    private int numberOfDoors;

    public String getAudioSystem() {
        return audioSystem;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setAudioSystem(String newAudioSystem) {
        this.audioSystem = newAudioSystem;
    }

    public void setNumberOfDoors(int newNumberOfDoors) {
        this.numberOfDoors = newNumberOfDoors;
    }


    fourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem = audioSystem;
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetailInfo() {
       /* System.out.println("Vehicle Number"+" "+vehicleNumber);
        System.out.println("Fuel Type"+" "+fuelType);
        System.out.println("Fuel Capacity"+" "+fuelCapacity);
        System.out.println("cc"+" "+cc);
        System.out.println("Audio System"+" "+audioSystem); */
        System.out.println("Number of doors"+" "+numberOfDoors);
    }
}
