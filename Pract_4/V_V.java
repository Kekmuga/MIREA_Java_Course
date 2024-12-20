package Pract_4;

import java.util.logging.Level;

public class V_V {
    public enum Vremena {
        SUMMER(100),
        WINTER(-257),
        Osen(26),
        SPRING(2);

        public static void Ilove(Vremena god){
            switch (god){
                case SUMMER: System.out.printf("I love Summer"); break;
                case WINTER: System.out.printf("I love Winter"); break;
                case Osen: System.out.printf("I love osen"); break;
                case SPRING: System.out.printf("I love sping"); break;
            }
        }
        public static String getDescription(Vremena god){
            String gig = "";
            switch (god){
                case SUMMER: gig = "Warm"; break;
                case WINTER: gig = "Super cold"; break;
                case Osen: gig = "Norm cold"; break;
                case SPRING: gig = "Kaif"; break;
            }
            return gig;
        }
        private final int Average;
        private Vremena(int Average) {
            this.Average = Average;
        }

        public int getAverage() {
            return Average;
        }
    }
public static void main(String[] args) {
        for (Vremena season: Vremena.values()){
            System.out.println(season + ":");
            Vremena.Ilove(season);
            System.out.println("\n" + Vremena.getDescription(season));
            System.out.println("Average temp = " + season.getAverage());
        }
}
}
