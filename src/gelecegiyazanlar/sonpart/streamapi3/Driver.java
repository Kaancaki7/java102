package gelecegiyazanlar.sonpart.streamapi3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Ogrenci> arrayList = new ArrayList<>();

        arrayList.add(new Ogrenci(1,"Kaan",23));
        arrayList.add(new Ogrenci(2,"Faki",22));
        arrayList.add(new Ogrenci(3,"Kadan",12));

        List<Ogrenci> collect = arrayList.stream()
                .filter((o)->o.getIsim().startsWith("K"))
                //collect metodu stream üzerinden dönen değerleri list , set veya map olarak bize geri döndürür.
                .collect(Collectors.toList());

        collect.forEach(System.out::println);



    }
}
