package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input a number;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //calculate factorial
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }

        System.out.println("The factorial of the given number is : " +factorial);

        sc.close();
    }
}
