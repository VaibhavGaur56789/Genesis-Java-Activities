import java.util.Scanner;

class Customer {
    private String name;
    private String address;
    private String mobile;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return  address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setMobile(String newMobile) {
        this.mobile = newMobile;
    }

}

class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details");
        String details = sc.nextLine();

        String[] str = details.split(",");

        c.setName(str[0]);
        c.setAddress(str[1]);
        c.setMobile(str[2]);

        System.out.println("Name:"+" "+ c.getName());
        System.out.println("Address:"+" "+ c.getAddress());
        System.out.println("Mobile:"+" "+ c.getMobile());

    }
}
