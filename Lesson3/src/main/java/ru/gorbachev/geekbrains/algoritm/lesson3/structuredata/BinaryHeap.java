package ru.gorbachev.geekbrains.algoritm.lesson3.structuredata;

import java.util.ArrayList;

public class BinaryHeap {
    private ArrayList<Integer> list;

    public BinaryHeap(int[] sourceArray) {
        list = new ArrayList<>();
    }

    /*
    Добавляем элемент в кучу и сразу упорядочиваем его
    @param add          Элемент для добавления
     */
    public void add(int value) {
        list.add(value);
        int i = list.size() - 1;
        int parent = (i - 1) / 2;

        while (i > 0 && list.get(parent) < list.get(i)) {
            int temp = list.get(i);
            list.set(i, list.get(parent));
            list.set(parent, temp);

            i = parent;
            parent = (i - 1) / 2;
        }
    }

    /*
    Проверяем упорядоченность кучи
    @param i        Корневая вершина для упорядочивания кучи
     */
    private void checkHeap(int i) {
        int leftChild;
        int rightChild;
        int largestChild;

        for (;;) {
            leftChild = 2 * i + 1;
            rightChild = 2 * i + 2;
            largestChild = i;

            if (leftChild < list.size() && list.get(leftChild) > list.get(largestChild))
            {
                largestChild = leftChild;
            }

            if (rightChild < list.size() && list.get(rightChild) > list.get(largestChild))
            {
                largestChild = rightChild;
            }

            if (largestChild == i)
            {
                break;
            }

            int temp = list.get(i);
            list.set(i, list.get(largestChild));
            list.set(largestChild, temp);
            i = largestChild;
        }
    }

    /*
    Строим кучу.
    @param sourceArray      Массив из которого будет построена куча
     */
    public void buildBinaryHeap(int[] sourceArray) {
        for(int element : sourceArray) {
            list.add(element);
        }
        for (int i = list.size() / 2; i >=0; i++) {
            checkHeap(i);
        }
    }

    /*
    Полуить максимальный элемент
     */
    public int popMax() {
        int result = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        return result;
    }

    /*
    Получить минимальный элемент из кучи
     */
    public int popMin() {
        int result = list.get(list.size());
        list.remove(list.size());
        return result;
    }

    /*
    Удалить произвольный элемент из кучи и упорядочить его
    @param i            индекс элемента для удаления
     */
    public void removeAnyElement(int index) {
        list.remove(index);

        for (int i = list.size() / 2; i >=0; i++) {
            checkHeap(i);
        }
    }

    public int getSize() {
        return list.size();
    }
}
