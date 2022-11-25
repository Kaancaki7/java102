package gelecegiyazanlar.lambda.ornek3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
         for (int i = 0; i < kisiler.size(); i++) {
             Kisi kisi = kisiler.get(i);
             if (kisi.getCinsiyet().equals(cinsiyet)) {
                 System.out.println(kisi);
             }
         }
    }

    public static void yasaGoreFiltrele(List<Kisi> kisiler, int yas) {
        for (int i = 0; i < kisiler.size();i++) {
            Kisi kisi = kisiler.get(i);
            if (kisi.getYas() >= yas) {
                System.out.println(kisi);
            }
        }

    }

    //lambda ile filtreleme işlemi
    public static void kisiFiltrele(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {

        for (int i = 0; i < kisiler.size(); i++) {
            Kisi kisi = kisiler.get(i);
            if (kisiFiltresi.filtrele(kisi)) {
                System.out.println(kisi);
            }
        }
    }


    public static void main(String[] args) {

        Kisi kisi1 = new Kisi("Kaan", LocalDate.parse("1999-05-17"),"kaancaki0@gmail.com", Kisi.Cinsiyet.ERKEK);
        Kisi kisi2 = new Kisi("Faki", LocalDate.parse("2000-02-29"),"fakiylmz0@gmail.com", Kisi.Cinsiyet.KADIN);
        Kisi kisi3 = new Kisi("Kadan", LocalDate.parse("2000-09-12"),"kadan4cm0@gmail.com", Kisi.Cinsiyet.KADIN);

        ArrayList<Kisi> kisiler = new ArrayList<>();
        kisiler.add(kisi1);
        kisiler.add(kisi2);
        kisiler.add(kisi3);

        //cinsiyeri kadın oılanlar listelenecek.
        //cinsiyeteGoreFiltrele(kisiler, Kisi.Cinsiyet.KADIN);

        //yasa göre filtreler
        //yasaGoreFiltrele(kisiler,20);

        //kisi filtresi

        //Anonim class ile kullandık interface'i
        /*kisiFiltrele(kisiler, new KisiFiltresi() {
            @Override
            public boolean filtrele(Kisi kisi) {
                return kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
            }
        }); */

        //lambda ile kullanacağız.
        kisiFiltrele(kisiler,(kisi) -> kisi.getYas() > 15 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK));

    }
}
