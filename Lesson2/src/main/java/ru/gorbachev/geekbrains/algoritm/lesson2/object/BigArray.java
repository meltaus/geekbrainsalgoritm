package ru.gorbachev.geekbrains.algoritm.lesson2.object;

import ru.gorbachev.geekbrains.algoritm.lesson2.baseworkarray.WorkArray;

public class BigArray extends WorkArray {

    public BigArray(int sizeArray) {
        if (sizeArray <= 0) {
            sizeArray = 1000000;
        }
        this.sizeArray = sizeArray;
        createArray();
    }

    public BigArray() {
        this.sizeArray = 1000000;
        createArray();
    }

    private void createArray() {
        array = new int[sizeArray];
        //Заполняем массив случайными числами от 0 до sizeArray/2
        int half_size_array = sizeArray /2;
        for (int i = 0; i < sizeArray; i ++) {
            array[i] = (int) ( Math.random() * half_size_array );
        }
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return printArray(array);
    }
}
