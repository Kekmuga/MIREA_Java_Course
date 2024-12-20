package Pract_3;

public class Second {
    public static void main(String[] args) {
        Double x = Double.valueOf(9);
        Double y = Double.valueOf(6);
        String jij = "100";
        // Преобразуем string в double
        x = Double.parseDouble(jij);
        double doubleValue = x.doubleValue();
        // Преобразуем в примитивный тип float
        float floatValue = x.floatValue();
        // Преобразуем в примитивный тип long
        long longValue = x.longValue();
        // Преобразуем в примитивный тип int
        int intValue = x.intValue();
        // Преобразуем в примитивный тип short
        short shortValue = x.shortValue();
        // Преобразуем в примитивный тип byte
        byte byteValue = x.byteValue();
        // Выводим результаты
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
        String d = Double.toString(doubleValue);
        System.out.printf("String from double " + d);
    }
}
