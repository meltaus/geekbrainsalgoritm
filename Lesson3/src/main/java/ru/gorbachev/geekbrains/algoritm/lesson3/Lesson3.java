package ru.gorbachev.geekbrains.algoritm.lesson3;

import ru.gorbachev.geekbrains.algoritm.lesson3.structuredata.MyStack;

public class Lesson3 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
    }
}
