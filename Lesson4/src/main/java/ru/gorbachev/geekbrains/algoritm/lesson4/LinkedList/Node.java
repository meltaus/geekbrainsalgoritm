package ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList;

public class Node<Item> {

    private Item value;
    private Node next;

    public Node(Item value) {
        this.value = value;
        this.next = null;
    }

    public Item getValue() {
        return value;
    }

    public void setValue(Item value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
