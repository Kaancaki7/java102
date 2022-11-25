package gelecegiyazanlar.sonpart;

public class Driver {
    public static void main(String[] args) {

        //lambda ifadesi anonim sınıfla aynı işi yapıyor fakat daha kolay ve daha anlaşılır ve daha kısa.
        SayiOlustur sayiOlustur = () -> 15.0;

        System.out.println(sayiOlustur.olustur());
    }
}
