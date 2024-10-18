package Oct_JavaCourse_ATB9X.ex_18102024Switch;

import java.util.Scanner;

public class SimpleCalc1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input two numbers
        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        //input the operation choice

        System.out.println("Choose an operation : ");
        System.out.println("1.Addition (+)");
        System.out.println("2.Subtraction (-)");
        System.out.println("3.Multiplication (*)");
        System.out.println("4.Division (/)");
        System.out.println("5.Modulus (%)");


        int result = sc.nextInt();

        switch (result) {
            case 1 -> System.out.println("Result: " + (num1 + num2));
            case 2 -> System.out.println("Result: " + (num1 - num2));
            case 3 -> System.out.println("Result: " + (num1 * num2));
            case 4 -> System.out.println("Result: " + (num1 / num2));
            case 5 -> System.out.println("Result: " + (num1 % num2));
            default -> System.out.println("Invalid result");
        }
    }
}
