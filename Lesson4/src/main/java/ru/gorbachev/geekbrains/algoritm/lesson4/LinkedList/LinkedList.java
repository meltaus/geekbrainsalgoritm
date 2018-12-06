package ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList;

import ru.gorbachev.geekbrains.algoritm.lesson4.object.Student;

public class LinkedList<Item> {
    private Node<Item> first;
    private Node<Item> last;

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
    public Item pop() {
        Node tmp = first;
        first = first.getNext();
        return (Item) tmp.getValue();
    }

    /*
    Возвращает первый элемент из списка
     */
    public Item peek() {
        return (Item) first.getValue();
    }

    public void insertLast(Item value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    /*
    Ищем совпадаение, возвращаем элемент и удаляет его
    @param value значение для поиска
     */
    public Item delete(Student value) {
        Node current = first;
        Node previus = first;
        while(current.getValue() != value){
            if(current.getNext() == null)
                return null;
            else{
                previus = current;
                current = current.getNext();
            }
        }
        if(current == first)
            first = first.getNext();
        else
            previus.setNext(current.getNext());
        return (Item) current.getValue();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = first;
        while (current != null) {
            result.append(current.toString()).append("\n");
            current = current.getNext();
        }
        return result.toString();
    }
}
