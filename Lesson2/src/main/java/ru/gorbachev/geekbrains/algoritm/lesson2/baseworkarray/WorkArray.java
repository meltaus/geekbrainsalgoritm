package ru.gorbachev.geekbrains.algoritm.lesson2.baseworkarray;

public class WorkArray {

    protected int sizeArray;
    protected static int[] array;        //Массив целых чисел

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
}
