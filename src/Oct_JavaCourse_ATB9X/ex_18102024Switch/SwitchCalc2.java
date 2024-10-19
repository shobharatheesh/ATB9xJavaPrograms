package Oct_JavaCourse_ATB9X.ex_18102024Switch;

import java.util.Scanner;

public class SwitchCalc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        double num1 = sc.nextDouble();

        System.out.println("enter the value of num2: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation: ");
        char op = sc.next().charAt(0); // enter the char value

        switch(op)
        {

            case '+':
                System.out.println("Addition is : "+(num1+num2));
                //System.out.println(num1+num2);
                break;

            case '-':
                System.out.println("Subtraction is : "+ (num1-num2));
                //System.out.println(num1*num2);
                break;

            case '*':
                System.out.println("Multiplication is: " +(num1*num2));
                //System.out.println(num1*num2);
                break;

            case '/':
                System.out.println("Division: " +(num1/num2));
                //System.out.println(num1/num2);
                break;

            case '%':
                System.out.println("Modulo is: " +(num1%num2));
                //System.out.println(num1%num2);
                break;

            default:
                System.out.println("Invalid value");
                break;
        }
            sc.close();
    }
}
