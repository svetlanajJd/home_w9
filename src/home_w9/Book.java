package home_w9;

public class Book {
    private String title;
    private Author name;
    private Author surname;
    private int year;

    public Book(String title, Author name, int year) {
        this.title = title;
        this.name = name;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getName() {
        return this.name;
    }

    public Author getSurname() {
        return this.surname;
    }

    public void setYear(int year){
        this.year=year;
    }
}
