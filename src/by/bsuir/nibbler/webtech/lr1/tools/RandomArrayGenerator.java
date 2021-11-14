package by.bsuir.nibbler.webtech.lr1.tools;

public class RandomArrayGenerator {

    public static int[] generateIntArr(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return array;
    }


    public static double[] generateDoubleArr(int size, double min, double max) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((Math.random() * (max - min)) + min);
        }
        return array;
    }

}
