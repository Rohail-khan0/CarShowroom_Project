import java.util.Scanner;

public class showRoom implements utility {
    String showRoomName;
    String showRoomAddress;
    int employeess;
    int carsInStock = 0;
    String managerName;


    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + showRoomName);
        System.out.println("Showroom Address: " + showRoomAddress);
        System.out.println("No of Employees: " + employeess);
        System.out.println("Cars in Stock: " + carsInStock);
        System.out.println("Manager Name: " + managerName);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================= Enter Showroom Details =============================");
        System.out.println();
        System.out.println("Showroom Name");
        showRoomName = sc.nextLine();
        System.out.println("Showroom Address");
        showRoomAddress = sc.nextLine();
        System.out.println("No of Employees");
        employeess = sc.nextInt();
        System.out.println("Total Cars in Stock");
        carsInStock = sc.nextInt();
        System.out.println("Manager Name");
        managerName = sc.nextLine();
    }
}

