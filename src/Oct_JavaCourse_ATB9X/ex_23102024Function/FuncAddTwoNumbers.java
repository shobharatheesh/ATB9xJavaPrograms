package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FuncAddTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        //Performing the addition

        System.out.println("sum: " +sum(a,b));

        sc.close();
    }

    public static int sum(int a ,int b) {
        return a+b;


    }
}
