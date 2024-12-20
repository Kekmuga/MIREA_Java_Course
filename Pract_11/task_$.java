package Pract_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task_$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("enter day: ");
        int day = scanner.nextInt();
        System.out.print("enter hours (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        if (isValidDate(year, month, day, hours, minutes)) {
            Date date = new Date(year - 1900, month - 1, day, hours, minutes);

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DAY_OF_MONTH, day);
            cal.set(Calendar.HOUR_OF_DAY, hours);
            cal.set(Calendar.MINUTE, minutes);
            cal.set(Calendar.SECOND, 0);

            System.out.println("Date: " + date);
            System.out.println("Calendar: " + cal.getTime());
        } else {
            System.out.println("введенные данные некореектны");
        }
    }
    public static boolean isValidDate(int year, int month, int day, int hours, int minutes) {
        int b = 29;

        if ( year % 4 != 0 ||
                year  % 100 == 0 && year  % 400 != 0){
            b = 28;
        }

        int[] dayOfMonth = {31, b, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return year > 0 && month >= 1 && month <= 12 && day >= 1
                && day <= dayOfMonth[month-1] && hours >= 0 && hours < 24 && minutes >= 0 && minutes<60;
    }
}