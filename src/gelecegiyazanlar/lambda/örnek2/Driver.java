package gelecegiyazanlar.lambda.örnek2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Hello hello = () -> "Merhaba";

        System.out.println(hello.hi());

        System.out.println("------------------");

        Hello2 hello2 = (s) -> "Merhaba" + s;
        System.out.println(hello2.selam(" Kaan"));

        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);
        Sum sum = (x,y) -> "Girdiğiniz sayilarin toplamlari : " + (Integer.parseInt(x) + Integer.parseInt(y));
        System.out.println(sum.topla(sc.nextLine(),sc.nextLine()));
    }
}
