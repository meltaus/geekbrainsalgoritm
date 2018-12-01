package ru.gorbachev.geekbrains.algoritm.lesson3.structuredata;

import ru.gorbachev.geekbrains.algoritm.lesson3.object.ElementPriorityQueue;

import java.util.ArrayList;

public class PriorityQueue<Item>{

    private ElementPriorityQueue[] stack;
    private int size;

    private BinaryHeap binaryHeap;

    public PriorityQueue() {
        stack = new ElementPriorityQueue[10];
        binaryHeap = new BinaryHeap();
        size = 0;
    }

    /*
    Добавляем в очередь значение
    @param key              Приоритет элемента
    @param value            Значение
     */
    public void insertElement(int key, Item value) {
        if (size == stack.length) {
            resizeQueue(stack.length * 2);
        }

        stack[size] = new ElementPriorityQueue(key, value);
        binaryHeap.add(key);
        size++;
    }

    /*
    Возвращает значение с самым высоким приоритетом. Удаляет значение из хранилища
     */
    public Item extractMaximumPriority() {
        int currentKey = binaryHeap.popMin();
        return searchExtractValue(currentKey);
    }

    /*
    Возвращает значение с самым низким приоритетом. Удаляет значение из храниллища
     */
    public Item extactMinimumPriority() {
        int currentKey = binaryHeap.popMax();

        return searchExtractValue(currentKey);
    }

    /*
    Поиск значения по ключу. Удаляет ключ и значение из списка
    @param currentKey           Ключ для поиска элемента
     */
    private Item searchExtractValue(int currentKey) {
        Item item = null;
        for (int i = 0; i < size; i++) {
            if (stack[i].getKey() == currentKey) {
                item = (Item) stack[i].getValue();
                if (size - 1 - i >= 0) System.arraycopy(stack, i + 1, stack, i, size - 1 - i);
                size--;
                return item;
            }
        }
        return item;
    }

    /*
    Проверяет размер очереди и при необходимости уменьшает его
     */
    protected void chekSize() {
        if (size > 0) {
            int currentSizeStack = stack.length;
            if (size == currentSizeStack / 4) {
                resizeQueue(currentSizeStack / 2);
            }
        }
    }

    /*
    Изменение размера стека. Новый размер всегда передается руками.
    @param newSize          Новый размер стека
     */
    protected void resizeQueue(int newSize) {
        ElementPriorityQueue[] tmpStack = new ElementPriorityQueue[newSize];
        System.arraycopy(stack, 0, tmpStack, 0, size);
        stack = tmpStack;
        size = newSize;
    }

    /*
    Вернуть значение с минимальным приоритетом
     */
    public Item getMinimumPriority() {
        return searchValue(binaryHeap.getElement(0));
    }

    /*
    Вернуть значение с максимальным приоритетом
     */
    public Item getMaximumPriority() {
        return searchValue(binaryHeap.getElement(binaryHeap.getSize()));
    }

    /*
    Возвращает начение по ключу
    @param currentKey           Ключ для поиска значени
     */
    private Item searchValue(int currentKey) {
        for (int i = 0; i < size; i++) {
            if (stack[i].getKey() == currentKey) {
                return (Item) stack[i].getValue();
            }
        }
        return null;
    }

    /*
    Получить весь список в неуподяроченном виде
     */
    public ElementPriorityQueue[] getAllElement() {
        return stack;
    }

    /*
    Слияние двух списков. Предполагается, что данные в них одинаковые
     */
    public void addPriorityQueue(ElementPriorityQueue[] addStack) {
        int count = addStack.length;
        for (int i = 0; i < count; i++) {
            insertElement(addStack[i].getKey(), (Item) addStack[i].getValue());
        }
    }
}
