package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList2 {
    final static String PRESS = "Press: ";
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> shoppingList = new ArrayList<String>();

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
                    saveToFile();
                    break;
                case 4:
                    readFromFile();
                    break;
                case 5:
                    listItems();
                    System.out.println("Good bye!))))");
                    condition = false;
                    break;
            }

        }

    }

    private static void showMenu() {
        System.out.println(PRESS + "1, to add items.\n" + PRESS + "2, to delete items\n" + PRESS
                + "3, save list to file.\n" + PRESS + "4, load list from file.\n" + PRESS + "5, to done.");
    }

    private static void addItems() {
        System.out.println("Enter the product to add item.");
        String inputWord = scanner.nextLine();
        shoppingList.add(inputWord);
        System.out.println(inputWord + " added.");

    }

    private static void deleteItems() {
        System.out.println("Choose what to delete: ");
        int inputNumber = scanner.nextInt() - 1;
        String deleteItem = shoppingList.get(inputNumber);
        shoppingList.remove(deleteItem);
        System.out.println(deleteItem + " deleted.");
    }

    private static void listItems() {
        int list = shoppingList.size();
        for (int i = 0; i < list; i++) {
            System.out.println((i + 1) + "." + shoppingList.get(i));
        }
    }

    private static void saveToFile() {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("_shoppingList.txt")))) {
            for (String s : shoppingList) {
                writer.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File has been saved.");
    }

    private static void readFromFile() {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("_shoppingList.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int arraySize = list.size();
        System.out.println("File contains: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

    }
}
            /* Hello! This is shopping list application. Please, follow the instruction.
		Press: 1, to add items.
		Press: 2, to delete items
		Press: 3, save list to file.
		Press: 4, load list from file.
		Press: 5, to done.
		1
		Enter the product to add item.
		milk
		milk added.
		1
		Enter the product to add item.
		car
		car added.
		1
		Enter the product to add item.
		plane
		plane added.
		2
		1.milk
		2.car
		3.plane
		Choose what to delete:
		1
		milk deleted.
		3
		File has been saved.
		4
		File contains:
		1. car
		2. plane
		5
		1.car
		2.plane
		Good bye!)))) */