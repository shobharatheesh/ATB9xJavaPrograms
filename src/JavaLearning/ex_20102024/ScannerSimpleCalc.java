package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerSimpleCalc {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        //input two numbers

        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();

        //perform arithmetic operation
        System.out.println("Addition: " +(num1+num2));
        System.out.println("Subtraction: " +(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulo: "+(num1%num2));

        sc.close();

    }
}
