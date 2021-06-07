import java.util.Scanner;

 class VehicleMain {
    public static void main(String[] args)
    {
        int ch,ch2;
        String make,vehiclenumber,fueltype;
        int fuelcapacity,cc;
        int noofdoors;
        String audiosystem;
        boolean kickstartavailable;
        System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
        Scanner sc = new Scanner(System.in);
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Vehicle Make:");
            make=sc.next();
            System.out.println("Vehicle Number:");
            vehiclenumber=sc.next();
            System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
            ch2=sc.nextInt();
            if(ch2==1)
                fueltype="Petrol";
            else
                fueltype="Diesel";
            System.out.println("Fuel Capacity:");
            fuelcapacity=sc.nextInt();
            System.out.println("Engine CC:");
            cc=sc.nextInt();
            System.out.println("Number of doors:");
            noofdoors=sc.nextInt();
            System.out.println("Audio System:");
            audiosystem=sc.next();
            fourWheeler f=new fourWheeler( make, vehiclenumber,  fueltype,  fuelcapacity,  cc, audiosystem, noofdoors);
            f.displayMake();
            f.displayBasicInfo();
            f.displayDetailInfo();
        }
        else if(ch==2)
        {
            System.out.println("Vehicle Make:");
            make=sc.next();
            System.out.println("Vehicle Number:");
            vehiclenumber=sc.next();
            System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
            ch2=sc.nextInt();
            if(ch2==1)
                fueltype="Petrol";
            else
                fueltype="Diesel";
            System.out.println("Fuel Capacity:");
            fuelcapacity=sc.nextInt();
            System.out.println("Engine CC:");
            cc=sc.nextInt();
            System.out.println("Kick start Availability(yes or no):");
            kickstartavailable=sc.next() != null;
            twoWheeler t=new twoWheeler( make, vehiclenumber,  fueltype,  fuelcapacity,  cc,kickstartavailable );
            t.displayMake();
            t.displayBasicInfo();
            t.displayDetailInfo();
        }
    }

}