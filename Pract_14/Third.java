package Pract_14;

import java.util.regex.*;

public class Third{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s+\\+");

        Matcher matcher1 = pattern.matcher("(1 + 8) – 9 / 4");
        Matcher matcher2 = pattern.matcher("6 / 5 – 2 * 9");

        if (matcher1.find()){
            System.out.println("(1 + 8) – 9 / 4: false");
        } else {System.out.println("(1 + 8) – 9 / 4: true");}
        if (matcher2.find()){
            System.out.println("6 / 5 – 2 * 9: false");
        } else {System.out.println("6 / 5 – 2 * 9: true");}
    }
}