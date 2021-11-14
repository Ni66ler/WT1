package by.bsuir.nibbler.webtech.lr1.task9.entity;

import by.bsuir.nibbler.webtech.lr1.task9.entity.Ball;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        if (ball == null) return;
        this.balls.add(ball);
    }

    public int getBallsWeight() {
        return balls.stream()
                .mapToInt(Ball::getWeight)
                .sum();
    }

    public int getColorBallsAmount(String color) {
        int counter = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals(color.trim().toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }
}
