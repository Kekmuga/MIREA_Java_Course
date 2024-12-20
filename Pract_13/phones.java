package Pract_13;

public class phones {
    public static String convertNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("\\s+", "");


        if (phoneNumber.startsWith("+")) {
            if (phoneNumber.length() == 12 && phoneNumber.substring(1).matches("\\d+")) {
                String countryCode = phoneNumber.substring(1, 2);
                String numberPart = phoneNumber.substring(2);
                return "+" + countryCode + " " + numberPart.substring(0, 3) + " " + numberPart.substring(3, 6) + " " + numberPart.substring(6);
            }
            else if (phoneNumber.length() == 13) {
                String countryCode = phoneNumber.substring(1, 3);
                String numberPart = phoneNumber.substring(3);
                return "+" + countryCode + " " + numberPart.substring(0, 3) + " " + numberPart.substring(3, 6) + " " + numberPart.substring(6);
            }
        } else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11 && phoneNumber.substring(1).matches("\\d+")) {
            String numberPart = phoneNumber.substring(1);
            return "+7 " + numberPart.substring(0, 3) + " " + numberPart.substring(3, 6) + " " + numberPart.substring(6);
        }

        return phoneNumber + " cannot possible to use this string";
    }
}