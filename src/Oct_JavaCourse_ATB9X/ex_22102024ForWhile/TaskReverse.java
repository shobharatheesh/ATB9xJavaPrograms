package Oct_JavaCourse_ATB9X.ex_22102024ForWhile;

import java.util.Scanner;

public class TaskReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input  a number to reverse

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        //intialize the reverse variable
        int reverse = 0;

        //for loop to reverse the digits of the number

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;


        }

        System.out.println("The Reversed number is : " + reverse);
    }
}
