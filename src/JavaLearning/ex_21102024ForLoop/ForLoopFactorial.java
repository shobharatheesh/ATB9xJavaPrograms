package JavaLearning.ex_21102024ForLoop;

import java.util.Scanner;

public class ForLoopFactorial {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1 ; i<= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factotial of the number is : "+fact);

        sc.close();
    }
}
