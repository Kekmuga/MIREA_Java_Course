package Pract_11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class task_1 {
    public static void main(String[] args) {
        String developerLastName = "Wolfeschlegelsteinhausenbergerdorff";

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, 3);
        cal.add(Calendar.YEAR, 0);
        cal.add(Calendar.MONTH, 3);
        cal.add(Calendar.DAY_OF_MONTH, 6);
        SimpleDateFormat format = new SimpleDateFormat("E MMM d HH:mm:ss zzz YYYY", Locale.US);

        Date taskCompleted = new Date();

        System.out.println("Developer Surname: " + developerLastName);
        System.out.println("Post prinal: " + format.format(cal.getTime()));
        System.out.println("Post zdal " + taskCompleted);
    }
}