public class Letter extends FundItem {

    private static final String noPublicationYear = null;

    public Letter(int itemID, String title, String author) {
        super(itemID, title, author, noPublicationYear);
    }

    @Override
    public String getInfo() {
        return "Letter: '" + getTitle()
                + "' автора " + getAuthor()
                + " (ID: " + getItemID() + ")";
    }
}
