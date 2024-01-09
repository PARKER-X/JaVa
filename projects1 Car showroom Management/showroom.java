import java.util.Scanner;

public class showroom implements utility{
    // Attributes
    String showroom_name;
    String showroom_address;
    String showroom_manager;
    int stock_number= 0;
    String total_employees;

    // Functions
    @override
    public void getDetails(){
        System.out.println("Showroom Name " + showroom_name);
        System.out.println("Showroom address " + showroom_address);
        System.out.println("Showroom Manager " + showroom_manager);
        System.out.println("Showroom car stocks " + stock_number);
        System.out.println("Showroom total employees " + total_employees);

    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" --------------------------- Enter the Showroom Details ---------------------------");
        System.out.println();
        System.out.println("Enter the showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.println("Enter the showroom address: ");
        showroom_address = sc.nextLine();
        System.out.println("Enter the name of showroom manager: ");
        showroom_manager = sc.nextLine();
        System.out.println("Enter the number of stocks of car: ");
        stock_number = sc.nextInt();
        System.out.println("Enter the number of total employees in the showroom");
        total_employees = sc.nextInt();
    }
}
