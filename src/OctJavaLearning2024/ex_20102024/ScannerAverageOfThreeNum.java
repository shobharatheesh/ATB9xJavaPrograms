package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerAverageOfThreeNum {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        //input three numbers
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        //calculate the average
        int avg = (num1 + num2 +num3)/3;

        System.out.println("Average of three numbers: "+avg);

    sc.close();

    }
}
