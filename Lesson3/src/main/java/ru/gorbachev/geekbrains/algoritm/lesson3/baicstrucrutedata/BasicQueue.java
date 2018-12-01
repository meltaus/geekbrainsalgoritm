package ru.gorbachev.geekbrains.algoritm.lesson3.baicstrucrutedata;

import java.util.NoSuchElementException;

public class BasicQueue<Item> {

    protected Object[] stack = new Object[1];
    protected int size = 0;

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
            System.arraycopy(stack, 0, tmpStack, 0, this.size);
        } else {
            System.arraycopy(stack, 0, tmpStack, 0, newSize);
        }
        stack = tmpStack;
    }

    /*
    Добавление элемента в конец очереди
    @param item             Новый элемент
     */
    public void push(Item item) {
        if (size == stack.length) {
            resizeQueue(size * 2);
        }

        stack[size++] = item;
    }

    /*
    Получаем клайние элемент очереди
     */
    public Item pop() {
        Item item = peek();
        stack[size - 1] = null;
        size--;
        if (size > 0) {
            int currentSizeStack = stack.length;
            if (size == currentSizeStack / 4) {
                resizeQueue(currentSizeStack);
            }
        }

        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return (Item) stack[size - 1];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : stack) {
            if (o != null) {
                stringBuilder.append(o).append(", ");
            }
        }
        String resultString = stringBuilder.toString();
        resultString = resultString.substring(0, resultString.length() - 2);
        return resultString;
    }
}
