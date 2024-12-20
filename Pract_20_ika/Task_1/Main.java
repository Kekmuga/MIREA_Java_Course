package Pract_20_ika.Task_1;

public class Main {
    public static void main(String[] args) {
        TVK<String, Animal, Integer> tvk = new TVK("abcd", new Animal("kartoshka"), 5);
        tvk.getClasses();

        MinMax<Integer> integerMinMax = new MinMax<>(new Integer[]{3, 5, 10, 11, 0, 5, -3, -2});
        System.out.println(integerMinMax.min());
        System.out.println(integerMinMax.max());

        MinMax<String> stringMinMax = new MinMax<>(new String[]{"Nadya", "Roma", "Kirill", "Oda Nobunaga"});
        System.out.println(stringMinMax.min());
        System.out.println(stringMinMax.max());
    }
}
