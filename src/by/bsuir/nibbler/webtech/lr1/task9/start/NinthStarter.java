package by.bsuir.nibbler.webtech.lr1.task9.start;

import by.bsuir.nibbler.webtech.lr1.task9.entity.Ball;
import by.bsuir.nibbler.webtech.lr1.task9.entity.Basket;

public class NinthStarter {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball("blue", 400));
        basket.addBall(new Ball("white", 228));
        basket.addBall(new Ball("yellow", 340));
        basket.addBall(new Ball("yellow", 123));
        basket.addBall(new Ball("blue", 900));
        basket.addBall(new Ball("red", 2232));
        System.out.println("Balls weight: " + basket.getBallsWeight());
        System.out.println("Blue balls amount: " + basket.getColorBallsAmount("blue"));
    }
}
