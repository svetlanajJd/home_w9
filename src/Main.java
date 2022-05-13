import home_w9.Author;
import home_w9.Book;

public class Main {
    public static void main(String[] args) {
        String[] title = {"Война и мир", "Евгений Онегин"};

        Author lev = new Author("Лев", "Толстой");
        Author Alexander = new Author("Александр", "Пушкин");

        int[] year = {1996, 1992};

        Book WarAndPeace = new Book("Война и мир ", lev, 1996);
//        System.out.print(WarAndPeace.getTitle());
//        System.out.println(WarAndPeace.getYear());

        Book EvgenyOnegin = new Book("Евгений Онегин ", Alexander, 1992);
//        System.out.print(EvgenyOnegin.getTitle());
//        System.out.println(EvgenyOnegin.getYear());
       EvgenyOnegin.setYear(1985);
//        System.out.println(EvgenyOnegin.getYear());
    }
}