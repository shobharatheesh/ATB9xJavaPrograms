package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        //performing factorial

        System.out.println("Factorial of the number is : " + fact(a));

    }

    public static int fact(int a) {

        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
