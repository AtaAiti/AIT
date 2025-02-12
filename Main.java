public class Main {
    public static void main(String[] args) {
        Book printedBook1 = new PrintedBook("Java Programming", "James Gosling", 1995, 200, 500, "O'Reilly");
        System.out.println(printedBook1.getBookInfo());
        printedBook1.printBookDetails();

        PrintedBook printedBook2 = new PrintedBook("Clean Code", "Robert C. Martin", 2008, 300, 464, "Prentice Hall");
        printedBook2.printBook();

        Book eBook1 = new EBook("Effective Java", "Joshua Bloch", 2018, 100, 2.5, "PDF");
        System.out.println(eBook1.getBookInfo());
        eBook1.printBookDetails();

        System.out.println(printedBook1.printPrice());
        System.out.println(printedBook2.printPrice());
        System.out.println(eBook1.printPrice());

    }
}