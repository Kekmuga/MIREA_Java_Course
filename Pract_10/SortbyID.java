package Pract_10;

import java.util.Comparator;

public class SortbyID implements Comparator<StudenT> {
    @Override
    public int compare(StudenT o1, StudenT o2) {
        if (o1.getID() > o2.getID()){
            return -1;
        }
        if (o1.getID() < o2.getID()){
            return 1;
        }
        return 0;
    }
}


