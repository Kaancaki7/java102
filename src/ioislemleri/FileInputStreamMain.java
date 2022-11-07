package ioislemleri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("kaan.txt");
            //txt içi boşsa eğer program -1 döndürür.
            //byte byte okuduğu için alttaki kodda kaan.txt nin içinde yazan şeyin ilk harfin byte nosunu bastırıcak.
            int i = input.read();
           while (i != -1) {
               System.out.print((char)i);
               i = input.read();
           }
           input.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        //avaliable kullanımı:

        try{
            FileInputStream i1 = new FileInputStream("kaan.txt");
            System.out.println("Kullanılabilir byte sayısı : " + i1.available());
            i1.read();
            i1.read();
            i1.read();
            i1.read();
            System.out.println("Kullanılabilir byte sayısı : " + i1.available());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        //skip kullanımı:

        try {
            FileInputStream i2 = new FileInputStream("kaan.txt");

            //skip ilk "n" karateri atla demek
            i2.skip(10);

            int i = i2.read();
            while (i != -1) {
                System.out.print((char)i);
                i = i2.read();
            }
            i2.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

