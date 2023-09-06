import java.util.ArrayList;
import java.util.List;


public class LibrarySearch {
    private List<LibraryItem> libraryItems;

    public LibrarySearch(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public List<LibraryItem> searchByTitle(String title) {
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                results.add(item);
            }
        }
        return results;
    }

    public List<LibraryItem> searchByAuthor(String author) {
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getAuthor() != null && item.getAuthor().equalsIgnoreCase(author)) {
                results.add(item);
            }
        }
        return results;
    }

    public List<LibraryItem> searchByPublicationDate(String publicationYear) {
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getPublicationYear() != null && item.getPublicationYear().equalsIgnoreCase(publicationYear)) {
                results.add(item);
            }
        }
        return results;
    }
}
