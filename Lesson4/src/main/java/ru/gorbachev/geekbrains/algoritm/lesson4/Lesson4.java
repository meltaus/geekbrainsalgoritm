package ru.gorbachev.geekbrains.algoritm.lesson4;

import ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList.LinkedList;
import ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList.MyLinkedList;
import ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList.MyLinkedQueue;
import ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList.MyLinkedStack;
import ru.gorbachev.geekbrains.algoritm.lesson4.object.Student;

import java.util.Iterator;

public class Lesson4 {

    public static void main(String[] args) {
        System.out.println("List");
        MyLinkedList<Student> myLinkedLis = new MyLinkedList<>();
        myLinkedLis.insert(0, new Student("Горбачев Артем Эдуардович", 25, "Java"));
        myLinkedLis.insert(1, new Student("Горбачева Анастасия Павловна", 25, "Рукоделье"));
        myLinkedLis.insert(2, new Student("Пугачева Анна Павловна", 20, "Бухгалтерия"));
        myLinkedLis.insert(3, new Student("Горбачева Елена Александровна", 46, "готовит котлетки"));

        Iterator iterator = myLinkedLis.iterator();

        for (Student current : myLinkedLis) {
            System.out.println(current.toString());
        }

        System.out.println("Stak");
        MyLinkedStack<Student> myLinkedStack = new MyLinkedStack<>();

        myLinkedStack.push(new Student("Горбачев Артем Эдуардович", 25, "Java"));
        myLinkedStack.push(new Student("Горбачева Анастасия Павловна", 25, "Рукоделье"));
        myLinkedStack.push(new Student("Пугачева Анна Павловна", 20, "Бухгалтерия"));
        myLinkedStack.push(new Student("Горбачева Елена Александровна", 46, "готовит котлетки"));

        System.out.println(myLinkedStack.size());
        int sizeStack = myLinkedStack.size();
        System.out.println(myLinkedStack.size());
        for (int i = 0; i < sizeStack; i++) {
            Student tmp = myLinkedStack.pop();
            System.out.println(tmp.toString());
        }
        System.out.println(myLinkedStack.size());

        System.out.println("Queue");
        MyLinkedQueue myLinkedQueue = new MyLinkedQueue();
        myLinkedQueue.enquue(new Student("Горбачев Артем Эдуардович", 25, "Java"));
        myLinkedQueue.enquue(new Student("Горбачева Анастасия Павловна", 25, "Рукоделье"));
        myLinkedQueue.enquue(new Student("Пугачева Анна Павловна", 20, "Бухгалтерия"));
        myLinkedQueue.enquue(new Student("Горбачева Елена Александровна", 46, "готовит котлетки"));

        System.out.println(myLinkedQueue.size());
        int sizeQueue = myLinkedQueue.size();
        for (int i = 0; i < sizeQueue; i++) {
            Student tmp = (Student) myLinkedQueue.dequeue();
            System.out.println(tmp.toString());
        }

        System.out.println(myLinkedQueue.size());
    }
}
