package ioislemleri;

import java.io.*;

//BufferedStream sınıfının FileStream sınıfından farkı yok sadece hızlandırıyor ve destekliyor.
//isminden de anlaşılacağı gibi bufflıyor bir nevi.

public class BufferedStreamMain {
    public static void main(String[] args) {
        /*
        try {
            FileInputStream fileInput = new FileInputStream("kaan.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            //sadece buffInputa attık fileInputu ve aynı işemleri onun üzerinden devam ettik.
            int i = buffInput.read();
            while (i != -1) {
                System.out.print((char)i);
                i = buffInput.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */


        //output kısmı :
        String data = "\nbuffered orneginden geldim.";
        try {
            FileOutputStream fileOutput = new FileOutputStream("kaan.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);

            byte[] byteArray = data.getBytes();

            buffOutput.write(byteArray);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
