import java.util.Scanner;
public class Course implements utility{
    String CourseName;

    @Override
    public void getDetails(){
        System.out.println(CourseName);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER COURSE NAME *** =======================");
        CourseName = String.valueOf(sc.nextLine());

    }
}
