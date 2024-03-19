public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int pages, double price, String genre) {
        super(title, author, pages, price);
        this.genre = genre;
    }
    public String getGenre(){return genre;}
    public void setGenre(String s){genre = s;}
    public String toString(){
        return super.getTitle() + " by " + super.getAuthor() + " is " + super.getPages() + " pages long, and is worth $"+ super.getPrice() + ". Genre: " + genre;
    }
}
