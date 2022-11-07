package ioislemleri;

import java.io.File;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {

        File dosya = new File("kaan.txt");
        try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " oluşturuldu!");
            }
            else {
                System.out.println(dosya.getName() + " zaten mevcut!");
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //dosyayı siler
        dosya.delete();

        //bir dizinin içindeki klasör gibi şeyleri gezebiliriz
        File d1 = new File("src");

        String[] liste = d1.list();

        for (String str : liste) {
            System.out.println(str);
        }

        //mkdir yeni dizin oluşturmaya yarar mkdirs dizin ve alt dizin oluşturur.

        File d2 = new File("ioislemleri/mkdirolusturdu");

        System.out.println(d2.mkdirs());

    }
}
