package ru.gorbachev.geekbrains.algoritm.lesson4.object;

public class Student {

    private String FIO;
    private int age;
    private String cource;

    public Student(String FIO, int age, String cource) {
        this.FIO = FIO;
        this.age = age;
        this.cource = cource;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "FIO: " + FIO + ", age: " + age + ", cource: " + cource;
    }
}
