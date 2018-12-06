package ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList;

public class LinkedList<Item> {
    private Node first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    /*
    Вставляем элемент в список
    @param value        Значение для вставки
     */
    public void insert(Item value) {
        Node newNode = new Node(value);
        newNode.setNext(first);
        first = newNode;
    }

    /*
    Возвращает первый элемент списка и удаляет его из списка
     */
    public Node delete() {
        Node tmp = first;
        first = first.getNext();
        return tmp;
    }

    /*
    Возвращает первый элемент из списка
     */
    public Node peek() {
        return first;
    }

    @Override
    public String toString() {
        String result = "";
        Node current = first;
        while (current != null) {
            result = current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }
}
