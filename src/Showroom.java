import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements utility
{
    String showroomName;
    String showroomAddress;
    int totalEmployee;
    int totalCarsInStock = 0;
    String managerName;

    @Override
    public void get_details()
    {
        System.out.println("Showroom Name:"+showroomName);
        System.out.println("Showroom Address:"+showroomAddress);
        System.out.println("Manager Name:"+managerName);
        System.out.println("Total Employee:"+totalEmployee);
        System.out.println("Total Cars in Stock:"+totalCarsInStock);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroomAddress = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        managerName = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        totalEmployee = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        totalCarsInStock = sc.nextInt();
    }
}
