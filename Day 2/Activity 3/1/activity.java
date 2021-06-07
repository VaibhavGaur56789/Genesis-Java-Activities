class Vehicle  {
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected int fuelCapacity;
    protected int cc;

    public String getMake() {
        return make;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCc() {
        return cc;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setVehicleNumber(String newVehicleNumber) {
        this.vehicleNumber = newVehicleNumber;
    }

    public void setFuelType(String newfuelType) {
        this.fuelType = newfuelType;
    }

    public void setFuelCapacity(int newFuelCapacity) {
        this.fuelCapacity = newFuelCapacity;
    }

    public void setCc(int newCc) {
        this.cc = newCc;
    }

    Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;

    }

    public Vehicle() {

    }

    public void displayMake() {
        System.out.println("Display make:" +""+ this.make);
    }

    public void displayBasicInfo() {
        System.out.println("Vehicle Number"+" "+vehicleNumber);
        System.out.println("Fuel Type"+" "+fuelType);
        System.out.println("Fuel Capacity"+" "+fuelCapacity);
        System.out.println("cc"+" "+cc);
    }

    public void displayDetailInfo() {
    }
}
