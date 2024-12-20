package Pract_13;

public class Test_third {
    public static void main(String[] args) {
        String lol =  "Стран132а, Ре14гион, Горо5д, Ули14ца, До5м, Корп1ус, Квартир1а";
        String input1 = "Россия,Московская область,Реутов,ул Советская,37,-,110";
        String input2 = "США;Калифорния.Лос-Анджелес;Sunset Boulevard;123;A;456";
        String input3 = "Канада.Альберта;Калгари.Даунтаун.5.Б.7";
        String input4 = "Великобритания;Англия,Лондон,Оксфорд стрит,25,,1001";
        Third prikol1 = new Third();
        prikol1.Parser(lol, ",");
        System.out.println(prikol1.ToString() + "\n");
        prikol1.Parser(input2, ";" );
        System.out.println(prikol1.ToString());
        prikol1.Parser(input3, "-");
        System.out.println(prikol1.ToString());
    }
}
