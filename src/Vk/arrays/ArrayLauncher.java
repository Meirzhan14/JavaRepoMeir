package Vk.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLauncher {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[8];
        System.out.println("enter the 8 inputs");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next element:");
            myArray[j] = scanner.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element #" + i + "= " + myArray[i]);
        }


    }


}
