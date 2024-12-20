package Pract_9;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static List<student> sortingaVsatvka(List<student> classrom){
        student cur;
        int j = 0;
        for (int i = 1; i < classrom.size(); i++){
            cur = classrom.get(i);
            j = i;
            while (j > 0 && classrom.get(j-1).compareTo(cur) == 1){
                classrom.set(j, classrom.get(j-1));
                j--;
            }
            classrom.set(j, cur);
        }
        return classrom;
    }


    public static void main(String[] args) {
        List<student> classroom = new ArrayList<student>();
        classroom.add(new student("Jora", 62));
        classroom.add(new student("Jora", 72));
        classroom.add(new student("Jora", 1));
        classroom.add(new student("Jora", 2));
        classroom.add(new student("Jora", 55));
        classroom.add(new student("Jora", -2));
        classroom = sortingaVsatvka(classroom);
        List<student> classroom2 = new ArrayList<student>();
        classroom2.add(new student("Jora", 7));
        classroom2.add(new student("Jora", 5));
        classroom2.add(new student("Jora", 3));
        classroom2.add(new student("Jora", 6));
        classroom2.add(new student("Jora", 2));
        classroom2.add(new student("Jora", 2));
        System.out.println(Third.mergeSortedLists(classroom, classroom2));
        Second.quickSort(classroom2, 0, classroom2.size()-1);
        System.out.println(classroom2);
    }
}
