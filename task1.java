import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempt = 10;
        int score = 0;

        System.out.println("Welcome to the game where you have to guess random generated number");

        while(true){
            int randomNumber = random.nextInt(maxRange - minRange + 1 ) + minRange;
            System.out.println("The random number is generated ");
            int attempts = 0;

            while(true) {
                System.out.print("Enter your guess :");
                int guess = sc.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println(" Too high , try again !!");
                } else if (guess < randomNumber) {
                    System.out.println(" Too low , try again !!");
                } else {
                    System.out.println("Congratulation !! you guessed the number");
                }

                if (attempts >= maxAttempt) {
                    System.out.println("you have exceeded the limit . The correct number is :" + randomNumber);
                    break;
                }
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgain = sc.next();
            if(!playAgain.equals("yes")){
                break;
            }
        }

        System.out.println("Your total score: " + score);
        sc.close();
    }
}
