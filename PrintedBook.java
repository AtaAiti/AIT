public class PrintedBook extends Book{
    private int numberOfPages;
    private String publisher;

    public PrintedBook (String title, String author, int yearPublished, int price, int numberOfPages, String publisher) {
        super(title, author, yearPublished, price);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public PrintedBook (String title, String author, int yearPublished, int price, String publisher) {
        super(title, author, yearPublished, price);
        this.publisher = publisher;
    }

    public PrintedBook (String title, String author, int yearPublished, int price, int numberOfPages) {
        super(title, author, yearPublished, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getBookInfo () {
        return super.getBookInfo() + " " + numberOfPages + " " + publisher + " " + price;
    }

    @Override
    public void printBookDetails () {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
    }

    public void printBook () {
        System.out.println("The book is printing...");
    }

    @Override
    public String printPrice () {
        return "Printed book: " + price * 2;
    }
}
