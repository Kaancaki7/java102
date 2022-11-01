package Varargs;


public class Main{

    public static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    //overloading
    public static double add(double... numbers) {
        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(12,23,56,76,-4,11,5));
        System.out.println(add(12,24));
        System.out.println(add(2.4,7.5,9.1));
    }

}
