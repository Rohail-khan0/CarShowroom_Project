import java.util.Scanner;

public class Cars extends showRoom implements utility {
    String carName;
    int carModel;
    int price;
    String carColor;
    String carTransmission;

    @Override
    public void getDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Price: " + price);
        System.out.println("Car Colour: " + carColor);
        System.out.println("Car Transmission: " + carTransmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("============================= Enter Car Details =============================");
        System.out.println();
        System.out.println("Car Name: ");
        carName = sc.nextLine();
        System.out.println("Car Model: ");
        carModel = sc.nextInt();
        System.out.println("Car Price: ");
        price = sc.nextInt();
        sc.nextLine();
        System.out.println("Car Colour: ");
        carColor = sc.nextLine();
        System.out.println("Car Transmission: ");
        carTransmission = sc.nextLine();
        carsInStock++;
    }


}
