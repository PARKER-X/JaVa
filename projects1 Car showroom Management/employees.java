public class Employee extends showroom implements utility{
    // Attributes
    String emp_id;
    String emp_name;
    String emp_department;
    int emp_age;

    // Functions
    @override
    employee.get_details(){
        System.out.println("ID:"+emp_id);
        System.out.println("Name:"+emp_name);
        System.out.println("Department:"+emp_department);
        System.out.println("Age:"+emp_age);
    }
    
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();


    }

}