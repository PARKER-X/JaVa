import java.util.Scanner;

public class Faculty implements utility {
    String facultyMemberName;
    String facultyMemberCourse;
    int facultyMemberAge;
    long facultyMemberPhoneNumber;
    int facultyMemberId;
    static String UniversityName = "Parker Institute of technology";

    @Override
    public void getDetails(){
        System.out.println("Faculty ID: "+facultyMemberId);
        System.out.println("Faculty Name: "+facultyMemberName);
        System.out.println("Faculty Age: "+facultyMemberAge);
        System.out.println("Faculty of: "+facultyMemberCourse);
        System.out.println("Faculty Phone Number: "+facultyMemberPhoneNumber);
        System.out.println("Faculty university Name: "+UniversityName);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER FACULTY DETAILS *** =======================");
        System.out.println();
        System.out.println("Faculty Name: ");
        facultyMemberName = sc.nextLine();
        System.out.println("Faculty Course: ");
        facultyMemberCourse = sc.nextLine();
        System.out.println("Faculty Age: ");
        facultyMemberAge = sc.nextInt();
        System.out.println("Student Id: ");
        facultyMemberId = sc.nextInt();
        System.out.println("Student Phone Number: ");
        facultyMemberPhoneNumber = sc.nextLong();
    }
}
