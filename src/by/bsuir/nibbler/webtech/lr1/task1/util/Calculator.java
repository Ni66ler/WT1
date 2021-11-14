package by.bsuir.nibbler.webtech.lr1.task1.util;

public class Calculator {
    public static double calculateFunction(double x, double y) {
        double result;
        double numerator = Math.sin(x + y);
        numerator = numerator * numerator + 1;
        double denominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
        result = numerator / denominator + x;
        return result;
    }
}
