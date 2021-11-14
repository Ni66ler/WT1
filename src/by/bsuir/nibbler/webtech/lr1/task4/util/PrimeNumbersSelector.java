package by.bsuir.nibbler.webtech.lr1.task4.util;

public class PrimeNumbersSelector {
    public static void findPrimeNums(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.println("[" + i + "] = " + array[i] + " is prime");
                counter++;
            }
        }
        if (counter == 0) System.out.println("No prime numbers found");
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
