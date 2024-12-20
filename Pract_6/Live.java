package Pract_6;

public class Live {
    static class Human implements Priceble {
        public String name;
        int price;

        Human(String name, int price){
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return this.name;
        }

        public int getPrice(){
            return this.price;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "author='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    public static void main(String[] args) {
        Priceble j = new Human("f", 32);
        System.out.println(j.getPrice());
    }
}
