package by.bsuir.nibbler.webtech.lr1.task6.start;

import by.bsuir.nibbler.webtech.lr1.task6.util.Converter;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;
import by.bsuir.nibbler.webtech.lr1.tools.RandomArrayGenerator;

public class SixthStarter {
    public static void main(String[] args) {
        double[] array = RandomArrayGenerator.generateDoubleArr(10, 0, 20);
        ConsoleOutput.printArray(array);
        double[][] matrix = Converter.convertArrayToMatrix(array);
        ConsoleOutput.printDoubleMatrix(matrix);
    }
}
