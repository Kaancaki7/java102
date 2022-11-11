package othertopics;

public class TypeConversions {
    public static void main(String[] args) {
        //widening casting -> otomatik veri dönüşümleri siralamasi :
        //byte -> short -> char -> int -> long -> float -> double
        int a = 10;
        double b = a;
        System.out.println(b);

        //narrowing casting -> manuel olarak veri dönüştürebiliriz.
        double pi = 3.14;
        System.out.println((int)pi);

        //Integerden -> Stringe dönüştürmede ;
        String str = String.valueOf(a);
        System.out.println(str);

        //String -> Integer ;
        int c = Integer.parseInt(str);
        System.out.println(c);
    }
}
