package Pract_4;

public class Atel {
    public static class Uchashchijsya {
        protected String name;

        public Uchashchijsya(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Shkolnik extends Uchashchijsya {
        public String clas;

        public Shkolnik(String name, String clasa) {
            super(name);
            clas = clasa;
        }

        @Override
        public String toString() {
            return "Школьник: " + name+
                    "\n Класс:" + clas;
        }
    }

    public static class Student extends Uchashchijsya {
        public String group;
        public Student(String name, String grupa) {
            super(name);
            group = grupa;
        }

        @Override
        public String toString() {
            return "Студент: " + name+
                    "\n Группа:" + group;
        }
    }

    public static void main(String[] args) {
        Uchashchijsya[] uchashchijsyaArray = new Uchashchijsya[5];

        uchashchijsyaArray[0] = new Shkolnik("Иван","3В");
        uchashchijsyaArray[1] = new Shkolnik("Иван","4А");
        uchashchijsyaArray[2] = new Student("Иван","LLOL.26.34" );
        uchashchijsyaArray[3] = new Student("Иван", "Kaif.27.00");
        uchashchijsyaArray[4] = new Student("Иван", "Iava.02.117");
        System.out.println("Школьники:");
        for (Uchashchijsya uchen : uchashchijsyaArray) {
            if (uchen instanceof Shkolnik) {
                System.out.println(uchen.toString());
            }
        }
        System.out.println("Студенты:");
        for (Uchashchijsya uchen : uchashchijsyaArray) {
            if (uchen instanceof Student) {
                System.out.println(uchen.toString());
            }
        }

    }
}