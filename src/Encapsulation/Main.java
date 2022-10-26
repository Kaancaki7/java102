package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter",150);
        Book lordOfTheRings = new Book("Lord of The Rings",300);

        System.out.println(harryPotter.getName());
        harryPotter.setPageNumber(200);
        System.out.println("harry potter yeni sayfa sayısı:" + harryPotter.getPageNumber());
        lordOfTheRings.setPageNumber(-300);

    }
}
