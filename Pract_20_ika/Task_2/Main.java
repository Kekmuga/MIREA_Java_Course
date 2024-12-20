package Pract_20_ika.Task_2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Calculator.sum(2, 3));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.sum(2.3, 5.8));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.sub(2.0, 3));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.sub(2.3, 5.8));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.mul(2.3, 5.8));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.mul(2, 3.0));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.div(2, 3.0));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.div(2.3, 5.8));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.div(2, 2.3f));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            System.out.println(Calculator.div(2, 0.0));
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }

    }
}
