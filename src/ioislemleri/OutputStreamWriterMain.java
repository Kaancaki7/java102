package ioislemleri;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterMain {
    public static void main(String[] args) {
        String data = "ĞÜŞİ";
        try {
            FileOutputStream output = new FileOutputStream("output.txt");
            OutputStreamWriter writer = new OutputStreamWriter(output,"UTF8");
            writer.write(data);
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
