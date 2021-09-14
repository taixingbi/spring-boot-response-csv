package saks.inventory.model;

public class Book {
    private String title;
    private String description;
    private String author;
    private String publisher;
    private String isbn;
    private String publishedDate;
    private float price;

    public Book() {
    }

    public Book(String title, String description, String author, String publisher,
            String isbn, String publishedDate, float price) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.publishedDate = publishedDate;
        this.price = price;
    }
}