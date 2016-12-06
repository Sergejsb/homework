package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        System.out.println("Input some numbers, ending with 0");
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int even = 0;
        int odd = 0;
        while (number != 0) {
            System.out.println("Input your number: ");
            number = scanner.nextInt();
            if (number != 0) {
                int result = number % 2;
                if (result == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            }
        }
        System.out.println("Odd: " + odd + " Even: " + even);
        scanner.close();
    }
    /* Input some numbers, ending with 0
		Input your number:
		4
		Input your number:
		2
		Input your number:
		8
		Input your number:
		3
		Input your number:
		0
		Odd: 1 Even: 3 */
}

