package ru.gorbachev.geekbrains.algoritm.lesson3;

import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyDeque;
import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyQueue;
import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyStack;
import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.PriorityQueue;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        int key =  1;
        while (key != 0) {
            System.out.println("Выберете пункт меню:\n");
            System.out.println("1. Начать работу со стеком");
            System.out.println("2. Начать работу с очередью");
            System.out.println("3. Начать работу с дэком");
            System.out.println("4. Начать работу с списком с приоритетом");
            System.out.println("5. Перевернуть строку при помощи стэка");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key) {
                case 1:
                    workMyStack();
                    break;
                case 2:
                    workMyQueue();
                    break;
                case 3:
                    workMyDeck();
                    break;
                case 4:
                    workMyPriorityQueue();
                    break;
                case 5:
                    reventString();
                    break;
            }
        }
    }

    private static void reventString() {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArray = str.toCharArray();
        MyStack myStack = new MyStack();
        for (char ch : charArray) {
            myStack.push(ch);
        }
        int count = myStack.getSize();
        for (int i = 0; i < count; i++) {
            System.out.print(myStack.pop());
        }
        System.out.println();
    }

    private static void workMyStack() {
        int key =  1;
        MyStack myStack = new MyStack();
        while (key != 0) {
            System.out.println("Выберете пункт меню:\n");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Взять элемент");
            System.out.println("3. Посмотреть элемент");
            System.out.println("4. Посмотреть весь стэк");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    Scanner element = new Scanner(System.in);
                    myStack.push(element.next());
                    System.out.println();
                    break;
                case 2:
                    System.out.println(myStack.pop());
                    break;
                case 3:
                    System.out.println(myStack.peek());
                    break;
                case 4:
                    System.out.println(myStack.toString());
                    break;
            }
        }
    }

    private static void workMyQueue() {
        int key =  1;
        MyQueue myQueue = new MyQueue();
        while (key != 0) {
            System.out.println("Выберете пункт меню:\n");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Взять элемент");
            System.out.println("3. Посмотреть элемент");
            System.out.println("4. Посмотреть весь стэк");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    Scanner element = new Scanner(System.in);
                    System.out.println();
                    myQueue.push(element.next());
                    break;
                case 2:
                    System.out.println(myQueue.pop());
                    break;
                case 3:
                    System.out.println(myQueue.peek());
                    break;
                case 4:
                    System.out.println(myQueue.toString());
                    break;
            }
        }
    }

    private static void workMyDeck() {
        int key =  1;
        MyDeque myDeque = new MyDeque();
        Scanner element;
        while (key != 0) {
            System.out.println("Выберете пункт меню:\n");
            System.out.println("1. Добавить элемент в начало");
            System.out.println("2. Добавить элемент в конец");
            System.out.println("3. Получить элемент с начала");
            System.out.println("4. Получить элемент с конца");
            System.out.println("5. Посмотреть элемент с начала");
            System.out.println("6. Посмотреть элемент с конца");
            System.out.println("7. Вывести все на печать");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Введите элемент для добавления: ");
                    element = new Scanner(System.in);
                    System.out.println();
                    myDeque.push(element.next(), false);
                    break;
                case 2:
                    System.out.print("Введите элемент для добавления: ");
                    element = new Scanner(System.in);
                    System.out.println();
                    myDeque.push(element.next(), true);
                    break;
                case 3:
                    System.out.println(myDeque.pop(false));
                    break;
                case 4:
                    System.out.println(myDeque.pop(true));
                    break;
                case 5:
                    System.out.println(myDeque.peek(false));
                    break;
                case 6:
                    System.out.println(myDeque.peek(true));
                    break;
                case 7:
                    System.out.println(myDeque.toString());
                    break;
            }
        }
    }

    private static void workMyPriorityQueue() {
        int key =  1;
        PriorityQueue priorityQueue = new PriorityQueue();
        while (key != 0) {
            System.out.println("Выберете пункт меню:\n");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Получить элемент с максимальным приоритетом");
            System.out.println("3. Получить элемент с минимальным приоритетом");
            System.out.println("4. Посмотреть элемент с максимальным приоритетом");
            System.out.println("5. Посмотреть элемент с минимальным приоритетом");
            System.out.println("6. Вывести весь список от максимального к минимальному приоритету");
            System.out.println("7. Вывести весь список без учета приоритета");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Введите приоритет (целое число):  ");
                    Scanner scKey = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Введите значение:  ");
                    Scanner scValue = new Scanner(System.in);
                    System.out.println();
                    priorityQueue.insertElement(scKey.nextInt(), scValue.next());
                    break;
                case 2:
                    System.out.println(priorityQueue.extractMaximumPriority());
                    break;
                case 3:
                    System.out.println(priorityQueue.extactMinimumPriority());
                    break;
                case 4:
                    System.out.println(priorityQueue.getMaximumPriority());
                    break;
                case 5:
                    System.out.println(priorityQueue.getMinimumPriority());
                    break;
                case 6:
                    System.out.println(priorityQueue.toString(true));
                    break;
                case 7:
                    System.out.println(priorityQueue.toString(false));
                    break;
            }
        }
    }
}
