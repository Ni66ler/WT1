package by.bsuir.nibbler.webtech.lr1.task3.util;

public class TangentCalculator {

    public static double[][] calculateFunction(double a, double b, double h) {
        double x = Math.min(b, a);
        int rowsNumber = (int) (Math.abs(b - a) / h) + 1;
        double[][] resultTable = new double[rowsNumber][2];
        for (int i = 0; i < rowsNumber; i++) {
            resultTable[i][0] = x;
            resultTable[i][1] = Math.tan(x);
            x = x + h;
        }
        return resultTable;
    }
}
