import java.util.Scanner;

class Employee {
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

class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter address");
        String address = sc.nextLine();

        System.out.println("Enter mobile");
        String mobile = sc.next();

        emp.setName(name);
        emp.setAddress(address);
        emp.setMobile(mobile);

        System.out.println("Employee Details");
        System.out.println("Name:"+""+emp.getName());
        System.out.println("Address:"+""+emp.getAddress());
        System.out.println("Mobile:"+""+emp.getMobile());
    }
}
