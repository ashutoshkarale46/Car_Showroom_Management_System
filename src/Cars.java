import java.util.Scanner;

public class Cars extends Showroom implements utility
{
    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void get_details()
    {
        System.out.println("Name:"+carName);
        System.out.println("Color:"+carColor);
        System.out.println("Fuel Type:"+carFuelType);
        System.out.println("Price:"+carPrice);
        System.out.println("Car Type:"+carType);
        System.out.println("Transmission:"+carTransmission);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        carName = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        carColor = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        carFuelType = sc.nextLine();
        System.out.print("CAR PRICE: ");
        carPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        totalCarsInStock++;
    }
}
