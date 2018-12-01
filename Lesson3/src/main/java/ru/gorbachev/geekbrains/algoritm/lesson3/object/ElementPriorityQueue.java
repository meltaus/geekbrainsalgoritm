package ru.gorbachev.geekbrains.algoritm.lesson3.object;

public class ElementPriorityQueue<Item> {
    private int key;
    private Item value;

    public ElementPriorityQueue(int key, Item value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Item getValue() {
        return value;
    }

    public void setValue(Item value) {
        this.value = value;
    }
}
