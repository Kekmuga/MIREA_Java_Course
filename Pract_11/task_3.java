package Pract_11;

public class task_3 {
    public class StudentDat {

        private int idNum;
        private int GPA;
        private String name;

        public StudentDat(String name, int idNum, int GPA) {
            this.name = name;
            this.idNum = idNum;
            this.GPA = GPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name=" + name +
                    ", idNum=" + idNum +
                    ", GPA=" + GPA +
                    '}';
        }

        public int getIdNum() {
            return idNum;
        }

        public void setIdNum(int idNum) {
            this.idNum = idNum;
        }

    }
}
