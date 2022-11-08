package ioislemleri;

import java.io.*;

public class BufferedReaderAndWriterMain {
    public static void main(String[] args) {

        String data = "biz bu java'dan anlıyoruz!";

        try {
            FileReader readFile = new FileReader("output.txt");
            BufferedReader buffRead = new BufferedReader(readFile);

            //satır satır yazdırabiliriz line özelliği sayesinde
            String line = buffRead.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffRead.readLine();
            }

            //writer kısmına bakalım ;
            FileWriter writerFile = new FileWriter("output.txt",true);
            BufferedWriter buffWriter = new BufferedWriter(writerFile);
            buffWriter.write(data);

            buffWriter.close();
            buffRead.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
