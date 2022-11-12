package javaexercises.chapter2;


import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final double POUND_PER_KG = 2.204;
        final double CENTIMETERS_PER_INCH = 0.3937;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in Kg");
        double weight = sc.nextDouble();

        System.out.println("Enter height in Cm");
        double height = sc.nextDouble();

        double weightPound = weight * POUND_PER_KG;
        double heightInch = height * CENTIMETERS_PER_INCH;

        double bmi = weight / (height * height);
        System.out.println("your weight : " + weightPound + " pound\nyour height : " + heightInch + " inch\nyour BMI : " + bmi);

        if (bmi < 18.5) {
            System.out.println("underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
