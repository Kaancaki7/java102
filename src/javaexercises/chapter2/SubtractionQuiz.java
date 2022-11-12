package javaexercises.chapter2;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);

        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }



        System.out.println(n1 + " - " + n2  + " =???");
        System.out.print("answer: ");
        int answer = sc.nextInt();

        if (answer == (n1 - n2)) {
            System.out.println("Your correct!");
        }
        else {
            System.out.println("your answer wrong.");
            System.out.println("answer : " + (n1 - n2) + "\nyour answer : " + answer);
        }
    }
}
