import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        // Conditionals -if else
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Yeah You can vote!");
        }
        else{
            System.out.println("Go and do your homework!");
        }
    

        // Switch statement
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter Numbers b/w 1 to 4: ");
        int number = sct.nextInt();

        switch(number){
            case 1:
            System.out.println("One: " + number);
            break;

            case 2:
            System.out.println("Two: "+number);
            break;

            default:
            System.out.println("Default: " + number);
        }
    }
}