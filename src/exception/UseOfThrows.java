package exception;

import java.util.Scanner;

public class UseOfThrows {

    //throws ile dahil ediyoruz kalıtım gibi.
    public static void checkAge(int age) throws Exception{
        if (age < 18) {
            throw new Exception("you are not old enough");
        }
        System.out.println("age appropriate");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch(Exception e) {
            System.out.println("you are not old enough");
        }

        System.out.println("the program is over");
    }
}
