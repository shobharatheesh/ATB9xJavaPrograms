package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerSwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input two numbers

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        //swap numbers:

        int temp = num1;

        num1 = num2;
        num2  =temp;

        //Display the result

        System.out.println("After swapping: ");
        System.out.println("First num : " +num1);
        System.out.println("Second num: " +num2);

        sc.close();



    }
}
