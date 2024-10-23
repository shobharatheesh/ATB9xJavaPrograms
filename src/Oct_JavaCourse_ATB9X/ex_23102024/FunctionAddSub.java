package Oct_JavaCourse_ATB9X.ex_23102024;

import java.util.Scanner;

public class FunctionAddSub {

    //Function for addition

    public  static int sum(int a , int b) {           //with parameter or arguments and return type
        return a + b;
    }

    //Function for Subtraction

    public static int sub(int a , int b) {
        return a - b;
    }

    //function for multiplication
    public static int mul(int a , int b) {
        return a * b;
    }

    //function for division
    public static double div(int a , int b) {
        if (b != 0) {
            return (double) a / b;
        } else
        {

            System.out.println("Division by zero is not allowed");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        //Performing operation

        System.out.println("sum: " +sum(a , b));
        System.out.println("sub: " +sub(a,b));
        System.out.println("mul: " +mul(a,b));
        System.out.println("div: "+div(a,b));

        sc.close();

    }
}

