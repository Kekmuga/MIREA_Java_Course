package Pract_14;

import java.util.regex.*;

public class Fisrt {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher1 = pattern.matcher("abcdefghijklmnopqrstuv18340");
        Matcher matcher2 = pattern.matcher("abcdefghijklmnoasdfasdpqrstuv18340.");

        System.out.println("abcdefghijklmnopqrstuv18340" + ": " + matcher1.matches());
        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340." + ": " + matcher2.matches());
    }
}

