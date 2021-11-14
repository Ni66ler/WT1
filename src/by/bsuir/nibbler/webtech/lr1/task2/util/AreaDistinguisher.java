package by.bsuir.nibbler.webtech.lr1.task2.util;

public class AreaDistinguisher {
    public static boolean isInArea(double x, double y) {
        if (y >= -3 && y <= 5 && x >= -6 && x <= 6) {
            return y <= 0 || x <= 4 || x >= -4;
        }
        return false;
    }
}
