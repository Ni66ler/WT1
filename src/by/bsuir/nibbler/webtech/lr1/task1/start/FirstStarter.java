package by.bsuir.nibbler.webtech.lr1.task1.start;

import by.bsuir.nibbler.webtech.lr1.task1.util.Calculator;
import by.bsuir.nibbler.webtech.lr1.tools.ConsoleInput;

import java.util.Scanner;

public class FirstStarter {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        double x = ConsoleInput.getNextDouble();
        System.out.println("Enter y:");
        double y = ConsoleInput.getNextDouble();
        System.out.printf("Result = %.3f" , Calculator.calculateFunction(x, y));
    }
}
