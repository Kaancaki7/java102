package gelecegiyazanlar.sonpart.streamapi;

import java.util.Arrays;

public class Driver3 {
    public static void main(String[] args) {


        //Streamler dizilerle de kullanabiliyordu. Dizilerle de kullanalım.

        int[] numbers = {1,2,3,4,5,6,7};

        Arrays.stream(numbers)
                .filter((x)-> x > 3)
                .map((x)-> x*2)
                //sorted metodunda büyükten küçüğe sıralamak istersen compareTo metodu ile x1 ve x2 yerlerini değiştir.
                //sorted((x,x1)-> x.compareTo(x1)) gibi
                .sorted()
                .forEach(System.out::println);
    }
}
