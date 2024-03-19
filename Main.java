public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book of Life", "me", 99999, 0.00);
        FictionBook book2 = new FictionBook("Harry Potter", "JKR", 435, 21.99, "magic and stuff");
        NonFictionBook book3 = new NonFictionBook("Dolphins", "Richard White", 157, 21.95, "freaking dolphins");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
