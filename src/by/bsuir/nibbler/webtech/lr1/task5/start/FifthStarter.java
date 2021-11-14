package by.bsuir.nibbler.webtech.lr1.task5.start;

import by.bsuir.nibbler.webtech.lr1.task5.util.SmallestNumberCalculator;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;
import by.bsuir.nibbler.webtech.lr1.tools.RandomArrayGenerator;

public class FifthStarter {

    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generateIntArr(100, 0, 100);
        ConsoleOutput.printArray(array);
        System.out.println(SmallestNumberCalculator.countNumber(array));
    }
}
