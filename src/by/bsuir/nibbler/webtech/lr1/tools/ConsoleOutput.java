package by.bsuir.nibbler.webtech.lr1.tools;

public class ConsoleOutput {


    public static void printDoubleMatrix(double[][] matrix) {
        for (double[] value : matrix) {
            for (double number : value) {
                System.out.printf("%3.3f", number);
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("]\n");
    }

    public static void printArray(double[] arr) {
        System.out.print("[");
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("]\n");
    }


}
