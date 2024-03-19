public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String s) {
        title = s;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String s) {
        author = s;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int s) {
        pages = s;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double s) {
        price = s;
    }
    public String toString(){
        return title + " by " + author + " is " + pages + " pages long, and is worth $"+ price + ".";
    }
}
