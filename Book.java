public class Book {
    protected String title;
    protected String author;
    protected int yearPublished;
    protected int price;

    public Book (String title, String author, int yearPublished, int price) {
        this.title = title;
        this.author = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getBookInfo () {
        return title + " " + author + " " + yearPublished;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
    }

    public String printPrice() {
        return "Book: " + price;
    }
}
