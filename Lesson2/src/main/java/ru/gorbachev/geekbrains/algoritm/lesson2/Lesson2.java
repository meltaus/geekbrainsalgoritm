package ru.gorbachev.geekbrains.algoritm.lesson2;

import ru.gorbachev.geekbrains.algoritm.lesson2.object.BigArray;

import java.util.Scanner;

public class Lesson2 {

    private static BigArray bigArray;

    public static void main(String[] args) {
        int key =  1;
        while (key != 0) {
            System.out.println("Выберете пункт меню");
            System.out.println("1. Создать массив размером 1000000");
            System.out.println("2. Создать массив своего размера");
            System.out.println("3. Удалить элемент (указать индекс)");
            System.out.println("4. Добавить элемент");
            System.out.println("5. Найти элемент (по значению). Вернется индекс первого встречного элемента");
            System.out.println("6. Сделать сортировку выбором и отобразить результат");
            System.out.println("7. Сделать сортировку вставками и отобразить результат");
            System.out.println("8. Сделать сортировку пузырьком и отобразить результат");
            System.out.println("9. Сделать все сортировки и сравнить результат (только время выполнения)");
            System.out.println("10. Показать массив");
            System.out.println("0. выход");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            switch (key){
                case 1:
                    bigArray = new BigArray();
                    break;
                case 2:
                    System.out.println("Введите размер массива:");
                    int size = sc.nextInt();
                    if (size <= 0) {
                        System.out.println("Введите корректное значение");
                        while (size <- 0) {
                            size = sc.nextInt();
                        }
                    } else {
                        bigArray = new BigArray(size);
                    }
                    break;
                case 3:
                    System.out.println("Укажите индекс элемента:");
                    int index = sc.nextInt();
                    if (index > bigArray.getSizeArray()) {
                        System.out.println("Введите корректное значение");
                        while (index > bigArray.getSizeArray()) {
                            index = sc.nextInt();
                        }
                    } else {
                        bigArray.deleteElement(index);
                    }
                    break;
                case 4:
                    System.out.println("Введите элемент для добавления:");
                    bigArray.addElement(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Введите элемент для поиска:");
                    int search_index = bigArray.searchElement(sc.nextInt());
                    if (search_index == -1) {
                        System.out.println("Совпадений нет");
                    } else {
                        System.out.println("Совпадение на позиции " + search_index);
                    }
                    break;
                case 6:
                    System.out.println(bigArray.printArray(bigArray.sortBySelection()));
                    System.out.println("Время затраченное на сортировку: " + bigArray.getTimeSortSelect());
                    break;
                case 7:
                    System.out.println(bigArray.printArray(bigArray.insertSort()));
                    System.out.println("Время затраченное на сортировку: " + bigArray.getTimeSortInsert());
                    break;
                case 8:
                    System.out.println(bigArray.printArray(bigArray.bubbleSort()));
                    System.out.println("Время затраченное на сортировку: " + bigArray.getTimeSortBubble());
                    break;
                case 9:
                    bigArray.runAllSort();
                    System.out.println("Время затраченное на сортировку пузырьком :" + bigArray.getTimeSortBubble());
                    System.out.println("Время затраченное на сортировку выбором:" + bigArray.getTimeSortSelect());
                    System.out.println("Время затраченное на сортировку вставкой:" + bigArray.getTimeSortInsert());
                    break;
                case 10:
                    System.out.println(bigArray.toString());
                    break;
            }
        }
//        bigArray = new BigArray(1000);
//        System.out.println(bigArray.toString());
//        bigArray.bubbleSort();
//        bigArray.deleteElement(5);
//        System.out.println(bigArray.toString());
//        bigArray.addElement(5000);
//        System.out.println();
//        System.out.println(bigArray.toString());
//        int indexElement =bigArray.searchElement(7);
//        if (indexElement > -1) {
//            System.out.println(bigArray.getArray()[indexElement]);
//            System.out.println(indexElement);
//        } else {
//            System.out.println("Совпадения не найдено");
//        }
    }
}
