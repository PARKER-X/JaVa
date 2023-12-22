import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        // Operators
        // Arthimetic operators
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);

    }
}
