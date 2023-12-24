public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInfo();
        s1.name = "Ironman";
        s1.age = 21;
        s1.Course = "BCA";
        s1.getInfo();
    }
}

class Student{
    String name;
    int age;
    String Course;

    public void getInfo(){
        System.out.println("The name of the student is: " + this.name);
        System.out.println("The age of the stundent is: " + this.age);
        System.out.println("The student pursing " + this.Course);

    }
    
}


