package Pract_8;

import java.util.Scanner;

public class Tabytask4 {
    public static int maxim(int catcha, int maxa){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int prikol = 0;
        try{
            prikol = Integer.parseInt(text);
        } catch (NumberFormatException er){
            System.out.println("Это не число :(");
            return 0;
        }
        if (prikol == 0){
            return catcha;
        }
        if (prikol == maxa){
            return maxim(catcha+1, maxa);
        }
        if (prikol > maxa){
            return maxim(1, prikol);
        }
        return maxim(catcha, maxa);
    }
    public static void main(String[] args){
        System.out.println(maxim(0,0));
    }
}
