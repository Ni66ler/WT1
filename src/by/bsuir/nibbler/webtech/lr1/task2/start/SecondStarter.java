package by.bsuir.nibbler.webtech.lr1.task2.start;

import by.bsuir.nibbler.webtech.lr1.task2.util.AreaDistinguisher;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleInput;


public class SecondStarter {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        int x = ConsoleInput.getNextInt();
        System.out.println("Enter y:");
        int y = ConsoleInput.getNextInt();
        System.out.println(AreaDistinguisher.isInArea(x, y));
    }
}
