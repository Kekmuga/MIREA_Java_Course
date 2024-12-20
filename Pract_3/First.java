package Pract_3;
import java.util.*;
public class First {

    public static void vivod(double[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            System.out.printf(" %f ", array[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        double[] array = new double[10];
        System.out.printf("The first method\n Unsorted: \n [ ");
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextDouble(10);
        }
        vivod(array);
        System.out.printf(" ]\n");
        Arrays.sort(array);
        System.out.printf(" Sorted: \n [ ");
        vivod(array);
        System.out.printf(" ]");
        System.out.printf("\nThe Second method\n Unsorted: \n [ ");
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        vivod(array);
        System.out.printf(" ]\n");
        Arrays.sort(array);
        System.out.printf(" Sorted: \n [ ");
        vivod(array);
        System.out.printf(" ]");
    }
}