package Pract_6;

public class Book {
    static class Bookus implements Priceble, Printable {
        public String author;
        int price;

        Bookus(String author, int price){
            this.author = author;
            this.price = price;
        }

        public void print(){
            System.out.println(author);
        }

        public int getPrice(){
            return this.price;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    public static void main(String[] args) {
        Bookus j = new Bookus("Evange", 32);
        System.out.println(j.getPrice());
        j.print();
        Priceble[] lol = new Priceble[4];
        lol[0] = j;
        lol[1] = new Live.Human("Nikita", 23);
        lol[2] = new Live.Human("Jenya", 1);
        lol[3] = new Bookus("Wawawa", 7);
        for (Priceble prikol : lol){
            System.out.println(prikol.getPrice());
        }
    }
}
