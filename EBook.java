public class EBook extends Book{
    private double fileSizeMB;
    private String fileFormat;

    public EBook (String title, String author, int yearPublished, int price, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished, price);
        this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;
    }

    public EBook (String title, String author, int yearPublished, int price, String fileFormat) {
        super(title, author, yearPublished, price);
        this.fileFormat = fileFormat;
    }

    public EBook (String title, String author, int yearPublished, int price, double fileSizeMB) {
        super(title, author, yearPublished, price);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getBookInfo () {
        return super.getBookInfo() + " " + fileSizeMB + " " + fileFormat + " " + price;
    }

    @Override
    public void printBookDetails () {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("File format: " + fileFormat);
        System.out.println("File size MB: " + fileSizeMB);
        System.out.println("Price: " + price);
    }

    @Override
    public String printPrice () {
        return "EBook: " + price / 2;
    }
}
