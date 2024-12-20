package Pract_13;

public class first {
    public static void strokus(String lol){
        System.out.println(
           "Last char: "  + lol.charAt(lol.length()-1) +
            "\nDoes it ends: " + lol.endsWith("!!!")  +
            "\nDoes it stars: " + lol.startsWith("I like") +
            "\nContains?: " + lol.contains("Java") +
            "\nIndexOf: " + lol.indexOf("I like Java!!!") +
            "\nreplace: " + lol.replace("a", "0") +
            "\nupperclas: " + lol.toUpperCase() +
            "\nlower: "   + lol.toLowerCase() +
            "\nparsing: " + lol.substring(lol.length() -1)
        );
    }


    public static void main(String[] args) {
        String stroka = new String("I like Java!!!");
        strokus(stroka);
    }

}
