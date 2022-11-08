package ioislemleri;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderAndWriterMain {
    public static void main(String[] args) {
        String data = "File writer Kullanacağım";
        try {
            FileReader readFile = new FileReader("output.txt", Charset.forName("UTF8"));
            FileWriter writerFile = new FileWriter("kaan.txt");
            writerFile.write(data);
            int i = readFile.read();
            while(i != -1) {
                System.out.print((char)i);
                i = readFile.read();
            }

            writerFile.close();
            readFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
