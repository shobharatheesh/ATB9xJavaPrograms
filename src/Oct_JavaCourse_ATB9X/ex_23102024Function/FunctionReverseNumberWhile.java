package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionReverseNumberWhile {

    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        //performing the actions
        System.out.println("The reverse number is : " +reverse(num) );

    }

    public static int reverse(int num) {

        int reverse =0;

        while(num!=0)
        {
            int remainder = num%10;
            reverse = reverse* 10 + remainder;
            num =num/10;
        }

        return reverse;

    }
}
