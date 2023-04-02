package exercise_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book{
    Scanner scanner = new Scanner(System.in);
    private int bookCode;
    private String name;
    private Double price;
    private String author;

    public Book() {
    }

    public Book(int bookCode, String name, Double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%4d %20s %10f %20s ", bookCode,name, price, author);
    }

}
