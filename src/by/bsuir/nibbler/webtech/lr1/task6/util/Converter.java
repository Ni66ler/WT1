package by.bsuir.nibbler.webtech.lr1.task6.util;

public class Converter {
    public static double[][] convertArrayToMatrix(double[] array) {
        int tableSize = array.length;
        double[][] table = new double[tableSize][tableSize];
        table[0] = array;
        for (int i = 1; i < tableSize; i++) {
            System.arraycopy(array, i, table[i], 0, tableSize - i);
            System.arraycopy(array, 0, table[i], tableSize - i, i);
        }
        return table;
    }
}
