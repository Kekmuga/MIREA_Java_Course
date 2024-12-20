package task22.punkt1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class taskus5{

    private static final int SIZE = 100000;
    private static final int OPERATIONS = 10000;

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            data.add(random.nextInt(1000));
        }
        testList("ArrayList", data);
        System.out.println("\n");
        testList("LinkedList", data);
    }

    private static void testList(String listType, List<Integer> list) {
        long startTime, endTime;
        Random random = new Random();

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.add(0, random.nextInt(1000));
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Вставка в начало: " + (endTime - startTime) / 1000000 + " мс");

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.add(list.size() / 2, random.nextInt(1000)); // Вставка в середину
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Вставка в середину: " + (endTime - startTime) / 1000000 + " мс");

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Удаление из начала: " + (endTime - startTime) / 1000000 + " мс");

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.remove(list.size() / 2);
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Удаление из середины: " + (endTime - startTime) / 1000000 + " мс");

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.contains(random.nextInt(1000));
        }
        endTime = System.nanoTime();
        System.out.println(listType + " - Поиск по образцу: " + (endTime - startTime) / 1000000 + " мс");
    }
}