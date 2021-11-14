package by.bsuir.nibbler.webtech.lr1.task7.start;

import by.bsuir.nibbler.webtech.lr1.tools.ArraySorter;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;
import by.bsuir.nibbler.webtech.lr1.tools.RandomArrayGenerator;

public class SeventhStarter {
    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generateIntArr(15, 0, 20);
        ConsoleOutput.printArray(array);
        int[] arr = ArraySorter.shellSort(array);
        ConsoleOutput.printArray(arr);
    }
}
