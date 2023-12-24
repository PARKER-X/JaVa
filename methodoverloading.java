class Student{
    // Properties
    String name;
    int age;

    // Functions
    public void displayInfo(int age){
        System.out.println("Age: " + this.age);
    }
    public void displayInfo(String name){
        System.out.println("Name: "+name);
    }
    public void displayInfo(String Name, int Age){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=21;
        s1.name="Ironman";
        s1.displayInfo(s1.name,s1.age);
        s1.displayInfo(s1.name);
        s1.displayInfo(s1.age);

    }
}