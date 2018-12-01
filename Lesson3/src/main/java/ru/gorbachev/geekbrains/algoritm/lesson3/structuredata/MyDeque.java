package ru.gorbachev.geekbrains.algoritm.lesson3.structuredata;

import ru.gorbachev.geekbrains.algoritm.lesson3.baicstrucrutedata.BasicQueue;

import java.util.NoSuchElementException;

public class MyDeque<Item> extends BasicQueue {

    public MyDeque() {
        super();
    }

    /*
    Добавляет элемент в начало или конец очереди (true в конец, false в начало)
    @param item             Элемент для добавления
    @param side             Сторона добавления (true в конец, false в начало)
     */
    public void push(Item item, boolean side) {
        if (side) {
            super.push(item);
        } else {
            if (size + 1 == anyQueue.length) {
                System.out.println(size);
                resizeQueue(size * 2);
            }
            if (size + 1 >= 0) System.arraycopy(anyQueue, 0, anyQueue, 1, size + 1);
            anyQueue[0] = item;
            size++;
        }
    }

    /*
    Получаем элемент очереди с начала или с конца (true с конеца, false с начала).
    @param  side            Сторона получения элемента (true с конца, false с начала)
     */
    public Item pop(boolean side) {
        if (side) {
            return (Item) pop();
        } else {
            Item item = peek(false);
            removeRunElement();
            return item;
        }
    }

    /*
    Получаем элемент очереди с начала или с конца (true с конеца, false с начала).
    @param  side            Сторона получения элемента (true с конца, false с начала)
     */
    public Item peek(boolean side) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (side) {
            return (Item) anyQueue[size - 1];
        } else {
            return (Item) anyQueue[0];
        }
    }
}
