package Pract_14;

import java.util.regex.*;

public class Secnd {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s+(USD|RUB|EU)");

        Matcher matcher1 = pattern.matcher("25.98 USD, 1200 RUB, 15.50 EUR, 44 ERR, 0.004 EU, " +
                "$30.50, 10000 рублей, €22.99, 75.20 USD, 5000 RUB, 10.00 EUR, 99.99 USD");
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
    }
}
