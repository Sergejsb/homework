package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.util.Random;
import java.util.Scanner;

public class Zagadajka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);
        int guessNumber;
        System.out.println("I think a number between 1 to 100. Try to guess it.");

        do {
            guessNumber = scanner.nextInt();

            if (guessNumber > number) {
                System.out.println("The number is less. Try again!");
            }
            if (guessNumber < number) {

                System.out.println("The number is more. Try again!");
            }
            if (guessNumber == number) {
                System.out.println("The number is correct. You win!");
            }
        } while (guessNumber != number);

        scanner.close();
    }
}

				/*I think a number between 1 to 100. Try to guess it.
                50
				The number is more. Try again!
				75
				The number is less. Try again!
				62
				The number is more. Try again!
				65
				The number is more. Try again!
				70
				The number is correct. You win! */