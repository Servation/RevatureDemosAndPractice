package com.revature.Day2;

public class Demo6 {
    public static void main(String[] args) {
        Book book1 = new Book("learn java in 24 hours", "Mark Smith", 100);
        System.out.println(book1);
        Book book2 = new Book("Title 2", "Author 2", 200);
        System.out.println(book2);
    }
}

class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
