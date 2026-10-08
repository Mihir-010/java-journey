import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Guess the number (1-100) you have 7 tries.\n");


        while(count < 7) {
            System.out.println("Enter guess: ");
            int guess = scanner.nextInt();
            if (randomNumber == guess) {
                System.out.println("You guessed the correct answer in "+(count+1)+" tries");
                break;
            } else if (randomNumber > guess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
            count++;
            if(count == 7){
                System.out.println("Out of tries. Number was "+randomNumber);
            }
        }
    }
}
