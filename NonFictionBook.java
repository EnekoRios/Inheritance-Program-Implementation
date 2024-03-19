public class NonFictionBook extends Book{
    private String topic;

    public NonFictionBook(String title, String author, int pages, double price, String topic) {
        super(title, author, pages, price);
        this.topic = topic;
    }
    public String getGenre(){return topic;}
    public void setGenre(String s){topic = s;}
    public String toString(){
        return super.getTitle() + " by " + super.getAuthor() + " is " + super.getPages() + " pages long, and is worth $"+ super.getPrice() + ". Topic: " + topic;
    }
}
