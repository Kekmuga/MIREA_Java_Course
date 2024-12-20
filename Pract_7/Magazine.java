package Pract_7;


public class Magazine {
    static class bok implements Cosco{
        int price;
        String autha;

        public bok(int price, String autha) {
            this.price = price;
            this.autha = autha;
        }

        public void printa(){
            System.out.println(autha);
        }

        public void printBooks(Cosco[] Cosco_){
            for (Cosco product : Cosco_){
                if (product instanceof bok){
                    product.printa();
                }
            }

        }
    }
    static class mag implements Cosco{
        int price;
        String kaif;

        public mag(int price, String kaif) {
            this.price = price;
            this.kaif = kaif;
        }

        public void printa(){
            System.out.println(kaif);
        }

        public void printMag(Cosco[] Cosco_){
            for (Cosco product : Cosco_){
                if (product instanceof mag){
                    product.printa();
                }
            }

        }
    }
    public static void main(String[] args) {
        Cosco[] magarray = new Cosco[5];
        magarray[0] = new bok(23, "jija");
        magarray[1] = new bok(23, "pork");
        magarray[2] = new mag(23, "gamestop");
        magarray[3] = new bok(23, "ham");
        magarray[4] = new mag(23, "new_yo");
        bok obj_bok = new bok(0,"");
        obj_bok.printBooks(magarray);
        System.out.println("");
        mag obj_mag = new mag(0, "");
        obj_mag.printMag(magarray);
    }
}
