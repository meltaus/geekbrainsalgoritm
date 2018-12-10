package ru.gorbachev.geekbrains.algoritm.lesson5;

import ru.gorbachev.geekbrains.algoritm.lesson5.math.MyPow;

public class Lesson5 {
    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        long startTime;
        startTime = System.currentTimeMillis();
        System.out.println(myPow.fastPow(2,30));
        System.out.println("На быстрое возведение в степень затрачено: " + (System.currentTimeMillis() - startTime) + "мс за "
        + myPow.getStepFatsPow() + " шагов");
        startTime = System.currentTimeMillis();
        System.out.println(myPow.pow(2,30));
        System.out.println("На возведение в степень затрачено: " + (System.currentTimeMillis() - startTime) + "мс за "
        + myPow.getStepPow() + " шагов");
    }
}
