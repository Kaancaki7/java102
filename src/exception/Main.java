package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 20;
        int c;
        try{
            System.out.println("program başladı");
            System.out.println(b / a);
            c = sc.nextInt();
        }catch (ArithmeticException e) {
            System.out.println("sayı sıfıra bölünemez!");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("yanlış veri girildi");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kısım ne olursa olsun çalışacak!");
        }
    }

}
