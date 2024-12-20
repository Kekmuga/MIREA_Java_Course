package Pract_8;

public class Tabytask3 {
    public static int sumka(int n){
        if (n < 10){
            return n;
        } else {
            return sumka(n/10) + n%10;
        }
    }
    public static void main(String[] arsg){
        System.out.println(sumka(339));
    }
}
