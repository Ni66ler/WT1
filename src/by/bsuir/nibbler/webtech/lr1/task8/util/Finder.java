package by.bsuir.nibbler.webtech.lr1.task8.util;

import java.util.HashMap;
import java.util.Map;

public class Finder {
    public static Map<Integer, Integer> findSpots(int[] first, int[] second) {
        Map<Integer, Integer> map = new HashMap<>();
        int pointer = 0;
        for (int i = 0; i < first.length - 1; i++) {
            if (first[i] < second[pointer] && first[i + 1] >= second[pointer]) {
                int counter = 0;
                for (int j = pointer; j < second.length; j++) {
                    if (second[j] > first[i+1]) break;
                    counter++;
                    pointer++;
                }
                map.put(i+1, counter);
            } else if (first[i] > second[pointer]){
                int counter = 0;
                for (int j = pointer; j < second.length; j++) {
                    if (second[j] > first[i]) break;
                    counter++;
                    pointer++;
                }
                map.put(i, counter);
            }
            if (pointer == second.length) break;
        }
        map.put(first.length, second.length - pointer);
        return map;
    }
}
