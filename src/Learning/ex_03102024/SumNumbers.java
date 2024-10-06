package Learning.ex_03102024;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("sum: " + sum);



    }
}
