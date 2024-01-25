interface utility{
    // Functions
    public void setDetails();
    public void getDetails();
}


public class main {
      static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO UNIVERSITY MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD STUDENT \t\t\t 2].ADD FACULTY \t\t\t 3].ADD COURSE");
        System.out.println();
        System.out.println("4].GET STUDENT \t\t\t 5].GET FACULTY \t\t\t 6].GET COURSE");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        main_menu();
    }}