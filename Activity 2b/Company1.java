import java.util.Scanner;

class Company {
    private String name;
    private String employees;
    private String teamlead;

    public String getName() {
        return name;
    }

    public String getEmployees() {
        return employees;
    }

    public String getTeamlead() {
        return teamlead;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmployees(String newEmployees) {
        this.employees = newEmployees;
    }

    public void setTeamlead(String newTeamlead) {
        this.teamlead = newTeamlead;
    }
}

class CompanyMain {
    public static void main(String[] args) {

        Company c = new Company();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter company name:");
        String name = sc.nextLine();

        System.out.println("Enter company Employees:");
        String employees = sc.nextLine();

        System.out.println("Enter Team Lead");
        String teamlead = sc.nextLine();

        c.setName(name);
        c.setEmployees(employees);
        c.setTeamlead(teamlead);

        String str[] = employees.split(",");
        for (int i = 0; i < str.length; i++) {
            if (teamlead.equals(str[i])) {
                c.setTeamlead(teamlead);
                System.out.println("Name:" + "" + c.getName());
                System.out.println("Employees:" + "" + c.getEmployees());
                System.out.println("Lead:" + " " + c.getTeamlead());
                break;
            } else if (!teamlead.equals(str[i])) {
                System.out.println("Invalid Output");
            }
        }

    }
}
