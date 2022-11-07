package ioislemleri;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamMain {
    public static void main(String[] args) {
        byte[] dizi = {1,2,3,4,54,66};

        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        System.out.println(input.available());

        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());

        System.out.println(input.skip(2));

        System.out.println("----------------------------------------");

        //dizinimn belli bir indisinden belli bir indisine kadar alabilirsin
        ByteArrayInputStream i2 = new ByteArrayInputStream(dizi,2,4);
        int i = i2.read();
        while (i != -1) {
            System.out.println(i);
            i = i2.read();
        }

        System.out.println("----------------------------------------");

        //OutputKullanımı
        String data = "java102 dersleri";

        ByteArrayOutputStream o1 = new ByteArrayOutputStream();

        byte[] dataByteArray = data.getBytes();

        try {
            o1.write(dataByteArray);
            String newData = o1.toString();
            System.out.println("Cikis akisi " + newData);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
