package ru.gorbachev.geekbrains.algoritm.lesson3;

import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyQueue;
import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyStack;

public class Lesson3 {

    public static void main(String[] args) {
        MyQueue myStack = new MyQueue();
        myStack.push(3);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
        System.out.println(myStack.pop());
        System.out.println(myStack.toString());
    }
}
