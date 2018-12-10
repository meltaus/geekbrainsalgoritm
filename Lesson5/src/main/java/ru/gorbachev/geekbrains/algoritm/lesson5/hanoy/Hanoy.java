package ru.gorbachev.geekbrains.algoritm.lesson5.hanoy;

import java.util.Stack;

public class Hanoy {

    public Hanoy(int size) {
        reshuffle(size, "Башня 1", "Башня 2", "Временная башня");
    }

    private void move(String tower1, String tower2) {
        System.out.println("С стержная " + tower1 + " в стержень " + tower2);
    }

    private void reshuffle(int size, String tower1, String tower2, String towerTmp) {
        if (size != 0) {
            reshuffle(size - 1, tower1, towerTmp, tower2);
            move(tower1,tower2);
            reshuffle(size - 1, towerTmp, tower1, tower2);
        } else {
            return;
        }
    }
}
