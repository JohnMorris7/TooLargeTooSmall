import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        int guesses = 0;
        Random randomNum = new Random();
        int answer = 1 + randomNum.nextInt(100);

        guessingGame(answer, guesses);
    }

    public static Integer guessingGame(int correctNumber, int numberOfGuesses){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a Number between 1 and 100");
        int guess = scanner.nextInt();
        if(correctNumber == guess){
            numberOfGuesses++;
            System.out.println("Winner Winner Chicken Dinner. Guesses: "+ numberOfGuesses);
            return numberOfGuesses;
        }else{
            if(guess > correctNumber){
                numberOfGuesses++;
                System.out.println("Too Large");
                guessingGame(correctNumber, numberOfGuesses);
            }else{
                numberOfGuesses++;
                System.out.println("Too Small");
                guessingGame(correctNumber, numberOfGuesses);
            }

        }

        return null;

    }
}
