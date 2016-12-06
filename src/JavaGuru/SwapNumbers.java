package JavaGuru;

/**
 * Created by Serjoga on 06/12/2016.
 */

import java.util.Random;

public class SwapNumbers {

    final static int ARRAY_SIZE = 10;
    final static int MAX = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(100);
        }
        Print(array);

        int MaxNum = 0;
        int MaxNumPosition = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (array[i] > MaxNum) {
                MaxNum = array[i];
                MaxNumPosition = i;
            }
        }
        System.out.println("Maximum Number = " + MaxNum);
        int tmp = array[0];
        array[0] = array[MaxNumPosition];
        array[MaxNumPosition] = tmp;
        Print(array);

    }

    public static void Print(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
        System.out.println("___________");
    }
}
