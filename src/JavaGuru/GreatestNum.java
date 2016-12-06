package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.util.Scanner;

public class GreatestNum {

    public static void main(String[] args) {
        System.out.println("Input 3 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Your number is ");
        if ((a >= b) && (a >= c)) {
            System.out.println(a);
        } else if ((b >= a) && (b >= c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println("Good bye!");
        scanner.close();
    }
        /* Input 3 numbers:
			7
			12
			85
			Your number is
			85
			Good bye! */
}
