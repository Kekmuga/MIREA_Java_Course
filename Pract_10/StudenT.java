package Pract_10;

public class StudenT {
    String name;
    int ID;
    int GPA;

    public StudenT(String name, int ID, int GPA) {
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
        return "( ID:" + ID + " | GPA:" +
                GPA + ')';
    }

}