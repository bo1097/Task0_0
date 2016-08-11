/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author bo1097
 */
public class Book {
    
    private String name;
    private String author;
    private String publish;
    private int year;
    private int page;
    private int price;
    private String cover;

    public Book(String name, String author, String publish, int year, int page, int price, String cover) {
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.page = page;
        this.price = price;
        this.cover = cover;
    }

   

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", publish=" + publish + ", year=" + year + ", page=" + page + ", price=" + price + ", cover=" + cover + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    
    
    
}
