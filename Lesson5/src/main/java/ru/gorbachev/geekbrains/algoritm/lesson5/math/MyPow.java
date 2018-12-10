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

    public Integer fastPow(Integer value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            if (pow % 2 == 0) {
                return fastPow(value, pow/2) * fastPow(value, pow/2);
            } else {
                return fastPow(value, pow - 1) * value;
            }
        }
    }

    public Double fastPow(Double value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            if (pow % 2 == 0) {
                return fastPow(value, pow/2) * fastPow(value, pow/2);
            } else {
                return fastPow(value, pow - 1) * value;
            }
        }
    }
}
