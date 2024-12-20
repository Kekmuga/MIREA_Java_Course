package Pract_18.The_1;

public class Main {
    public static class Exception1 {
        public void exceptionDemo() {
            try{
                System.out.println( 2 / 0 );
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }
}
