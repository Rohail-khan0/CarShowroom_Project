import java.util.Scanner;
import java.util.UUID;

public class Employee extends showRoom implements utility {
    String employeeID;
    String employeeName;
    int employeeAge;
    String employeeDepartment;

    @Override
    public void getDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Department: " + employeeDepartment);
        System.out.println("Showroom Name: " + showRoomName);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employeeID = String.valueOf(uuid);
        System.out.println("============================= Enter Employee Details =============================");
        System.out.println("Employee Name: ");
        employeeName = sc.nextLine();
        System.out.println("Employee Age: ");
        employeeAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Employee Department: ");
        employeeDepartment = sc.nextLine();
        System.out.println("Showroom Name: ");
        showRoomName = sc.nextLine();

    }

}

