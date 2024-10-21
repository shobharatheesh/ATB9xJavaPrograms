package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerSqandCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input the number

        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        //Calculate the square and cube and print

        System.out.println("Square of the number: "+(num*num));
        System.out.println("Cube of the number : " + (num*num*num));

        sc.close();
    }
}
