package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */


import java.util.Scanner;

public class ugadajka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think a number between 1 to 100.");
        int min = 1;
        int max = 100;
        String input = "";

        while (!(input.equals("="))) {
            int guess = (min + max) / 2;
            System.out.println("It is " + guess + " ?");
            input = scanner.nextLine();
            if (input.equals(">")) {
                min = guess;
            } else if (input.equals("<")) {
                max = guess;
            } else if (input.equals("=")) {
                System.out.println("Yeey! You win!");
            }
        }
        scanner.close();
    }
}
                /* 	Think a number between 1 to 100.
				It is 50 ?
				>
				It is 75 ?
				<
				It is 62 ?
				>
				It is 68 ?
				<
				It is 65 ?
				>
				It is 66 ?
				>
				It is 67 ?
				=
				Yeey! You win! */