package booksorter;
import booksorter.Book;

import java.util.TreeSet;
import java.util.Comparator;
public class BookSorter {

    public static void main(String[] args) {
        Book b1 = new Book("Deadpool",200,"Stan Lee",1995);
        Book b2 = new Book("X-men",178,"Stan Lee",2000);
        Book b3 = new Book("Doctor Strange",267,"Stan Lee",2001);
        Book b4 = new Book("Spider man",456,"Stan Lee",2004);
        Book b5 = new Book("Guardians of the galaxy",367,"Stan Lee",1976);

        TreeSet<Book> books = new TreeSet<Book>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for (Book b : books) {
            System.out.println("Book name: " + b.getBookName() + "\t-\t" +
                    "Page Number: " + b.getPageNumber() + "\t-\t" +
                    "Writer Name: " + b.getWriterName() + "\t-\t" +
                    "Publication Year: " + b.getPublicationYear());
        }

        System.out.println("--------------------------------------------------------------------------------");

        TreeSet<Book> book = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        book.add(b5);

        for (Book pn : book) {
            System.out.println("Book name: " + pn.getBookName() + "\t-\t" +
                    "Page Number: " + pn.getPageNumber() + "\t-\t" +
                    "Writer Name: " + pn.getWriterName() + "\t-\t" +
                    "Publication Year: " + pn.getPublicationYear());
        }
        }

    }


