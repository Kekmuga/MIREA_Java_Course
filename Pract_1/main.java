package Pract_1;
import java.util.Scanner;
public class main {
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args){
        int[] numbers1 = {2, 4, 6, 8, 10};
        int sum = 0;
        int number1 = 5;


        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
        }

        double average = (double) sum / numbers1.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        int result = calculateFactorial(number1);

        System.out.println("Факториал числа " + number1 + " равен: " + result);
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("H%d = %.4f\n", i, harmonic);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Ввод элементов массива
        int i = 0;
        while (i < n){
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        }

        sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        i = 0;

        // Вычисляем сумму, минимальное и максимальное значение
        while (i < n) {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            i++;
        }

        // Вывод результата
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}