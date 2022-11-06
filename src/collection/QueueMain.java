package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> liste = new LinkedList<>();

        liste.add("Kaan");
        liste.add("Caki");

        //queue nin get metodu yoktur aradığımız şeyi tüm kuyruğu gezerek bulabiliriz.

        //indis numarası girersen silmez.Kuyruklarla gezdiğimiz için.
        //liste.remove("Caki");

        //element metodu kuyruğun başındaki elemanı bize verir
        liste.element();

        //poll kuyruktan çıkartır
        liste.poll();

        Iterator<String> itr = liste.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
