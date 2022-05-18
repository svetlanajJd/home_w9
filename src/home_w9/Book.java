package home_w9;

import java.util.Objects;

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

    public String toString() {
        int year1 = year;
        return title+" "+author+" "+year1;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return title.equals(book.title);
    }

    public int hashCode() {
        return Objects.hash(title);
    }
}
