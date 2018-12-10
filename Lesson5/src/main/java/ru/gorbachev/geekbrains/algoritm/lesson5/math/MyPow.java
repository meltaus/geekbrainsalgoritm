package ru.gorbachev.geekbrains.algoritm.lesson5.math;

public class MyPow {
    public MyPow() {

    }

    public Integer pow(Integer value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            return value * pow(value, pow - 1);
        }
    }

    public Double pow(Double value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            return value * pow(value, pow - 1);
        }
    }
}
