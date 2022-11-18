package week2;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    Book(String title, String author, String publisher, int copiesSold) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setCopiesSold(copiesSold);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }
}
