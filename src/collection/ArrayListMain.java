package collection;

import nested.Out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


//ArrayList'te kendini tekrar edens ayılar yazılır. HashSet'te yazılmıyordu mesela.
public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(40);
        liste.add(null);

        //liste boyutunu verir
        System.out.println(liste.size());

        //listemizi görüntüleyebiliriz.
        System.out.println(liste);

        //40 sayısı verir.
        System.out.println(liste.get(3));

        //indisin nerede olduğunu verir
        System.out.println(liste.indexOf(30));

        //dizide istediğin bir yerde EKLEME yapmanı sağlar
        liste.add(6,50);

        //dizide bir inidis DEĞİŞTİRMEK istersek set kullanırız
        liste.set(2,77);

        //contains aradığım değer listede var mı diye sorar
        System.out.println(liste.contains(77));

        //bir indisi silmek için remove kullanırız.
        liste.remove(1);

        //yazdığımız sırlama bozulmaz.
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //bir listeyi başka bir listeye aktarabiliyoruz.
        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2.addAll(liste);
        System.out.println(liste2);

        //bir listenin(dizinin) belli bi kısımdan belli bir kısıma olan tarafını alabilirz.
        List<Integer> liste3 = liste.subList(0 , 3);
        System.out.println(liste3);

        //clear tüm listeyi siler
        liste3.clear();
        System.out.println(liste3);

    }
}
