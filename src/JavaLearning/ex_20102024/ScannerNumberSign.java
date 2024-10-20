package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerNumberSign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input a number
        System.out.println("Enter the number : ");
        double num = sc.nextDouble();

        //Check if number is positive , negative and zero

        if(num>0){
            System.out.println("The is positive number");
    }
        else if(num<0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}
