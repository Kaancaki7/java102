package Encapsulation;

import java.sql.SQLOutput;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber > 0) {
            this.pageNumber = pageNumber;
        }
        else {
            System.out.println("sayfa sayısı 0 dan küçük olamaz.");
            this.pageNumber = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
