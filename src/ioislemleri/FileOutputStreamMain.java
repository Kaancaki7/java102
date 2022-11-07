package ioislemleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain {
    public static void main(String[] args) {
        String yazi = " Output calisiyorum.";
        try {
            FileOutputStream output = new FileOutputStream("kaan.txt",true);
            //aşağıda string olan yazi nesnesini byte diziye dönüştürdük kaan.txt ye aktarmak için
            byte[] yaziByte = yazi.getBytes();
            //kaan.txt write komutu ile gönderecegiz 'yazi' nesnesini.
            output.write(yaziByte);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
