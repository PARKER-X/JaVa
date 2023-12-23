import java.util.Scanner;

public class recurrsion {
    public static void printNumbers(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }


    // Fibonnaci Series
    public static int FibonnaciSeries(int n){
        if (n==0){
            return 1;
        }
        else if (n==1){
            return 1;
        }
        else{
            return FibonnaciSeries(n-1)+FibonnaciSeries(n-2);
        }
    }

    // Factorial 
    public static int Factorial(int n){
        if (n==0){
            return 1;
        }
        else {
            return Factorial(n-1)*n;
        }
    }

    public static void main(String[] args){
        printNumbers(10);

        // Fib-series
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        for (int i=0; i<=n; i++){
            System.out.println(FibonnaciSeries(i));
        }
        
        // Factorial-Series
        System.out.println("Factorial: ");
        int ans = Factorial(n);
        System.out.println(ans);
    }
}
