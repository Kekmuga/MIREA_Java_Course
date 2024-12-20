package Pract_11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Write a date in format DD.MM.YYYY: \n");
        String inputDateStr = scanner.nextLine();

        try {
            LocalDate inputDate = LocalDate.parse(inputDateStr);
            LocalDate currentDateTime = LocalDate.now();


            DateTimeFormatter newformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            System.out.println("Input data: " + newformat.format(inputDate));
            System.out.println("Cur daya: " + newformat.format(currentDateTime));

            if (inputDate.isBefore(currentDateTime)) {
                System.out.println("Earlier");
            } else if (inputDate.isAfter(currentDateTime)) {
                System.out.println("Later");
            } else {
                System.out.println("The same");
            }
        } catch (DateTimeParseException e) {
            System.out.println("WAT?");
        }

    }

}