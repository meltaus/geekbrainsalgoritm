package ru.gorbachev.geekbrains.algoritm.lesson2.object;

public class BigArray {

    private int size_array;
    private int[] array;        //Массив целых чисел

    public BigArray(int size_array) {
        if (size_array <= 0) {
            size_array = 1000000;
        }
        this.size_array = size_array;
        createArray();
    }

    public BigArray() {
        this.size_array = 1000000;
        createArray();
    }

    private void createArray() {
        array = new int[size_array];
        //Заполняем массив случайными числами от 0 до size_array/2
        int half_size_array = size_array/2;
        for (int i = 0; i < size_array; i ++) {
            array[i] = (int) ( Math.random() * half_size_array );
        }
    }

    public int[] getArray() {
        return array;
    }
}
