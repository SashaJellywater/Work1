public class VideoFilm extends FundItem {

    private static final String noPublicationYear = null;

    public VideoFilm(int itemID, String title, String author) {
        super(itemID, title, author, noPublicationYear);
    }

    @Override
    public String getInfo() {
        return "VideoFilm: '" + getTitle()
                + "' автора " + getAuthor()
                + " (ID: " + getItemID() + ")";
    }
}
