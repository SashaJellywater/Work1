
public class Journal extends FundItem{

    private static final String noAuthor = null;
    public Journal(int itemID, String title, String publicationYear) {
        super(itemID, title, noAuthor, publicationYear);
    }

    @Override
    public String getInfo() {
        return "Journal: '" + getTitle()
                +"' год публикации " + getPublicationYear()
                + " (ID: " + getItemID() + ")";
    }
}
