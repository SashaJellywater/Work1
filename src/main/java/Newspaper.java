public class Newspaper extends FundItem {

    private static final String noAuthor = null;

    public Newspaper(int itemID, String title, String publicationYear) {
        super(itemID, title, noAuthor, publicationYear);
    }

    @Override
    public String getInfo() {
        return "Newspaper: '" + getTitle()
                +"' год публикации" + getPublicationYear()
                + " (ID: " + getItemID() + ")";
    }
}
