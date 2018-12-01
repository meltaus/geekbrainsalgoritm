package ru.gorbachev.geekbrains.algoritm.lesson3.baicstrucrutedata;

import java.util.NoSuchElementException;

public class BasicQueue<Item> {

    protected Object[] anyQueue;
    protected int size;

    public BasicQueue() {
        anyQueue = new Object[1];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /*
    Изменение размера стека. Новый размер всегда передается руками.
    @param newSize          Новый размер стека
     */
    protected void resizeQueue(int newSize) {
        Object[] tmpStack = new Object[newSize];
        if (this.size < newSize) {
            System.arraycopy(anyQueue, 0, tmpStack, 0, this.size);
        } else {
            System.arraycopy(anyQueue, 0, tmpStack, 0, newSize);
        }
        anyQueue = tmpStack;
    }

    /*
    Добавление элемента в конец очереди
    @param item             Новый элемент
     */
    public void push(Item item) {
        if (size == anyQueue.length) {
            resizeQueue(size * 2);
        }

        anyQueue[size++] = item;
    }

    /*
    Получаем клайние элемент очереди
     */
    public Item pop() {
        Item item = peek();
        anyQueue[size - 1] = null;
        size--;
        chekSize();

        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return (Item) anyQueue[size - 1];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : anyQueue) {
            if (o != null) {
                stringBuilder.append(o).append(", ");
            }
        }
        String resultString = stringBuilder.toString();
        resultString = resultString.substring(0, resultString.length() - 2);
        return resultString;
    }

    /*
    Проверяет размер очереди и при необходимости уменьшает его
     */
    protected void chekSize() {
        if (size > 0) {
            int currentSizeStack = anyQueue.length;
            if (size == currentSizeStack / 4) {
                resizeQueue(currentSizeStack);
            }
        }
    }

    protected void removeRunElement() {
        Object[] tmpStack = new Object[size];
        System.arraycopy(anyQueue, 1, tmpStack, 0, size);
        anyQueue = tmpStack;
        size--;
        chekSize();
    }
}
