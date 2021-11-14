package by.bsuir.nibbler.webtech.lr1.task4.start;

import by.bsuir.nibbler.webtech.lr1.task4.util.PrimeNumbersSelector;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;
import by.bsuir.nibbler.webtech.lr1.tools.RandomArrayGenerator;

public class FourthStarter {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generateIntArr(100, 0, 100);
        ConsoleOutput.printArray(array);
        PrimeNumbersSelector.findPrimeNums(array);
    }
}
