package Pract_2;

public class Books {

    public static class Book{
        private String author;
        private Integer data;
        private String name;

        public Book(String author, Integer data, String name) {
            this.author = author;
            this.data = data;
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Book" +
                    "author='" + author + '\'' +
                    ", data=" + data +
                    ", author='" + name + '\'';
        }
    }

    public static class Bookshelf{
        private Book[] shelf = new Book[0];

        public Book[] getShelf() {
            return shelf;
        }

        public void setShelf(Book[] shelf) {
            this.shelf = shelf;
        }

        public void add_book(Book new_book){
            Book[] new_shelf = new Book[shelf.length + 1];
            System.arraycopy(shelf, 0, new_shelf, 0, shelf.length);
            new_shelf[shelf.length] = new_book;
            setShelf(new_shelf);
        }

        public String give_earliest(){
            String name = "Prikol";
            int max = -999999;
            for (Book kniga : shelf){
                if (max < kniga.data){
                    max = kniga.data;
                    name = kniga.name;
                }
            }
            return ("The oldest   Name: " + name + " |  Date: " + max + "\n");
        }
        public String give_oldest(){
            String name = "Prikol";
            int min = shelf[0].data;
            for (Book kniga : shelf){
                if (min > kniga.data){
                    min = kniga.data;
                    name = kniga.name;
                }
            }
            return ("The earliest   Name: " + name + " |  Date: " + min + "\n");
        }


    }
    public static void main (String[] args){
        Book book1 = new Book("Kolya", 0,"Jijnik)))))))");
        Book book2 = new Book("Artem", 200, "Dragon fal XXL with pomp");
        Book book3 = new Book("Author", 32, "prikol");
        Bookshelf newbooolshelf = new Bookshelf();
        newbooolshelf.add_book(book1);
        newbooolshelf.add_book(book2);
        newbooolshelf.add_book(book3);
        System.out.println(newbooolshelf.give_earliest() + newbooolshelf.give_oldest());
    }

}
