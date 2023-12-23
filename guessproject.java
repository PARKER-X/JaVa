import java.util.Scanner;
import java.lang.Math;

public class guessproject {
    public static void main(String[] args) {
        // A Geussing Game
        System.out.println("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + " to your guessing game! ");
        int Guess = 1;
        int guess = 0;
        int random_number = (int)( Math.random()*100);
        System.out.println(random_number);

        do{
            if (guess==0){
            System.out.println("Guess Number from range 1 to 100: ");
            guess = sc.nextInt();
        }
        else{
            System.out.println("Try again from range 1 to 100: ");
            guess = sc.nextInt();
        }

            if (guess == random_number){
                if (Guess==1) {
                    System.out.println("Hurray! You won! You takes " + Guess +" guesses to guess the number " + random_number +" Perfect Score!");
                    break;    
                }
                else {
                System.out.println("Hurray! You won! You takes " + Guess +" guesses to guess the number " + random_number );
                break;
            }
            }
            else if (guess>random_number){
                System.out.println("Your guess is too big! Try smaller Number! ");
                Guess++;
            }
            else{
                System.out.println("Your guess is too small! Try Bigger Number! ");
                Guess++;
            }
        }
        while(guess>=0);
    }
}
