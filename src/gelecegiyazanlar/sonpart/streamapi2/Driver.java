package gelecegiyazanlar.sonpart.streamapi2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {

        //streamlerle primity typlerın kullanımı

        //1 den 10'a kadar olan bir int range belirledik ve forEach döngüsü ile sayıları bastırdık
        IntStream.range(1,10)
                .forEach(System.out::println);

        //stream içine bir array verip değerlerini 2 ile çarpıp ortalamalarını bastıralım.
        Arrays.stream(new int[] {1,2,3,4,5,6})
                .map((x)->x*2)
                //average metodu dizinin ortalamasını alır
                .average()
                //ifPresent eger bir geri dönüş varsa bunu ekrana yazdırır.
                .ifPresent(System.out::println);

        //sum metodunu inceleyelim
        int topla = IntStream.range(1,101)
                .sum();

        System.out.println(topla);


        //object streamlerden primity streamlere dönüşüm yapmak istersek;
        Stream.of("1","2","3","4")
                //Int'e çevirdik içeride metot referansını kullandık.
                .mapToInt(Integer::parseInt)
                //max metodu ile en yüksek sayıyı bulduk
                .max()
                .ifPresent(System.out::println);

        //primity streamlerden object streamlere dönüşüm yapmak istersek;
        IntStream.range(1,10)
                //object veriye çevrildi
                .mapToObj((i)->i)
                .forEach(System.out::println);
    }
}
