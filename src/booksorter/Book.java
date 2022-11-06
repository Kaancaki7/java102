package booksorter;

public class Book implements Comparable<Book> {
    private final String bookName;
    private final int pageNumber;
    private final String writerName;
    private final int publicationYear;

    public Book(String bookName, int pageNumber, String writerName, int publicationYear) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.bookName);
    }
}
