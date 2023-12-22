import java.lang.Math;
import java.util.Scanner;

public class math{
    public static void main(String[] args){
        System.out.println("Math Max-Min Finder:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Max number is: " + Math.max(num1,num2));
        System.out.println("Min number is: "+ Math.min(num1,num2));
        int random_number  = (int) ( Math.random()*100);
        System.out.println("Random Number between 1 to 1000: " + random_number);
    }
}