package Pract_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingStudents {
    public static void setArray(List<StudenT> lst, StudenT lol){
        lst.add(lol);
    }

    public static void printa(List<StudenT> lst){
        System.out.println(lst);
    }

    public static void quickSort(List<StudenT> studenTS, int low, int high, Comparator<StudenT> comp) {
        if (low < high) {
            int pivotIndex = partition(studenTS, low, high, comp);
            quickSort(studenTS, low, pivotIndex-1, comp);
            quickSort(studenTS, pivotIndex+1, high, comp);
        }
    }

    private static int partition(List<StudenT> studenTS, int low, int high, Comparator<StudenT> comp) {
        StudenT pivot = studenTS.get(high);
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (comp.compare(studenTS.get(j), pivot) <= 0) {
                i++;
                StudenT temp = studenTS.get(i);
                studenTS.set(i, studenTS.get(j));
                studenTS.set(j, temp);
            }
        }

        StudenT temp = studenTS.get(i+1);
        studenTS.set(i+1, studenTS.get(high));
        studenTS.set(high, temp);
        return i+1;
    }
    public static List<StudenT> mergeSortedLists(List<StudenT> list1, List<StudenT> list2, Comparator<StudenT> comp) {
        List<StudenT> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (comp.compare(list1.get(i), list2.get(j)) <= 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    public static void Merging(List<List<StudenT>> lol, Comparator<StudenT> comp){
        int i = 0;
        List<List<StudenT>> kok_new = new ArrayList<>();
        while (i+1 <= lol.size()-1){
            kok_new.add(mergeSortedLists(lol.get(i), lol.get(i+1), comp));
            i += 2;
        }
        if (lol.size() % 2 != 0){
            kok_new.add(lol.get(lol.size()-1));
        }
        lol.clear();
        lol.addAll(kok_new);
        kok_new.clear();
    }
    public static List<StudenT> MergeSort(List<StudenT> list, Comparator<StudenT> comp){
        List<List<StudenT>> kok = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            List<StudenT> jij = new ArrayList<>();
            jij.add(list.get(i));
            kok.add(jij);
        }
        while(kok.size() > 1){
            Merging(kok, comp);
            //System.out.println(kok);
        }
        return kok.get(0);
    }


    public static void main(String[] args) {
        long startTime, endTime;
        Random random = new Random();
        List<StudenT> classroom_rand1 = new ArrayList<StudenT>();
        List<StudenT> classroom_rand2 = new ArrayList<StudenT>();
        for (int i = 0; i < 10000; i++){
            classroom_rand1.add(new StudenT("Jora", random.nextInt(1000), random.nextInt(1000)));
            classroom_rand2.add(new StudenT("Jora", random.nextInt(1000), random.nextInt(1000)));
        }
        startTime = System.nanoTime();
        MergeSort(classroom_rand1, new SortbyGPA());
        endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000 + " ms  - MergeSort\n");
        startTime = System.nanoTime();
        quickSort(classroom_rand2,0, classroom_rand2.size()-1, new SortbyGPA());
        endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000 + " ms  - QuikaSorta\n");
        List<StudenT> classroom = new ArrayList<StudenT>();
        classroom.add(new StudenT("Jora11", 22, 0));
        classroom.add(new StudenT("Jora12", 12, 0));
        classroom.add(new StudenT("Jora13", 32, -1));
        classroom.add(new StudenT("Jora14", 52, 0));
        classroom.add(new StudenT("Jora15", 62, 7));
        classroom.add(new StudenT("Jora16", 82, 7));
        List<StudenT> classroom2 = new ArrayList<StudenT>();
        classroom2.add(new StudenT("Jora21", 252, 211));
        classroom2.add(new StudenT("Jora22", 1522, 14215));
        classroom2.add(new StudenT("Jora23", 2322, 215));
        classroom2.add(new StudenT("Jora24", 522, 14121));
        classroom2.add(new StudenT("Jora25", 622, 715));
        classroom2.add(new StudenT("Jora26", 822, 5615));

        //quickSort(classroom,0, classroom.size()-1, new SortbyGPA());
        //quickSort(classroom2,0, classroom.size()-1, new SortbyGPA());
        List<StudenT> prikol = mergeSortedLists(classroom, classroom2, new SortbyGPA());
        //printa(prikol);
        System.out.println(MergeSort(classroom, new SortbyGPA()));

    }
}
