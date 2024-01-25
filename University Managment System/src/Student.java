import java.util.Scanner;

public class Student implements utility {
    String studentName;
    String StudentCourse;
    int studentAge;
    int studentRollno;
    long studentPhoneNumber;
    Static UniversityName = "Parker Institute of technology";


    // Functions
    @Override
    public void getDetails(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student class: "+StudentCourse);
        System.out.println("Student Age: "+studentAge);
        System.out.println("Student Roll No: "+studentRollno);
        System.out.println("Student Phone Number: "+studentPhoneNumber);
        System.out.println("student university Name: "+UniversityName);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER Student DETAILS *** =======================");
        System.out.println();
        System.out.println("Student Name: ");
        studentName = sc.nextLine();
        System.out.println("Student Course: ");
        StudentCourse = sc.nextLine();
        System.out.println("Student Age: ");
        studentAge = sc.nextInt();
        System.out.println("Student Roll No: ");
        studentRollno = sc.nextInt();
        System.out.println("Student Phone Number: ");
        studentPhoneNumber = sc.nextLong();
    }
}
