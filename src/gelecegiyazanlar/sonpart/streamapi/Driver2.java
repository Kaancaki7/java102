package gelecegiyazanlar.sonpart.streamapi;

import java.util.ArrayList;

public class Driver2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("İstanbul");
        arrayList.add("Ankara");
        arrayList.add("Antalya");
        arrayList.add("İzmir");
        arrayList.add("Isparta");

        //her işlem uygulayacağımızda yeni bir stream nesnesi oluşturmak yerine(bir önceki driver'da stream1 stream2 gibi...) peşpeşe yapabiliriz.

        arrayList.stream()
                .filter((s) -> s.startsWith("A"))
                .map((s) -> s.toUpperCase())
                .sorted((s1,s2) -> s1.compareTo(s2))
                .forEach(System.out::println);

        //Driver class'ındaki çıktının aynısını verecektir. Kod ne kadar kısaldı.
    }
}
