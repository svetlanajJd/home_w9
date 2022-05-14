package home_w9;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
