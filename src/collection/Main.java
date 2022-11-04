package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);

        System.out.println(hSet.size()); //liste boyutunu verir.
        System.out.println(hSet.isEmpty()); //listenin boş olup olmadığını sorgular.
        System.out.println(hSet.contains(20)); //listenin içinde 20 var mı diye sorgular.
        hSet.remove(10); // listedeki 10 değerini silmemizi sağlar
        //hSet.clear(); //listenin içini tamamen silebiliriz

        //liste içinde for-each dönügüsü ile gezdik.
        for (Integer sayi : hSet) {
            System.out.println(sayi);
        }

        //listeleri Iterator ile de gezebiliriz.
        Iterator<Integer> itr = hSet.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
