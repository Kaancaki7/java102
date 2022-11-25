package gelecegiyazanlar.sonpart.thread;

import java.util.Date;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        //lambda ile kullandık thread fonk. yeni bir main gibi düşün main içinde main tarzı bir şey
        //Thread içinde kullanıcıdan alınan yazıyı büyük harfle döndüreceğiz
        //aynı zamanda main metodumuzda geçen zamanı sürekli bastıracağız while ile.
        Thread kullaniciGirisi = new Thread(() -> {
            while(true) {
                System.out.print("giris: ");
                String line = sc.nextLine();
                System.out.println(line.toUpperCase());
            }
        });
        kullaniciGirisi.start();


        while(true) {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }
}
