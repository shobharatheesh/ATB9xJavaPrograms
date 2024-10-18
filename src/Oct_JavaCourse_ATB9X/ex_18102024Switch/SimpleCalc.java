package Oct_JavaCourse_ATB9X.ex_18102024Switch;

import java.util.Scanner;

public class SimpleCalc {

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

        //perform the operation based on user input

        switch (result) {
            case 1 -> System.out.println("Result: " + (num1 + num2));
            case 2 -> System.out.println("Result: " + (num1 - num2));
            case 3 -> System.out.println("Result: " + (num1 * num2));
            case 4 -> {
                // Check for division by zero
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            case 5 -> System.out.println("Result: " + (num1 % num2));
            default -> System.out.println("Invalid choice! Please select a valid operation.");
        }

        sc.close(); //close the scanner
    }
}
