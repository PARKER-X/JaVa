class Student{
    // Properties
    String name;
    int age;

    // Default Constructor or non parametrized constructor
    Student(){
        System.out.println(" Default Constructor is intialized! ");
    }

    // Parametrized constructor
    Student(String Name, int Age){
        this.name = Name;
        this.age = Age;
    }

    // Copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}