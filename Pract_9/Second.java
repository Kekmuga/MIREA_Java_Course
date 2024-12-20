package Pract_9;
import java.util.Comparator;
import java.util.List;

public class Second implements Comparator<student> {
    @Override
    public int compare(student student1, student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public static void quickSort(List<student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex-1);
            quickSort(students, pivotIndex+1, high);
        }
    }

    private static int partition(List<student> students, int low, int high) {
        student pivot = students.get(high);
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        student temp = students.get(i+1);
        students.set(i+1, students.get(high));
        students.set(high, temp);
        return i+1;
    }
}
