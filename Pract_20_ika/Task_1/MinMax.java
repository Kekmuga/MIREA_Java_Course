package Pract_20_ika.Task_1;

public class MinMax<T extends Comparable<T>> {
    T[] mas;

    public MinMax(T[] mas) {
        this.mas = mas;
    }

    public T min(){
        T min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(min.compareTo(mas[i]) > 0)
                min = mas[i];
        }

        return min;
    }

    public T max(){
        T max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(max.compareTo(mas[i]) < 0)
                max = mas[i];
        }

        return max;
    }
}
