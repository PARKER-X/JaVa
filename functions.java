import java.util.Scanner;

public class functions{
    // Add Function
    public static int sum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    // Sub function
    public static void sub(int num1,int num2){
        System.out.println(num1-num2);
    }

    // Main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int s = sum(num1,num2);
        System.out.println(s);
        sub(num1,num2);
    }
}