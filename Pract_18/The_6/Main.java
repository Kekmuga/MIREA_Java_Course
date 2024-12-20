package Pract_18.The_6;

public class Main {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (NullPointerException e){
                System.out.println("Catch NullPointerException");
            }
        }

        public String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails ");
            }
            return "data for " + key;
        }
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage("papa");
        throwsDemo.printMessage(null);
    }
}
