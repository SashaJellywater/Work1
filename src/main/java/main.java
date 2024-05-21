import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        List<LibraryItem> libraryItems = new ArrayList<>();

        // Добавление книг
        libraryItems.add(new Book(1, "Война и мир", "Лев Толстой", "1869", "Москва"));
        libraryItems.add(new Book(2, "Преступление и наказание", "Федор Достоевский", "1866", "Санкт-Петербург"));
        libraryItems.add(new Book(3, "Мастер и Маргарита", "Михаил Булгаков", "1966", "Москва"));

        // Добавление журналов
        libraryItems.add(new Journal(4, "Вокруг Света", "2020"));
        libraryItems.add(new Journal(5, "Наука и Жизнь", "2022"));
        libraryItems.add(new Journal(6, "Cosmopolitan", "2020"));

        // Добавление писем
        libraryItems.add(new Letter(7, "Личное послание", "Анна Каренина"));
        libraryItems.add(new Letter(8, "Конфиденциальное уведомление", "Иван Иванов"));
        libraryItems.add(new Letter(9, "Секретное письмо", "Екатерина Смирнова"));

        // Добавление газет
        libraryItems.add(new Newspaper(10, "Известия", "2024"));
        libraryItems.add(new Newspaper(11, "Комсомольская правда", "2024"));
        libraryItems.add(new Newspaper(12, "Аргументы и факты", "2024"));

        // Добавление видеофильмов
        libraryItems.add(new VideoFilm(13, "Хроники города Питера", "Реж. Алексей Смирнов"));
        libraryItems.add(new VideoFilm(14, "Великая Отечественная война. Документальные хроники", "Реж. Иван Петров"));
        libraryItems.add(new VideoFilm(15, "История образования в России", "Реж. Екатерина Иванова"));

        // Инициализация класса LibrarySearch
        LibrarySearch librarySearch = new LibrarySearch(libraryItems);

        // Поиск по названию
        List<LibraryItem> resultsByTitle = librarySearch.searchByTitle("Хроники города Питера");
        System.out.println("Результаты поиска по названию:");
        for (LibraryItem item : resultsByTitle) {
            System.out.println(item.getInfo());
        }

        // Поиск по автору
        List<LibraryItem> resultsByAuthor = librarySearch.searchByAuthor("Лев Толстой");
        System.out.println("\nРезультаты поиска по автору:");
        for (LibraryItem item : resultsByAuthor) {
            System.out.println(item.getInfo());
        }

        //Поиск по дате публикации
        List<LibraryItem> resultsByYear = librarySearch.searchByPublicationDate("2020");
        System.out.println("\nРезультаты поиска по году публикации:");
        for (LibraryItem item : resultsByYear) {
            System.out.println(item.getInfo());
        }
    }
}
