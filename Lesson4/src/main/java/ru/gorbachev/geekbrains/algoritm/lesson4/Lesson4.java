package ru.gorbachev.geekbrains.algoritm.lesson4;

import ru.gorbachev.geekbrains.algoritm.lesson4.LinkedList.LinkedList;
import ru.gorbachev.geekbrains.algoritm.lesson4.object.Student;

public class Lesson4 {

    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.insert(new Student("Горбачев Артем Эдуардович", 25, "Java"));
        linkedList.insert(new Student("Горбачева Анастасия Павловна", 25, "Рукоделье"));
        linkedList.insert(new Student("Пугачева Анна Павловна", 20, "Бухгалтерия"));
        linkedList.insert(new Student("Горбачева Елена Александровна", 46, "ИП"));

    }
}
