package Vk.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandlingMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {

                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denumerator");
                int denumerator = scanner.nextInt();
                System.out.println(divide(numerator, denumerator));
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.out.println("Exeption: " + e);
                scanner.nextLine();
                System.out.println("Only non-zero params allowed");
            } catch (InputMismatchException e) {
                System.out.println("Exeption: " + e);
                scanner.nextLine();
                System.out.println("Only integer values allowed");
            }
            System.out.println("Try catch block finished");
        } while(continueLoop);
    }

    private static int divide(int numerator, int denumerator) {
        return numerator / denumerator;

    }
}
