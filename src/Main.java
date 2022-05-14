import home_w9.Author;
import home_w9.Book;

public class Main {
    public static void main(String[] args) {
        String[] title = {"Война и мир", "Евгений Онегин"};
        Author lev = new Author("Лев", "Толстой");
        Author alexander = new Author("Александр", "Пушкин");
        int[] year = {1996, 1992};
        Book WarAndPeace = new Book("Война и мир ", lev, 1996);
        Book EvgenyOnegin = new Book("Евгений Онегин ", alexander, 1992);

        EvgenyOnegin.setYear(1985);
    }
}