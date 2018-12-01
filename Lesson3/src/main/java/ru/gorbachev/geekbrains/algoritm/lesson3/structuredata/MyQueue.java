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
        removeRunElement();

        return item;
    }
}
