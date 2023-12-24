class Employee {
    // Propeties
    String name;
    int age;
    String job;
    int salary;

    // Functions
    public void getDetails(){
        System.out.println("The Details of the employee is: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("job: " + this.job);
        System.out.println("salary: " + this.salary);
    }

    public void getSalary(){
        System.out.println("Salary: " + this.salary);
    }

    public void setName(String Name){
        this.name = Name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Ironman";
        emp1.job = "Software Developer";
        emp1.age = 21;
        emp1.salary = 1000000000;
        
        emp1.getDetails();
        emp1.getSalary();
        emp1.setName("Ironman!");
        emp1.getDetails();

    }
}
