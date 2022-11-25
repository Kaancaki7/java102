package gelecegiyazanlar.sonpart.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("İstanbul");
        arrayList.add("Ankara");
        arrayList.add("Antalya");
        arrayList.add("İzmir");
        arrayList.add("Isparta");


        Stream<String> stream = arrayList.stream();

        //filtreleme yapalım
        //stream ile filtrelediğimiz verileri stream2 ye aktardık.filter metodu başka streame dönüştürülebildi yani intermediate
        //burada anonim sınıfları kullandık.
        Stream<String> stream2 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });

        //burada da stream2 deki verileri map kullanarak büyük harfle yazdırdık ve stream3'ün içine attık.map metodu başka streame dönüştürülebildi yani intermediate
        Stream<String> stream3 = stream2.map(new Function<String,String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        //burada da stream3 teki verileri alfabetik sıraladık ve stream4 e aktardık. sorted metodu başka streame dönüştürülebildi yani intermediate
        Stream<String> stream4  = stream3.sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //forEach metodu ile stream4 içerisini gezmiş olduk. forEach metodu başka bir streame aktarlıamadı yani terminal(son) bir metotdur.
        stream4.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


    }
}
