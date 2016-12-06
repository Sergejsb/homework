package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.util.Scanner;

public class ShoppingList {
    final static String PRESS = "Press: ";
    static Scanner scanner = new Scanner(System.in);
    public static String[] array = new String[0];

    public static void main(String[] args) {
        System.out.println("Hello! This is shopping list application. Please, follow the instruction.");
        boolean condition = true;
        showMenu();
        while (condition) {
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    addItems();
                    break;
                case 2:
                    listItems();
                    deleteItems();
                    break;
                case 3:
                    listItems();
                    System.out.println("Good bye!))))");
                    condition = false;
                    break;
            }

        }

    }

    public static void showMenu() {
        System.out.println(PRESS + "1, to add items.\n" + PRESS + "2, to delete items\n" + PRESS + "3, to done.");
    }

    public static void addItems() {
        System.out.println("Enter the product to add item.");
        String inputItem = scanner.nextLine();
        int size = array.length;
        String[] itemsArray = new String[size + 1];
        itemsArray[size] = inputItem;
        if (size >= 1) {
            for (int i = 0; i < size; i++) {
                itemsArray[i] = array[i];
            }
        }
        array = itemsArray;
        System.out.println("The product added.");

    }

    public static void deleteItems() {
        System.out.println("Choose what to delete: ");
        int deleteItemIndex = scanner.nextInt();
        int sizeMinusOne = array.length - 1;
        String[] localArray = new String[sizeMinusOne];
        array[deleteItemIndex] = array[sizeMinusOne];
        array[sizeMinusOne] = null;
        for (int i = 0; i < sizeMinusOne; i++) {
            localArray[i] = array[i];
        }
        array = localArray;
    }

    public static void listItems() {
        System.out.println("Your items in shopping list: ");
        int index = 0;
        for (String list : array) {
            System.out.println(index + ". " + list);
            index++;
        }
    }
}

