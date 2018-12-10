package ru.gorbachev.geekbrains.algoritm.lesson5.math;

public class MyPow {
    private int stepFatsPow;
    private int stepPow;
    public MyPow() {
        stepFatsPow = 0;
        stepPow = 0;
    }

    public Integer pow(Integer value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            stepPow++;
            return value * pow(value, pow - 1);
        }
    }

    public Double pow(Double value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            stepPow++;
            return value * pow(value, pow - 1);
        }
    }

    public Integer fastPow(Integer value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            stepFatsPow++;
            if (pow % 2 == 0){
                Integer tmp = fastPow(value, pow/2);
                return tmp * tmp;
            } else {
                return fastPow (value, pow-1) * value;
            }
        }
    }

    public Double fastPow(Double value, int pow) {
        if (pow == 1) {
            return value;
        } else {
            stepFatsPow++;
            if (pow % 2 == 0){
                Double tmp = fastPow(value, pow/2);
                return tmp * tmp;
            } else {
                return fastPow (value, pow-1) * value;
            }
        }
    }

    public int getStepFatsPow() {
        return stepFatsPow;
    }

    public int getStepPow() {
        return stepPow;
    }
}
