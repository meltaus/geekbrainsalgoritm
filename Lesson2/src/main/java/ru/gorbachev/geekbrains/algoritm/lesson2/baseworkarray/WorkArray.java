package ru.gorbachev.geekbrains.algoritm.lesson2.baseworkarray;

import java.util.Scanner;

public class WorkArray {

    protected int sizeArray;
    protected static int[] array;        //Массив целых чисел
    private long timeSortSelect;
    private long timeSortInsert;
    private long timeSortBubble;

    /*
    @param index        Индекс удаляемого элемента

    Удаление элемента из массива по индексу.
     */
    public void deleteElement(int index) {
        int size = array.length;
        int[] tmpArray = new int[size - 1];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                tmpArray[count] = array[i];
                count++;
            }
        }
        array = tmpArray;
    }

    /*
    @param element      Значение, которое необходимо найти

    Добавление элемента в конец массива
     */
    public void addElement(int element) {
        int size = array.length;
        int[] tmpArray = new int[size + 1];
        System.arraycopy(array, 0, tmpArray, 0, size);
        tmpArray[size] = element;
        array = tmpArray;
    }

    /*
    @param element      Значение, которое необходимо найти

    Поиск элемента. В качестве результата выдается первое совпадание. В качестве результата получаем индекс элемента
    Если совпадения не найдено - возвращает -1
     */
    public int searchElement(int element) {
        int index = -1;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    /*
    @param arr      Массив для формирования строки вывода

    Формирует строку вывода для массива
     */
    protected String printArray(int[] arr) {
        int size = arr.length;
        int count = 0;
        StringBuilder string = new StringBuilder();
        for (int i1 : arr) {
            string.append("\t").append(i1);
            count++;
            if (count == 10) {
                string.append("\n");
                count = 0;
            }
        }
        return string.toString();
    }

    /*
    Сортировка методом вставки. От большего к меньшему
     */
    public int[] insertSort() {
        int size = array.length;
        int[] tmpArray = new int[size];
        System.arraycopy(array, 0, tmpArray, 0, size);
        long startTime = System.currentTimeMillis();
        int key;
        for (int i = 1; i < size; i++) {
            key = tmpArray[i];
            int j = i - 1;
            while (j >= 0 && tmpArray[j] < key) {
                tmpArray[j + 1] = tmpArray[j];
                j = j - 1;
            }
            tmpArray[j + 1] = key;
        }
        timeSortInsert = System.currentTimeMillis() - startTime;
        return tmpArray;
    }

    /*
    Сортировка выбором от меньшего к большему
     */
    public int[] sortBySelection() {
        int size = array.length;
        int[] tmpArray = new int[size];
        System.arraycopy(array, 0, tmpArray, 0, size);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int min = tmpArray[i];
            int min_i = i;
            for (int j = i + 1; j < size; j++) {
                if (tmpArray[j] < min) {
                    min = tmpArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = tmpArray[i];
                tmpArray[i] = min;
                tmpArray[min_i] = tmp;
            }
        }
        timeSortSelect = System.currentTimeMillis() - startTime;
        return tmpArray;
    }

    /*
    Сортировка пузырьком от меньшего к большему
     */
    public int[] bubbleSort() {
        int size = array.length;
        int[] tmpArray = new int[size];
        System.arraycopy(array, 0, tmpArray, 0, size);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (tmpArray[j] > tmpArray[j + 1]) {
                    int temp = tmpArray[j];
                    tmpArray[j] = tmpArray[j + 1];
                    tmpArray[j + 1] = temp;
                }
        timeSortBubble = System.currentTimeMillis() - startTime;
        return tmpArray;
    }

    public long getTimeSortSelect() {
        return timeSortSelect;
    }

    public long getTimeSortInsert() {
        return timeSortInsert;
    }

    public long getTimeSortBubble() {
        return timeSortBubble;
    }

    public void runAllSort() {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
    }

    public int getSizeArray() {
        return array.length;
    }
}
