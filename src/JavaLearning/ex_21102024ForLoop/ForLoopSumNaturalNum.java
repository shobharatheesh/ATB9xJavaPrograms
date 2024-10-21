package JavaLearning.ex_21102024ForLoop;

import java.util.Scanner;

public class ForLoopSumNaturalNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Natural numbers are : ");

        //initialize sum variable
        int sum =0;

        //Loop to calculate the sum of numbers from 1 to N
        for(int i = 1 ; i<=num ;i++)
        {
            System.out.println(i);
            sum = sum+i;
        }

        System.out.println("Sum of the natural numbers from 1 to " + num + " is " +sum);

    }
}
