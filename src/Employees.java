import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility
{
    String empID;
    String empName;
    int empAge;
    String empDept;

    @Override
    public void get_details()
    {
        System.out.println("ID:"+empID);
        System.out.println("Name:"+empName);
        System.out.println("Age:"+empAge);
        System.out.println("Department:"+empDept);
        System.out.println("Showroom Name"+showroomName);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empID = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        empAge = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        empDept = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }
}
