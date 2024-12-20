package Pract_14;

import java.util.regex.*;

public class Fourth {
    public static void main(String[] args) {
        String[] dates = {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001",
                "30-04-2003", "1/1/1899", "31/04/2024", "29/02/2024"};
        for (String date : dates) {
            System.out.println(date + ": " + isValidDate(date));
        }
    }
    public static boolean isValidDate(String date){
        Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\" +
                "/(19\\d\\d|2\\d{3}|[3-9]\\d{3})");
        Matcher matcher = pattern.matcher(date);

        if (!matcher.matches()) return false;

        String[] dateParts = date.split("/");
        int b = 29;
        if ( Integer.parseInt(dateParts[2])  % 4 != 0 ||
                Integer.parseInt(dateParts[2])  % 100 == 0 && Integer.parseInt(dateParts[2])  % 400 != 0){
            b = 28;
        }
        int[] dayOfMonth = {31, b, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(dateParts[1]) - 1;
        int day = Integer.parseInt(dateParts[0]);
        if (month >=0 && month<=11){
            return day >= 1 && day <= dayOfMonth[month];
        }
        return true;
    }
}