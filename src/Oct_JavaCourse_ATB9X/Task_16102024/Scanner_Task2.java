package Oct_JavaCourse_ATB9X.Task_16102024;

import java.util.Scanner;

public class Scanner_Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second num: ");
        int num2 = sc.nextInt();

        int result = (num1>num2) ? num1 : num2;

        System.out.println("The Largest number is : " + result);



    }
}
