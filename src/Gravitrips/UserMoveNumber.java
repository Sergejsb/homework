package Gravitrips;


import java.util.Scanner;

public class UserMoveNumber {

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}


