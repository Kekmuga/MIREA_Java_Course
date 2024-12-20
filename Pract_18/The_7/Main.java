package Pract_18.The_7;

import java.util.Scanner;

public class Main {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            while(true) {
                try {
                    printDetails(key);
                    return;
                } catch (Exception _) { }
            }
        }
        public void printDetails(String key) throws Exception {
            try {
                String message = getDetails(key);
                System.out.println(message);
            }catch (Exception e){
                throw e;
            }
        }
        private String getDetails(String key) throws Exception{
            if(key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key; }
    }
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
