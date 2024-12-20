package Pract_6;

public class Convertione {
    static class converta implements Convertus{
        int temp;

        public converta(int temp) {
            this.temp = temp;
        }

        public int ConvertToKel(){
            return temp - 273;
        }
        public int ConvertToFr(){
            return  (temp * 9/5) + 32;
        }
    }
    public static void main(String[] args){
        converta prikol = new converta(32);
        System.out.println(prikol.ConvertToFr());
        System.out.println(prikol.ConvertToKel());
    }
}
