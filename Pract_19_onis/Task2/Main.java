package Pract_19_onis.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 3.4f));
        s.add(new Student("ФИО2", 2.8f));
        s.add(new Student("ФИО3", 4.0f));
        s.add(new Student("ФИО4", 5.0f));
        s.add(new Student("ФИО5", 4.9f));

        new MainFrame(s);
    }
}
