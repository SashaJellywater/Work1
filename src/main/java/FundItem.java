
public abstract class FundItem implements LibraryItem{

    protected int itemID;
    protected String title;
    protected String author;
    protected String publicationYear ;

    public FundItem(int itemID, String title, String author, String publicationYear ) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.publicationYear  = publicationYear;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public abstract String getInfo();
}
