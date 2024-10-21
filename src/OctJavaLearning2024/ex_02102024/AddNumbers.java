package OctJavaLearning2024.ex_02102024;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        //create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter the first number
        System.out.println("Enter the first number: ");
        int  num1 = scanner.nextInt();

        //Ask user to enter the second number
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        //Add the numbers

        int sum = num1 + num2;

        //Display the result
        System.out.println("The sum of " + num1 + " and " +num2 + " is "+sum);


    }

}
