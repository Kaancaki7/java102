package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        //sıralama girdiğimiz gibi olucak fakat tekrarı engelleycek yine 10 bir kere yazılacak.
        lSet.add(10);
        lSet.add(20);
        lSet.add(10);
        lSet.add(30);

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
