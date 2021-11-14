package by.bsuir.nibbler.webtech.lr1.task8.start;

import by.bsuir.nibbler.webtech.lr1.task12.entity.Book;
import by.bsuir.nibbler.webtech.lr1.task8.util.Finder;
import by.bsuir.nibbler.webtech.lr1.tools.ArraySorter;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleOutput;
import by.bsuir.nibbler.webtech.lr1.tools.RandomArrayGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EighthStarter {
    public static void main(String[] args) {
        int[] arr1 = ArraySorter.shellSort(RandomArrayGenerator.generateIntArr(10,2,12));
        ConsoleOutput.printArray(arr1);
        int[] arr2 = ArraySorter.shellSort(RandomArrayGenerator.generateIntArr(10,0,20));
        ConsoleOutput.printArray(arr2);
        Map<Integer, Integer> map = Finder.findSpots(arr1, arr2);
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<Integer> valueList = new ArrayList<>(map.values());
        for (int i = 0; i < keyList.size(); i++) {
            System.out.println(keyList.get(i) + " " + valueList.get(i));
        }


    }
}
