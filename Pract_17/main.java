package Pract_17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        Pattern pattern1 = Pattern.compile("[A-Z]{1}[a-z]*");
        Pattern pattern2 = Pattern.compile("\\d+");
        String s = "";
        String group = "";
        while(true){
            System.out.print("""
                    Выберите пункт:
                    0.Выход из программы
                    1.Добавление элемента
                    2.Удаление элемента
                    3.Вывод элемента
                    4.Очистка списка
                    5.Проверка списка на пустоту
                    """);

            sc = new Scanner(System.in);
            s = sc.next();

            switch (s){
                case "0":
                    return;

                case "1":
                    String name = "";
                    String stringAge = "";
                    group = "";
                    while (name.isEmpty()) {
                        sc = new Scanner(System.in);
                        System.out.println("Введите имя:");
                        name = sc.next();
                        Matcher matcher = pattern1.matcher(name);
                        if(matcher.find()){
                            group = matcher.group();
                        }
                        if(!name.equals(group)) {
                            name = "";
                            System.out.println("Неверный ввод");
                        }
                    }
                    while (stringAge.isEmpty()) {
                        sc = new Scanner(System.in);
                        System.out.println("Введите возраст:");
                        stringAge = sc.next();
                        Matcher matcher = pattern2.matcher(stringAge);
                        if(matcher.find()){
                            group = matcher.group();
                        }
                        if(!stringAge.equals(group)) {
                            stringAge = "";
                            System.out.println("Неверный ввод");
                        }
                    }
                    int age = Integer.parseInt(stringAge);
                    myLinkedList.add(new Student(name, age));
                    System.out.println("Элемент успешно добавлен");
                    break;

                case "2":
                    String stringNum = "";
                    group = "";
                    while (stringNum.isEmpty()) {
                        sc = new Scanner(System.in);
                        System.out.println("Введите номер элемента");
                        stringNum = sc.next();
                        Matcher matcher = pattern2.matcher(stringNum);
                        if(matcher.find()){
                            group = matcher.group();
                        }
                        if(!stringNum.equals(group)) {
                            stringNum = "";
                            System.out.println("Неверный ввод");
                        }
                    }
                    int num = Integer.parseInt(stringNum);
                    if(num < 1 || num > myLinkedList.size())
                        System.out.println("Нет элемента под таким номером");
                    else {
                        myLinkedList.remove(num);
                        System.out.println("Элемент успешно удален");
                    }
                    break;

                case "3":
                    String stringNum1 = "";
                    group = "";
                    while (stringNum1.isEmpty()) {
                        sc = new Scanner(System.in);
                        System.out.println("Введите номер элемента");
                        stringNum1 = sc.next();
                        Matcher matcher = pattern2.matcher(stringNum1);
                        if(matcher.find()){
                            group = matcher.group();
                        }
                        if(!stringNum1.equals(group)) {
                            stringNum1 = "";
                            System.out.println("Неверный ввод");
                        }
                    }
                    int num1 = Integer.parseInt(stringNum1);
                    if(num1 < 1 || num1 > myLinkedList.size())
                        System.out.println("Нет элемента под таким номером");
                    else {
                        System.out.println(myLinkedList.get(num1));
                    }
                    break;

                case "4":
                    myLinkedList.clear();
                    System.out.println("Список успешно очищен");
                    break;

                case "5":
                    if (myLinkedList.isEmpty())
                        System.out.println("Список пуст");
                    else
                        System.out.println("Список не пуст");
                    break;

                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        }
    }
}