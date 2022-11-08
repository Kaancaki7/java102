package ioislemleri;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) {

        String data = "printStream kullandık.";

        try {
            PrintStream output = new PrintStream("print.txt");
            output.println(data);
            output.println("Buraya da böyle yazabilirsin yaa...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
