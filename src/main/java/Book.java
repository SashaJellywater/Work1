
public class Book extends FundItem {

    private final String publisher;

    public Book(int itemID, String title, String author, String publicationYear, String publisher) {
        super(itemID, title, author, publicationYear);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getInfo() {
        return "Book: '" + getTitle()
                + "' автор " + getAuthor()
                +  " издательство " + publisher
                + " (ID: " + getItemID() + ")";
    }
}
