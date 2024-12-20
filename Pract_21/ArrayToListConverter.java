package Pract_21;
import java.util.ArrayList;
import java.util.List;

public class ArrayToListConverter {

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"LOl ", "kol ", "tol"," iol",
                "orange"};
        Integer[] intArray = {1, 2, 3, 4};

        List<String> stringList = convertArrayToList(stringArray);
        List<Number> numberList = convertArrayToList(intArray);

        System.out.println("Список строк: " + stringList);
        System.out.println("Список чисел: " + numberList);
    }
}

