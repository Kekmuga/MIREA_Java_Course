package Pract_7;

public class Sringus implements StringProcessor {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String oddChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        StringProcessor sp = new Sringus();

        String text = "прикол";
        System.out.println("Количество символов: " + sp.countChars(text));
        System.out.println("Символы на нечетных позициях: " + sp.oddChars(text));
        System.out.println("Обратная строка: " + sp.reverseString(text));
    }
}
