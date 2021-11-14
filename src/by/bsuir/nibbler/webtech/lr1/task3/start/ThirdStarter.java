package by.bsuir.nibbler.webtech.lr1.task3.start;

import by.bsuir.nibbler.webtech.lr1.task3.util.TangentCalculator;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleInput;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;

public class ThirdStarter {
    public static void main(String[] args) {
        System.out.println("Enter a");
        double a = ConsoleInput.getNextDouble();
        System.out.println("Enter b");
        double b = ConsoleInput.getNextDouble();
        System.out.println("Enter h");
        double h = ConsoleInput.getNextDouble();
        double[][] matrix = TangentCalculator.calculateFunction(a,b,h);
        ConsoleOutput.printDoubleMatrix(matrix);
    }
}
