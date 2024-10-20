package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input three numbers
        System.out.println("Enter the First number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the Second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the Third number: ");
        double num3 = sc.nextDouble();

        //Find the Largest of three numbers

       double largest = num1;

       if(num2 > largest)
       {
           largest = num2;
       }

       if(num3 > largest){

           largest = num3;
       }

        System.out.println("The Largest of three numbers : "+largest);

       sc.close();

    }
}