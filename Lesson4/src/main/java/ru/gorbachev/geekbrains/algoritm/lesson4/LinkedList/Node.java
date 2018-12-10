package ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList;

public class Node<Item> {

    private Item value;
    private Node<Item> next;
    private Node<Item> previus;

    public Node(Item value) {
        this.value = value;
    }

    public Item getValue() {
        return value;
    }

    public void setValue(Item value) {
        this.value = value;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node<Item> getPrevius() {
        return previus;
    }

    public void setPrevius(Node<Item> previus) {
        this.previus = previus;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
