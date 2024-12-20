package Pract_14;

import java.util.regex.*;

public class Fifth {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        String[] emails = {"user@example.com", "root@localhost", "myhost@@@com.ru", "@my.ru", "Julia String"};
        for (String email : emails) {
            Matcher matcher1 = pattern.matcher(email);
            System.out.println(email + ": " + matcher1.matches());
        }
    }
}