package ioislemleri;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("Audi","RS7");

        try {
            //burada bir file dosyası açtık ve c1 nesnemizi bu dosyanın içine koyduk.
            FileOutputStream outputFile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            //serileştirme (serialization) yapacağız.
            output.writeObject(c1);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
