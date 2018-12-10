package ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList;

public class MyLinkedQueue<Item> {
    private MyLinkedList<Item> queue = new MyLinkedList<>();

    public void enquue(Item item) {queue.insertLast(item);}

    public Item dequeue() {return queue.deleteFirst();}

    public Item peek() {return queue.getFirst();}

    public int size() {return queue.size();}

    public boolean isEmpty() {return queue.isEmpty();}
}