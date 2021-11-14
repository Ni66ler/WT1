package by.bsuir.nibbler.webtech.lr1.tools;

import java.util.Scanner;

public class ConsoleInput {

    public static double getNextDouble() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) scanner.next();
        scanner.close();
        return scanner.nextDouble();
    }

    public static int getNextInt() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) scanner.next();
        scanner.close();
        return scanner.nextInt();
    }

    public static int[] inputArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "] = ");
            array[i] = getNextInt();
        }
        System.out.println();
        return array;
    }
}
