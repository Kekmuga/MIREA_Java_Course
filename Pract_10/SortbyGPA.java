package Pract_10;

import java.util.Comparator;

public class SortbyGPA implements Comparator<StudenT> {
    @Override
    public int compare(StudenT o1, StudenT o2) {
        if (o1.getGPA() > o2.getGPA()){
            return -1;
        }
        if (o1.getGPA() < o2.getGPA()){
            return 1;
        }
        return 0;
    }
}
