package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        //performing functions or calling functions

        if(primeNum(num))
        {
            System.out.println(num + " is a prime number");

        }
        else
        {
            System.out.println(num + " is not a prime number");
        }

    }
    public static boolean primeNum(int num) {

        //edge cases , number less than 2 are not prime

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
