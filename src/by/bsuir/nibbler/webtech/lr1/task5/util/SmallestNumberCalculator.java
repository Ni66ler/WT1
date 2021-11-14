package by.bsuir.nibbler.webtech.lr1.task5.util;

public class SmallestNumberCalculator {

    public static int countNumber(int[] numbers) {
        int result = numbers.length;
        int tempResult;
        for (int i = 0; i < numbers.length / 2; i++) {
            tempResult = countIteration(numbers, i);
            if (result > tempResult) result = tempResult;
        }
        return result;
    }

    private static int countIteration(int[] numbers, int position) {
        int counter = 0;
        int max = numbers[position];
        for (int i = position; i < numbers.length - 1; i++) {
            if (numbers[i + 1] <= max) {
                counter++;
            } else {
                max = numbers[i + 1];
            }
        }
        return counter + position;
    }
}
