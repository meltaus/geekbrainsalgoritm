package ru.gorbachev.geekbrains.algoritm.lesson3.structuredata;

import ru.gorbachev.geekbrains.algoritm.lesson3.baicstrucrutedata.BasicQueue;

public class MyQueue<Item> extends BasicQueue {

    public MyQueue() {
        super();
    }

    @Override
    public Item peek() {
        return (Item) anyQueue[0];
    }

    @Override
    public Item pop() {
        Item item = peek();
        Object[] tmpStack = new Object[size];
        System.arraycopy(anyQueue, 1, tmpStack, 0, size);
        anyQueue = tmpStack;
        size--;
        chekSize();

        return item;
    }
}
