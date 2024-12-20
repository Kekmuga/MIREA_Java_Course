package Pract_8;

public class Tabytask2 {
    public static void otAtoN(int a, int base){
        if (a == base){
            System.out.println(a);
            return;
        } else if (a < base) {
            System.out.println(a);
            otAtoN(a+1, base);
        } else {
            System.out.println(a);
            otAtoN(a -1,base);
        }
    }
    public static  void main(String[] args){
        otAtoN(3, 8);
    }
}