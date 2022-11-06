package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<>();

        liste.add("Kaan");
        liste.add("Caki");
        liste.add("Java");
        liste.add("102");


        //Arraylistteki metotlar burada da kullanılır.

        //remove metodu silmeyi sağlar yine index no veya direkt silmek istediğini yazabilirsin
        liste.remove("102");

        Iterator<String> itr = liste.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
