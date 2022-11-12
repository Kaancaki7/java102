package javaexercises.chapter1;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Write a program that displays the following table:

        a       a^2     a^3
        1       1       1
        2       4       8
        3       9       27
        4       16      64
         */

        int a = 1;
        System.out.println("a\t\ta^2\t\ta^3");
        System.out.println("-----------------------");
        while (a <= 4) {
            System.out.println(a + "\t\t" + a * a + "\t\t" + a * a * a);
            a++;
        }

    }
}
