package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {

        //PriorityQueue kuyruklarda sıralama yapmamızı sağlarlar.
        //Queue de olan metodların hepsi burada da geçerli

        //istediğimiz sıralamayı yapmak için nested konusundaki anonim sınıfından yararlandık
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Kaan");
        q.add("Caki");
        q.add("Java");
        q.add("102");

        //Görüldüğü gibi isme göre sıralama yaptık farklı sınıf açmak yerine yukarıda anonim kullandık.
        Iterator<String> itr = q.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
