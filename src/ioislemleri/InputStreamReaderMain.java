package ioislemleri;

//dosyadaki türkçe ya da herhangi bir dilden karakterleri okumamızı kolaylaştırır.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamReaderMain {
    public static void main(String[] args) {
        {
            try {
                FileInputStream input = new FileInputStream("print.txt");
                InputStreamReader inputReader = new InputStreamReader(input,"UTF8");

                int i = inputReader.read();
                while (i != -1) {
                    System.out.print((char)i);
                    i = inputReader.read();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
