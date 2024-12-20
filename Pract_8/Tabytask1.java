package Pract_8;

public class Tabytask1 {
    public static void otAtoN(int n, int base){
        if (n <= 1){
            System.out.println(base);
            return;
        }
        System.out.println(base);
        otAtoN(n - 1, base + 1);

    }
    public static  void main(String[] args){
        otAtoN(5, 1);
    }
}
