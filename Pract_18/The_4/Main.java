package Pract_18.The_4;

import java.util.Scanner;

public class Main {
    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException");
                }
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            }
            finally {
                System.out.println("А я не убегу никуда =^=");
            }
        }
    }
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}