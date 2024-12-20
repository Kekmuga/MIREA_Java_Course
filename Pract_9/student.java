package Pract_9;

public class student implements Comparable<student> {
    String name;
    int ID;
    int GPA;

    public student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "[name: " + name + " | " +
                "ID: " + ID + " | ";
    }

    @Override
    public int compareTo(student o) {
        if (ID < o.getID()){
            return 1;
        }
        if (ID > o.getID()){
            return -1;
        }
        return 0;
    }
}
