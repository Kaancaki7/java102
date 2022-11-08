package ioislemleri;

//burada araba.txt dosyasına attığımız c1 nesnesini nasıl okuyacağımızı göreceğiz.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class CarInputMain {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("araba.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            //ekrana yazdırmak için;
            Car readCar = (Car) input.readObject();
            System.out.println(readCar.getBrand());
            System.out.println(readCar.getModel());

            inputFile.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
