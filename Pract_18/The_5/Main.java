package Pract_18.The_5;

public class Main {
    public static class ThrowsDemo {
        public void getDetails(String key) {
            try{
                key.toCharArray();
            } catch (NullPointerException e){
                System.out.println("Catch NullPointerException");
            }
        }
    }
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getDetails(null);
    }
}
